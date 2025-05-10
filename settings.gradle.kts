pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()

        plugins {
            id("com.android.application") version "8.5.1"
            //id("org.jetbrains.kotlin.android") version "1.9.22"
            id("com.google.dagger.hilt.android") version "2.48"
            //id("org.jetbrains.kotlin.kapt") version "1.9.22"
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
 /*
    versionCatalogs {
        create("libs") {
            from(file("gradle/libs.versions.toml"))
        }
    }

  */
}

rootProject.name = "Automotive Assistant Kotlin"
include(":app")
 