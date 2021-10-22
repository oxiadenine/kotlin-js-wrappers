package uikit.util

import uikit.UIkitElement

external interface ClassUtil {
    fun addClass(element: UIkitElement? = definedExternally, vararg args: dynamic = definedExternally)
    fun removeClass(element: UIkitElement? = definedExternally, vararg args: dynamic = definedExternally)
    fun removeClasses(element: UIkitElement? = definedExternally, cls: String)
    fun replaceClass(element: UIkitElement? = definedExternally, vararg args: dynamic)
    fun hasClass(element: UIkitElement? = definedExternally, cls: String? = definedExternally): Boolean
    fun toggleClass(
        element: UIkitElement? = definedExternally,
        cls: String? = definedExternally,
        force: Boolean? = definedExternally
    )
}
