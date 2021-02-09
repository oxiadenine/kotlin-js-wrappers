package antd.datepicker

import moment.Moment
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TimePickerComponent : Component<TimePickerProps, RState> {
    override fun render(): ReactElement?
}

external interface TimePickerProps : PickerTimeProps<Moment>, RProps
