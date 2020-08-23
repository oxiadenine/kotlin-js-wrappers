@file:JsModule("antd/lib/time-picker")
@file:JsNonModule

package antd.timepicker

import moment.Moment
import org.w3c.dom.HTMLElement
import react.*

@JsName("default")
external object TimePickerComponent : Component<TimePickerProps, RState> {
    override fun render(): ReactElement?
}

external interface TimePickerProps : RProps {
    var className: String?
    var size: TimePickerSize?
    var value: Moment?
    var defaultValue: Any? /* Moment | Array<Moment> */
    var open: Boolean?
    var format: String?
    var onChange: ((time: Moment, timeString: String) -> Unit)?
    var onOpenChange: ((open: Boolean) -> Unit)?
    var onAmPmChange: ((ampm: TimePickerAmPm) -> Unit)?
    var disabled: Boolean?
    var placeholder: String?
    var prefixCls: String?
    var hideDisabledOptions: Boolean?
    var disabledHours: (() -> Array<Number>)?
    var disabledMinutes: ((selectedHour: Number) -> Array<Number>)?
    var disabledSeconds: ((selectedHour: Number, selectedMinute: Number) -> Array<Number>)?
    var style: dynamic
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var addon: Function<Any>?
    var use12Hours: Boolean?
    var focusOnOpen: Boolean?
    var hourStep: Number?
    var minuteStep: Number?
    var secondStep: Number?
    var allowEmpty: Boolean?
    var allowClear: Boolean?
    var inputReadOnly: Boolean?
    var clearText: String?
    var defaultOpenValue: Moment?
    var popupClassName: String?
    var popupStyle: dynamic
    var suffixIcon: Any? /* String | ReactElement */
    var clearIcon: Any? /* String | ReactElement */
    var locale: TimePickerLocale?
}

external interface TimePickerLocale {
    var placeholder: String
}

external fun generateShowHourMinuteSecond(format: String): ShowHourMinuteSecondResult

external interface ShowHourMinuteSecondResult {
    var showHour: Boolean
    var showMinute: Boolean
    var showSecond: Boolean
}
