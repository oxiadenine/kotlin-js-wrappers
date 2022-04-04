package uikit.components

import uikit.Component

external interface LightboxComponent : Component {
    fun show(index: Any? /* String | Int */ = definedExternally)
    fun hide()
}

external interface LightboxPanelComponent : Component {
    fun show(index: Any? /* String | Number */ = definedExternally)
    fun hide()
    fun startAutoplay()
    fun stopAutoplay()
}

external interface LightboxOptions {
    var animation: String?
    var autoplay: Number?
    var autoplayInterval: Number?
    var pauseOnHover: Boolean?
    var videoAutoplay: Boolean?
    var index: Any? /* String | Number */
    var toggle: String?
}

external interface LightboxPanelOptions {
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

object LightboxPanelEvents {
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
