package uikit.components

external interface ScrollElement {
    fun scrollTo(el: Any? /* Element | String */ = definedExternally)
}

external interface ScrollOptions {
    var offset: Number?
}

object ScrollEvents {
    const val beforeScroll = "beforescroll"
    const val scrolled = "scrolled"
}
