package extensions

import org.gradle.api.Project
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.UsesKotlinJavaToolchain
import projectLibs

fun Project.setJVMToolChain() {
    val service = project.extensions.getByType<JavaToolchainService>()
    val customLauncher = service.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(projectLibs.versions.java))
    }
    project.tasks.withType<UsesKotlinJavaToolchain>().configureEach {
        kotlinJavaToolchain.toolchain.use(customLauncher)
    }
}
