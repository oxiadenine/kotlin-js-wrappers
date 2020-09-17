package uikit.components

import uikit.Component

external interface FormComponent : Component

external interface FormOptions {
    var target: Any? /* String | Boolean */
}
