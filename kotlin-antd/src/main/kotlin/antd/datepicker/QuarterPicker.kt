package antd.datepicker

import moment.Moment
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object QuarterPickerComponent : Component<QuarterPickerProps, RState> {
    override fun render(): ReactElement?
}

external interface QuarterPickerProps : PickerTimeProps<Moment>, RProps
