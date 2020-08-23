@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.date

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.FormatDateOptions

@JsName("FormattedDate")
external class FormattedDateComponent : Component<FormattedDateProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedDateProps : FormatDateOptions, RProps {
    var value: Any /* String | Number | Date */
    var children: ((value: String) -> ReactElement)?
}
