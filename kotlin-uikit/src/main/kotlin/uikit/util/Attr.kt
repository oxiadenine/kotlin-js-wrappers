package uikit.util

import org.w3c.dom.Attr
import uikit.UIkitElement

external interface AttrUtil {
    fun attr(
        element: UIkitElement? = definedExternally,
        name: String? = definedExternally,
        value: dynamic = definedExternally
    ): UIkitElement?

    fun hasAttr(element: UIkitElement? = definedExternally, name: String? = definedExternally): Boolean
    fun removeAttr(element: UIkitElement? = definedExternally, name: String)
    fun data(element: UIkitElement? = definedExternally, attribute: Attr): UIkitElement?
}
