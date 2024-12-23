import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.register

/**
 * A plugin that generates a type-safe access to the version catalog inside the buildSrc and
 * convention plugins modules.
 * Solves: https://github.com/gradle/gradle/issues/15383
 */
class CatalogHelperPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create<CatalogHelperExtension>("catalogHelper")
        project.tasks.register<TypeSafeCatalogTask>("generateTypeSafeCatalog") {
            catalogName.convention("libs")
            project.layout.buildDirectory
                .file("generated-sources/kotlin-dsl-plugins/kotlin/GeneratedCatalog.kt")
                .let(generatedSourcesFile::convention)
        }

        project.tasks.named("compileKotlin").configure {
            dependsOn("generateTypeSafeCatalog")
        }
    }
}

interface CatalogHelperExtension {
    /**
     * The name of the version catalog to generate a type-safe access for.
     */
    val catalogName: Property<String>

    /**
     * The location of the generated source file. It should be located inside a source set so
     * it can be compiled by the Kotlin compiler and used by other files.
     */
    val generatedSourcesFile: RegularFileProperty
}
