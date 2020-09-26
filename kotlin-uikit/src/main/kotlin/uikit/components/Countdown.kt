package uikit.components

import uikit.*

external interface CountdownComponent : Component {
    fun start()
    fun stop()
}

external interface CountdownOptions {
    var date: String?
}
