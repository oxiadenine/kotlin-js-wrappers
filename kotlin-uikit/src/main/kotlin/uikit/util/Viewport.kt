package uikit.util

import uikit.UIkitElement
import kotlin.js.Promise

external interface ViewportUtil {
    fun isInView(
        element: UIkitElement? = definedExternally,
        offsetTop: Number? = definedExternally,
        offsetLeft: Number? = definedExternally
    ): dynamic

    fun scrollTop(element: UIkitElement? = definedExternally, top: dynamic = definedExternally)
    fun scrollIntoView(
        element: UIkitElement? = definedExternally,
        offsets: dynamic = definedExternally
    ): Promise<dynamic>

    fun scrolledOver(element: UIkitElement? = definedExternally, heightOffset: Number? = definedExternally): Number
    fun scrollParents(
        element: UIkitElement? = definedExternally,
        overflowRe: String? = definedExternally,
        scrollable: Boolean? = definedExternally
    ): dynamic

    fun getViewport(scrollElement: UIkitElement? = definedExternally): dynamic
    fun getViewportClientHeight(scrollElement: UIkitElement? = definedExternally): Number
    fun getScrollingElement(element: UIkitElement? = definedExternally): UIkitElement
}
