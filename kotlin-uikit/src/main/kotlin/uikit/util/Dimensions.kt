package uikit.util

import uikit.UIkitElement

external interface DimensionsUtil {
    fun dimensions(element: UIkitElement? = definedExternally): dynamic
    fun offset(element: UIkitElement? = definedExternally, coordinates: dynamic = definedExternally): dynamic
    fun position(element: UIkitElement? = definedExternally): dynamic
    fun offsetPosition(element: UIkitElement? = definedExternally): dynamic
    fun boxModelAdjust(
        element: UIkitElement? = definedExternally,
        prop: dynamic,
        sizing: String? = definedExternally
    ): dynamic

    fun flipPosition(pos: Number): Number
    fun toPx(
        value: dynamic = definedExternally,
        property: String? = definedExternally,
        element: UIkitElement? = definedExternally
    ): dynamic
}
