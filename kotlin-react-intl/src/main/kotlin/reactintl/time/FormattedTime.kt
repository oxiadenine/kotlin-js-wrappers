@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.time

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.FormatDateOptions

@JsName("FormattedTime")
external class FormattedTimeComponent : Component<FormattedTimeProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedTimeProps : FormatDateOptions, RProps {
    var value: Any /* String | Number | Date */
    var children: ((value: String) -> ReactElement)?
}
