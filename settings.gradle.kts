enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        // Optionally, if you need the JetBrains repository
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx/datetime") }

    }
}

rootProject.name = "DailyPlus"
include(":androidApp")
include(":shared")