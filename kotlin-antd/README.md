## Introduction

This project is a library wrapping [Ant Design](https://ant.design/docs/react/introduce) to be used in an application 
built with [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html).

### Installation

To start using `kotlin-antd` make sure you have the Maven Central repository, and the following dependencies added to 
the Gradle build file:

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.samgarasx:kotlin-antd:4.8.6-pre.7-kotlin-1.4.30")
    implementation(npm("antd", "4.8.6"))
}
```

### Getting Started

You can view the [samples](https://github.com/samgarasx/kotlin-js-wrappers/tree/master/kotlin-antd/antd-samples) that follows 
Ant Design [demo](https://github.com/ant-design/ant-design/tree/master/components) of each component to know 
how to use this library.
