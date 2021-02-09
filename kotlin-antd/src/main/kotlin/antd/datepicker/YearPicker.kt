package antd.datepicker

import moment.Moment
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object YearPickerComponent : Component<YearPickerProps, RState> {
    override fun render(): ReactElement?
}

external interface YearPickerProps : PickerDateProps<Moment>, RProps
