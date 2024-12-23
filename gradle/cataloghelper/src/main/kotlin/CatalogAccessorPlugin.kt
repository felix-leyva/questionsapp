import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.the

class CatalogAccessorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.dependencies.add(
            "implementation",
            project.files(project.the<LibrariesForLibs>().javaClass.superclass.protectionDomain.codeSource.location)
        )

        project.tasks.register<CatalogAccessor>("generateCatalogAccessor") {
            project.layout.buildDirectory
                .file("generated-sources/kotlin-dsl-plugins/kotlin/AccessorExtension.kt")
                .let(outputFile::set)

            catalogName.set("libs")
        }

        project.tasks.named("compileKotlin").configure {
            dependsOn("generateCatalogAccessor")
        }
    }
}

abstract class CatalogAccessor : DefaultTask() {
    @get:Input
    abstract val catalogName: Property<String>

    @get:OutputFile
    abstract val outputFile: RegularFileProperty

    init {
        group = "build"
        description = "Generates a type-safe access to the version catalog inside the buildSrc"
    }

    @TaskAction
    fun generate() {
        val generatedCode = FileSpec.builder("", "AccessorExtension").addImport("org.gradle.kotlin.dsl", "the")
            .addProperty(
                PropertySpec.builder("libs", LibrariesForLibs::class).receiver(Project::class)
                    .getter(
                        FunSpec.getterBuilder().addStatement("return the<LibrariesForLibs>()")
                            .build()
                    ).build()
            ).build()
        outputFile.asFile.get().writeText(generatedCode.toString())
    }
}
