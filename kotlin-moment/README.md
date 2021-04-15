## Introduction

This project is a library wrapping [Moment.js](https://momentjs.com/) to be used in an application 
built with [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html).

### Installation

To start using `kotlin-moment` make sure you have the Maven Central repository, and the following dependencies added to 
the Gradle build file:

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.samgarasx:kotlin-moment:2.27.0-pre.7-kotlin-1.4.32")
    implementation(npm("moment", "2.27.0"))
}
```

### Getting Started

You can view the [samples](https://github.com/samgarasx/kotlin-js-wrappers/tree/master/kotlin-moment/moment-samples) to know 
how to use this library.
