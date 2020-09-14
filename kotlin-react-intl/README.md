## Introduction

This project is a library wrapping [React Intl](https://github.com/yahoo/react-intl) to be used in an application 
built with [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html).

### Installation

To start using `kotlin-react-intl` make sure you have the Bintray repository, and the following dependencies added to 
the Gradle build file:

```kotlin
repositories {
    maven("https://dl.bintray.com/samgarasx/kotlin-js-wrappers")
}

dependencies {
    implementation("com.github.samgarasx:kotlin-react-intl:5.8.1-pre.3-kotlin-1.4.0")
    implementation(npm("react-intl", "5.8.1"))
}
```

See the [Bintray page](https://bintray.com/samgarasx/kotlin-js-wrappers/kotlin-react-intl) for Maven and Gradle 
installation instructions.

### Getting Started

You can view the [samples](https://github.com/samgarasx/kotlin-js-wrappers/tree/master/kotlin-react-intl/react-intl-samples) to know 
how to use this library.
