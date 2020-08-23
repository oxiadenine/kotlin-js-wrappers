@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.relative

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.FormatRelativeTimeOptions

@JsName("FormattedRelativeTime")
external class FormattedRelativeTimeComponent : Component<FormattedRelativeTimeProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedRelativeTimeProps : FormatRelativeTimeOptions, RProps {
    var value: Number?
    var unit: Any?
    var updateIntervalInSeconds: Number?
    var children: ((value: String) -> ReactElement)?
}
