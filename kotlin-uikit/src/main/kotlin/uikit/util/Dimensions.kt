package uikit.util

import uikit.UIKitElement

external interface DimensionsUtil {
    fun dimensions(element: UIKitElement? = definedExternally): dynamic
    fun offset(element: UIKitElement? = definedExternally, coordinates: dynamic = definedExternally): dynamic
    fun position(element: UIKitElement? = definedExternally): dynamic
    fun offsetPosition(element: UIKitElement? = definedExternally): dynamic
    fun boxModelAdjust(
        element: UIKitElement? = definedExternally,
        prop: dynamic,
        sizing: String? = definedExternally
    ): dynamic

    fun flipPosition(pos: Number): Number
    fun toPx(
        value: dynamic = definedExternally,
        property: String? = definedExternally,
        element: UIKitElement? = definedExternally
    ): dynamic
}
