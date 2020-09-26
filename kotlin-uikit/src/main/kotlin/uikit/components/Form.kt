package uikit.components

import uikit.*

external interface FormComponent : Component

external interface FormOptions {
    var target: Any? /* String | Boolean */
}
