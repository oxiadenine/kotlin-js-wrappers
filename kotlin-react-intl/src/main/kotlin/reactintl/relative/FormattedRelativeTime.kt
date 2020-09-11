@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.relative

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.CustomFormatConfig

@JsName("FormattedRelativeTime")
external class FormattedRelativeTimeComponent : Component<FormattedRelativeTimeProps, FormattedRelativeTimeState> {
    override fun render(): ReactElement?
}

external interface FormattedRelativeTimeProps : IntlRelativeTimeFormatOptions, CustomFormatConfig, RProps {
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
    var unit: RelativeTimeUnit?
        get() = definedExternally
        set(value) = definedExternally
    var updateIntervalInSeconds: Number?
        get() = definedExternally
        set(value) = definedExternally
    var children: ((value: String) -> ReactElement)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FormattedRelativeTimeState : RState {
    var prevUnit: RelativeTimeUnit?
        get() = definedExternally
        set(value) = definedExternally
    var prevValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var currentValueInSeconds: Number
}
