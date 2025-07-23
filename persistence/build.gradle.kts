import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id(libs.plugins.kotlinMultiplatform.get().pluginId)
    id("gs-android-library")
    id(libs.plugins.kotlinxSerialization.get().pluginId)
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    jvm("desktop")

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "persistence"
            isStatic = true
        }
    }

    js {
        browser()
        binaries.executable()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.kstore)
            implementation(libs.koin.core)
            implementation(libs.ktor.serialization.kotlinx.json)
            implementation(libs.kotlinx.io)
            implementation(project(":shared"))
        }

        androidMain.dependencies {
            implementation(libs.kstore.file)
        }

        val desktopMain by getting {
            dependencies {
                implementation(libs.kstore.file)
            }
        }

        iosMain.dependencies {
            implementation(libs.kstore.file)
        }

        jsMain.dependencies {
            implementation(libs.kstore.storage)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
            implementation(libs.koin.test)
        }
    }
}

android {
    namespace = "de.felixlf.questionsapp.persistence"
}