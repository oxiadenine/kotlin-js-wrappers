package uikit.components

import uikit.*

external interface SlideshowComponent : Component {
    fun show(index: Number = definedExternally)
    fun startAutoplay()
    fun stopAutoplay()
}

external interface SlideshowOptions {
    var animation: String?
    var autoplay: Boolean?
    var autoplayInterval: Number?
    var draggable: Boolean?
    var easing: String?
    var finite: Boolean?
    var pauseOnHover: Boolean?
    var index: Number?
    var velocity: Number?
    var ratio: Any? /* Boolean | String */
    var minHeight: Any? /* Boolean | Number */
    var maxHeight: Any? /* Boolean | Number */
}

object SlideshowEvents {
    const val beforeItemShow = "beforeitemshow"
    const val itemShow = "itemshow"
    const val itemShown = "itemshown"
    const val beforeItemHide = "beforeitemhide"
    const val itemHide = "itemhide"
    const val itemHidden = "itemhidden"
}
