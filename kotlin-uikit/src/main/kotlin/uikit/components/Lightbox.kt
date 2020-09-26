package uikit.components

import uikit.*

external interface LightboxComponent : Component {
    fun show(index: Any /* String | Int */)
    fun hide()
    fun startAutoplay()
    fun stopAutoplay()
}

external interface LightboxOptions {
    var animation: String?
    var autoplay: Boolean?
    var autoplayInterval: Number?
    var pauseOnHover: Boolean?
    var videoAutoplay: Boolean?
    var index: Number?
    var velocity: Number?
    var preload: Number?
    var items: Array<Any>?
    var template: String?
    var delayControls: Number?
    var container: String?
}

object LightboxEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
    const val itemLoad = "itemlaod"
    const val beforeItemShow = "beforeitemshow"
    const val itemShow = "itemshow"
    const val itemShown = "itemshown"
    const val beforeItemHide = "beforeitemhide"
    const val itemHide = "itemhide"
    const val itemHidden = "itemhidden"
}
