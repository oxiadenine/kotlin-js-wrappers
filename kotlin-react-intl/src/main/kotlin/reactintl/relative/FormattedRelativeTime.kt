@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.relative

import react.*
import reactintl.*

@JsName("FormattedRelativeTime")
external class FormattedRelativeTimeComponent : Component<FormattedRelativeTimeProps, FormattedRelativeTimeState> {
    override fun render(): ReactElement?
}

external interface FormattedRelativeTimeProps : IntlRelativeTimeFormatOptions, CustomFormatConfig, Props {
    var value: Number?
    var unit: RelativeTimeUnit?
    var updateIntervalInSeconds: Number?
    var children: ((value: String) -> ReactElement)?
}

external interface FormattedRelativeTimeState : State {
    var prevUnit: RelativeTimeUnit?
    var prevValue: Number?
    var currentValueInSeconds: Number
}
