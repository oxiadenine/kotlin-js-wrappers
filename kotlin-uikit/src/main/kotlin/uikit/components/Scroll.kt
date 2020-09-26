package uikit.components

import uikit.*

external interface ScrollComponent : Component {
    fun scrollTo(el: Any? /* Element | String */ = definedExternally)
}

external interface ScrollOptions {
    var offset: Number?
}

object ScrollEvents {
    const val beforeScroll = "beforescroll"
    const val scrolled = "scrolled"
}
