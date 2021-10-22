package uikit.util

import uikit.UIkitElement

external interface StyleUtil {
    fun css(
        element: UIkitElement? = definedExternally,
        property: dynamic = definedExternally,
        value: dynamic = definedExternally,
        priority: String? = definedExternally
    ): dynamic

    fun getCssVar(name: String? = definedExternally): dynamic
}
