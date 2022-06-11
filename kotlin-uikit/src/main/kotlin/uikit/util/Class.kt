package uikit.util

import uikit.UIKitElement

external interface ClassUtil {
    fun addClass(element: UIKitElement? = definedExternally, vararg args: dynamic = definedExternally)
    fun removeClass(element: UIKitElement? = definedExternally, vararg args: dynamic = definedExternally)
    fun removeClasses(element: UIKitElement? = definedExternally, cls: String)
    fun replaceClass(element: UIKitElement? = definedExternally, vararg args: dynamic)
    fun hasClass(element: UIKitElement? = definedExternally, cls: String? = definedExternally): Boolean
    fun toggleClass(
        element: UIKitElement? = definedExternally,
        cls: String? = definedExternally,
        force: Boolean? = definedExternally
    )
}