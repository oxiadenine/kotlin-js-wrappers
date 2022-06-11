package uikit.util

import uikit.UIKitElement

external interface StyleUtil {
    fun css(
        element: UIKitElement? = definedExternally,
        property: dynamic = definedExternally,
        value: dynamic = definedExternally,
        priority: String? = definedExternally
    ): dynamic

    fun getCssVar(name: String? = definedExternally): dynamic
}