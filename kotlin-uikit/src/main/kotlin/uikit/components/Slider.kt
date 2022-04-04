package uikit.components

import uikit.Component

external interface SliderComponent : Component {
    fun show(index: Number? = definedExternally)
    fun startAutoplay()
    fun stopAutoplay()
}

external interface SliderOptions {
    var autoplay: Boolean?
    var autoplayInterval: Number?
    var center: Boolean?
    var draggable: Boolean?
    var easing: String?
    var finite: Boolean?
    var index: Number?
    var pauseOnHover: Boolean?
    var sets: Boolean?
    var velocity: Number?
}

object SliderEvents {
    const val beforeItemShow = "beforeitemshow"
    const val itemShow = "itemshow"
    const val itemShown = "itemshown"
    const val beforeItemHide = "beforeitemhide"
    const val itemHide = "itemhide"
    const val itemHidden = "itemhidden"
}
