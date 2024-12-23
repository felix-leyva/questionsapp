package extensions

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.get
import projectLibs

fun Project.baseAndroidConfig(baseExtension: BaseExtension) {
    baseExtension.apply {
        compileSdkVersion(projectLibs.versions.androidCompileSdk.toInt())

        sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
        sourceSets["main"].res.srcDirs("src/androidMain/res")
        sourceSets["main"].resources.srcDirs("src/commonMain/resources")

        defaultConfig {
            minSdk = projectLibs.versions.androidMinSdk.toInt()
            if (this@apply is BaseAppModuleExtension) {
                targetSdk = projectLibs.versions.androidTargetSdk.toInt()
                applicationId = projectLibs.versions.applicationId
                versionCode = projectLibs.versions.versionCode.toInt()
                versionName = projectLibs.versions.versionName
            }
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        if (this@apply is LibraryExtension) packaging {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
            }
        }

        buildTypes {
            getByName("release") {
                if (this@apply is LibraryExtension) consumerProguardFile("consumer-rules.pro")
                proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            }
        }

        compileOptions {
            sourceCompatibility = JavaVersion.toVersion(projectLibs.versions.java)
            targetCompatibility = JavaVersion.toVersion(projectLibs.versions.java)
        }

    }
    dependencies {
        add("debugImplementation", projectLibs.libraries.composePreviewTooling)
    }
}

fun Project.setupCompose(baseExtension: BaseExtension) {
    baseExtension.apply {
        composeOptions {
            buildFeatures.compose = true
        }
    }
}
