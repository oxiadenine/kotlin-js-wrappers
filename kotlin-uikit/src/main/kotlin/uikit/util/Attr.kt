package uikit.util

import org.w3c.dom.Attr
import uikit.UIKitElement

external interface AttrUtil {
    fun attr(
        element: UIKitElement? = definedExternally,
        name: String? = definedExternally,
        value: dynamic = definedExternally
    ): UIKitElement?

    fun hasAttr(element: UIKitElement? = definedExternally, name: String? = definedExternally): Boolean
    fun removeAttr(element: UIKitElement? = definedExternally, name: String)
    fun data(element: UIKitElement? = definedExternally, attribute: Attr): UIKitElement?
}