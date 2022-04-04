package uikit.components

import uikit.Component

external interface ScrollComponent : Component {
    fun scrollTo(el: Any? /* UIKitElement | String */ = definedExternally)
}

external interface ScrollOptions {
    var offset: Number?
}

object ScrollEvents {
    const val beforeScroll = "beforescroll"
    const val scrolled = "scrolled"
}
