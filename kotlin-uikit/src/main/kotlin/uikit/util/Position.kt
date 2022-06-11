package uikit.util

import uikit.UIKitElement

external interface PositionUtil {
    fun positionAt(
        element: UIKitElement? = definedExternally,
        target: dynamic = definedExternally,
        elAttach: dynamic = definedExternally,
        targetAttach: dynamic = definedExternally,
        elOffset: dynamic = definedExternally,
        targetOffset: dynamic = definedExternally,
        flip: Boolean? = definedExternally,
        boundary: dynamic = definedExternally
    ): dynamic
}