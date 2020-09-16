package uikit.components

external interface CountdownElement {
    fun start()
    fun stop()
}

external interface CountdownOptions {
    var date: String?
}
