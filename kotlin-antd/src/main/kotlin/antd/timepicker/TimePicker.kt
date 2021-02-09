@file:JsModule("antd/lib/time-picker")
@file:JsNonModule

package antd.timepicker

import antd.datepicker.PickerTimeProps
import antd.datepicker.RangePickerTimeProps
import moment.*
import react.*

@JsName("default")
external object TimePickerComponent : Component<TimePickerProps, RState> {
    val RangePicker: RangePickerComponent

    override fun render(): ReactElement?
}

external object RangePickerComponent : Component<RangeTimePickerProps, RState> {
    override fun render(): ReactElement?
}

external interface TimePickerProps : PickerTimeProps<Moment>, RProps {
    var addon: () -> Any /* String | ReactElement */
    var popupClassName: String?
}

external interface RangeTimePickerProps : RangePickerTimeProps<Moment>, RProps

external interface TimePickerLocale {
    var placeholder: String?
    var rangePlaceholder: Array<String>?
}
