@file:JsModule("react-intl")

package reactintl.number

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.FormatNumberOptions

@JsName("FormattedNumber")
external class FormattedNumberComponent : Component<FormattedNumberProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedNumberProps : FormatNumberOptions, RProps {
    var value: Number
    var children: ((value: String) -> ReactElement)?
}
