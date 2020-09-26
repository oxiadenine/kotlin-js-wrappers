@file:JsModule("antd/lib/date-picker")
@file:JsNonModule

package antd.datepicker

import moment.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object DatePickerComponent : Component<DatePickerProps, RState> {
    val RangePicker: RangePickerComponent
    val MonthPicker: MonthPickerComponent
    val WeekPicker: WeekPickerComponent

    override fun render(): ReactElement?
}

external interface DatePickerProps : PickerProps, SinglePickerProps, RProps {
    var showTime: Any? /* TimePickerProps | Boolean */
    var showToday: Boolean?
    override var open: Boolean?
    var disabledTime: ((current: Moment) -> DatePickerDisabledTime)?
    override var onOpenChange: ((status: Boolean) -> Unit)?
    var onPanelChange: ((value: Moment?, mode: DatePickerMode) -> Unit)?
    var onOk: ((selectedTime: Moment) -> Unit)?
    var mode: DatePickerMode?
}

external interface DatePickerDisabledTime {
    var disabledHours: (() -> Array<Number>)?
    var disabledMinutes: (() -> Array<Number>)?
    var disabledSeconds: (() -> Array<Number>)?
}

external interface PickerProps {
    var id: Any? /* Number | String */
    var name: String?
    var prefixCls: String?
    var inputPrefixCls: String?
    var format: String?
    var disabled: Boolean?
    var allowClear: Boolean?
    var className: String?
    var suffixIcon: Any? /* String | ReactElement */
    var style: dynamic
    var popupStyle: dynamic
    var dropdownClassName: String?
    var locale: Any?
    var size: DatePickerSize?
    var getCalendarContainer: ((triggerNode: Element) -> HTMLElement)?
    var open: Boolean?
    var onOpenChange: ((status: Boolean) -> Unit)?
    var disabledDate: ((current: Moment) -> Boolean)?
    var dateRender: ((current: Moment, today: Moment) -> Any /* String | ReactElement */)?
    var autoFocus: Boolean?
}

external interface SinglePickerProps {
    var value: Moment?
    var defaultValue: Moment?
    var defaultPickerValue: Moment?
    var placeholder: String?
    var renderExtraFooter: ((mode: DatePickerMode) -> Any /* String | ReactElement */)?
    var onChange: ((date: Moment, dateString: String) -> Unit)?
}
