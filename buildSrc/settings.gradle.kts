@file:Suppress("UnstableApiUsage")

rootProject.name = "buildSrc"
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    includeBuild("../gradle/cataloghelper")
}

dependencyResolutionManagement {
    // Required for the version catalog to be found
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
