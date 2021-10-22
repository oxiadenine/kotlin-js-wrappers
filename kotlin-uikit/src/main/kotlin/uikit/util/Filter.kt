package uikit.util

import uikit.UIkitElement

external interface FilterUtil {
    val selInput: String
    val selFocusable: String

    fun isVoidElement(element: UIkitElement? = definedExternally): Boolean
    fun isVisible(element: UIkitElement? = definedExternally): Boolean
    fun isInput(element: UIkitElement? = definedExternally): Boolean
    fun isFocusable(element: UIkitElement? = definedExternally): Boolean
    fun parent(element: UIkitElement? = definedExternally): dynamic
    fun filter(element: UIkitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun matches(element: UIkitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun closest(element: UIkitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun within(element: UIkitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun parents(element: UIkitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun children(element: UIkitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun index(element: UIkitElement? = definedExternally, ref: dynamic = definedExternally): dynamic
}
