package uikit.util

import uikit.UIKitElement

external interface FilterUtil {
    val selInput: String
    val selFocusable: String

    fun isVoidElement(element: UIKitElement? = definedExternally): Boolean
    fun isVisible(element: UIKitElement? = definedExternally): Boolean
    fun isInput(element: UIKitElement? = definedExternally): Boolean
    fun isFocusable(element: UIKitElement? = definedExternally): Boolean
    fun parent(element: UIKitElement? = definedExternally): dynamic
    fun filter(element: UIKitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun matches(element: UIKitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun closest(element: UIKitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun within(element: UIKitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun parents(element: UIKitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun children(element: UIKitElement? = definedExternally, selector: String? = definedExternally): dynamic
    fun index(element: UIKitElement? = definedExternally, ref: dynamic = definedExternally): dynamic
}