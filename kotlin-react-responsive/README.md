## Introduction
This project is a library wrapping [React Responsive](https://github.com/contra/react-responsive) to be used in an 
application built with [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html).

### Installation

To start using `kotlin-react-responsive` make sure you have the Bintray repository and the following dependencies added to 
the Gradle build file:

```kotlin
repositories {
    maven("https://dl.bintray.com/samgarasx/kotlin-js-wrappers")
}

dependencies {
    implementation("com.github.samgarasx:kotlin-react-responsive:8.1.0-pre.3-kotlin-1.4.0")
    implementation(npm("react-responsive", "8.1.0"))
}
```

See the [Bintray page](https://bintray.com/samgarasx/kotlin-js-wrappers/kotlin-react-responsive) for Maven and Gradle 
installation instructions.

### Getting Started
You can view the [samples](https://github.com/samgarasx/kotlin-js-wrappers/tree/master/kotlin-react-responsive/samples) to know 
how to use this library.
