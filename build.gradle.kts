// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version BuildPluginsVersion.AGP apply false
    id("com.android.library") version BuildPluginsVersion.AGP apply false
    kotlin("android") version BuildPluginsVersion.KOTLIN apply false
    id("io.gitlab.arturbosch.detekt") version BuildPluginsVersion.DETEKT
    id("org.jlleitschuh.gradle.ktlint") version BuildPluginsVersion.KTLINT
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

subprojects {
    apply {
        plugin("io.gitlab.arturbosch.detekt")
        plugin("org.jlleitschuh.gradle.ktlint")
    }

    ktlint {
        version.set(Versions.KTLINT)
        debug.set(false)
        verbose.set(true)
        android.set(false)
        outputToConsole.set(true)
        ignoreFailures.set(false)
        enableExperimentalRules.set(true)
        disabledRules.set(setOf("final-newline"))
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }

    detekt {
        config = rootProject.files("config/detekt/detekt.yml")
        reports {
            html {
                enabled = true
                destination = file("build/reports/detekt.html")
            }
        }
    }
}
tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
