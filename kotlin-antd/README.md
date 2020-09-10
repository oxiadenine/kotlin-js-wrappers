## Introduction
This project is a library wrapping [Ant Design](https://ant.design/docs/react/introduce) to be used in an application 
built with [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html).

### Installation

To start using `kotlin-antd` make sure you have the Bintray repository and the following dependencies added to 
the Gradle build file:

```kotlin
repositories {
    maven("https://dl.bintray.com/samgarasx/kotlin-js-wrappers")
}

dependencies {
    implementation("com.github.samgarasx:kotlin-antd:3.20.3-pre.3-kotlin-1.4.0")
    implementation(npm("antd", "3.20.3"))
}
```

See the [Bintray page](https://bintray.com/samgarasx/kotlin-js-wrappers/kotlin-antd) for Maven and Gradle 
installation instructions.

### Getting Started
You can view the [samples](https://github.com/samgarasx/kotlin-js-wrappers/tree/master/kotlin-antd/antd-samples) that follows 
Ant Design [demo](https://github.com/ant-design/ant-design/tree/master/components) of each component to know 
how to use this library.
