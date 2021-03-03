## Introduction

This project is a library wrapping [UIkit](https://getuikit.com) to be used in an application 
built with [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html).

### Installation

To start using `kotlin-uikit` make sure you have the Bintray repository, and the following dependencies added to 
the Gradle build file:

```kotlin
repositories {
    maven("https://dl.bintray.com/samgarasx/kotlin-js-wrappers")
}

dependencies {
    implementation("com.github.samgarasx:kotlin-uikit:3.5.7-pre.4-kotlin-1.4.30")
    implementation(npm("uikit", "3.5.7"))
}
```

See the [Bintray page](https://bintray.com/samgarasx/kotlin-js-wrappers/kotlin-uikit) for Maven and Gradle 
installation instructions.

### Getting Started

You can view the [samples](https://github.com/samgarasx/kotlin-js-wrappers/tree/master/kotlin-uikit/uikit-samples) to know 
how to use this library.
