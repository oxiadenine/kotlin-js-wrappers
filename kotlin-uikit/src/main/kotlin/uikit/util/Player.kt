package uikit.util

import uikit.UIKitElement

external interface PlayerUtil {
    fun play(el: UIKitElement? = definedExternally)
    fun pause(el: UIKitElement? = definedExternally)
    fun mute(el: UIKitElement? = definedExternally)
    fun isVideo(el: UIKitElement? = definedExternally): Boolean
    fun isHTML5(el: UIKitElement? = definedExternally): Boolean
    fun isIFrame(el: UIKitElement? = definedExternally): Boolean
    fun isYoutube(el: UIKitElement? = definedExternally): Boolean
    fun isVimeo(el: UIKitElement? = definedExternally): Boolean
}