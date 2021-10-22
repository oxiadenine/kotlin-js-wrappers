package uikit.util

import uikit.UIkitElement

external interface PlayerUtil {
    fun play(el: UIkitElement? = definedExternally)
    fun pause(el: UIkitElement? = definedExternally)
    fun mute(el: UIkitElement? = definedExternally)
    fun isVideo(el: UIkitElement? = definedExternally): Boolean
    fun isHTML5(el: UIkitElement? = definedExternally): Boolean
    fun isIFrame(el: UIkitElement? = definedExternally): Boolean
    fun isYoutube(el: UIkitElement? = definedExternally): Boolean
    fun isVimeo(el: UIkitElement? = definedExternally): Boolean
}
