package uikit.components

import uikit.Component

external interface CountdownComponent : Component {
    fun start()
    fun stop()
}

external interface CountdownOptions {
    var date: String?
}
