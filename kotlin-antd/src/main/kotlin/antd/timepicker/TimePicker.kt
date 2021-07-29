@file:JsModule("antd/lib/time-picker")
@file:JsNonModule

package antd.timepicker

import antd.RefAttributes
import antd.ReactNode
import antd.datepicker.PickerTimeProps
import antd.datepicker.RangePickerTimeProps
import moment.*
import react.*

@JsName("default")
external object TimePickerComponent : Component<TimePickerProps, State> {
    val RangePicker: RangePickerComponent

    override fun render(): ReactElement?
}

external interface RangePickerComponent : ComponentType<RangeTimePickerProps>

external interface TimePickerProps : PickerTimeProps<Moment>, RefAttributes<Any>, RProps {
    var addon: () -> ReactNode
    var popupClassName: String?
}

external interface RangeTimePickerProps : RangePickerTimeProps<Moment>, RefAttributes<Any>, RProps

external interface TimePickerLocale {
    var placeholder: String?
    var rangePlaceholder: Array<String>?
}
