# Kotlin android template

A simple template that lets you create an **Android/Kotlin** project and be up and running in a **few seconds**.

## How to use
Just click on **Clone** button to create a new repo starting from this template.

Once created don't forget to update the:
- [App ID](buildSrc/src/main/java/AppConfig.kt)
- AndroidManifest ([here](app/src/main/AndroidManifest.xml) and [here](library-android/src/main/AndroidManifest.xml))
- Package of the source files


## Features
- 100% Kotlin-only template.
- 100% Gradle Kotlin DSL setup.
- Sample Espresso, Instrumentation & JUnit tests.
- Dependency versions managed via `buildSrc`.
- Kotlin Static Analysis via `ktlint` and `detekt`.

## Gradle Setup

This template is using [**Gradle Kotlin DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) as well as the [Plugin DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block) to setup the build.

Dependencies are centralized inside the [Dependencies.kt](buildSrc/src/main/java/Dependencies.kt) file in the `buildSrc` folder. This provides convenient auto-completion when writing your gradle files.


## Static Analysis
This template is using [**ktlint**](https://github.com/pinterest/ktlint) with the [ktlint-gradle](https://github.com/jlleitschuh/ktlint-gradle) plugin to format your code. To reformat all the source code as well as the buildscript you can run the `ktlintFormat` gradle task.

This template is also using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has been generated with the `detektGenerateConfig` task).

## Contributing

Feel free to open a issue or submit a pull request for any bugs/improvements.
