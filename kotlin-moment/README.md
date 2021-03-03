## Introduction

This project is a library wrapping [Moment.js](https://momentjs.com/) to be used in an application 
built with [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html).

### Installation

To start using `kotlin-moment` make sure you have the Bintray repository, and the following dependencies added to 
the Gradle build file:

```kotlin
repositories {
    maven("https://dl.bintray.com/samgarasx/kotlin-js-wrappers")
}

dependencies {
    implementation("com.github.samgarasx:kotlin-moment:2.27.0-pre.5-kotlin-1.4.30")
    implementation(npm("moment", "2.27.0"))
}
```

See the [Bintray page](https://bintray.com/samgarasx/kotlin-js-wrappers/kotlin-moment) for Maven and Gradle 
installation instructions.

### Getting Started

You can view the [samples](https://github.com/samgarasx/kotlin-js-wrappers/tree/master/kotlin-moment/moment-samples) to know 
how to use this library.
