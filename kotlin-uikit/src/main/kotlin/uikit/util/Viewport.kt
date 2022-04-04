package uikit.util

import uikit.UIKitElement
import kotlin.js.Promise

external interface ViewportUtil {
    fun isInView(
        element: UIKitElement? = definedExternally,
        offsetTop: Number? = definedExternally,
        offsetLeft: Number? = definedExternally
    ): dynamic

    fun scrollTop(element: UIKitElement? = definedExternally, top: dynamic = definedExternally)
    fun scrollIntoView(
        element: UIKitElement? = definedExternally,
        offsets: dynamic = definedExternally
    ): Promise<dynamic>

    fun scrolledOver(element: UIKitElement? = definedExternally, heightOffset: Number? = definedExternally): Number
    fun scrollParents(
        element: UIKitElement? = definedExternally,
        overflowRe: String? = definedExternally,
        scrollable: Boolean? = definedExternally
    ): dynamic

    fun getViewport(scrollElement: UIKitElement? = definedExternally): dynamic
    fun getViewportClientHeight(scrollElement: UIKitElement? = definedExternally): Number
    fun getScrollingElement(element: UIKitElement? = definedExternally): UIKitElement
}
