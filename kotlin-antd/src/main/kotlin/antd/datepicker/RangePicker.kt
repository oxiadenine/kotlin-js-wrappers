package antd.datepicker

import moment.Moment
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import react.*

external object RangePickerComponent : Component<RangePickerProps, RangePickerState> {
    override fun render(): ReactElement?
}

external interface RangePickerProps : PickerProps, RProps {
    override var className: String?
    var value: RangePickerValue?
    var defaultValue: RangePickerValue?
    var defaultPickerValue: RangePickerValue?
    var onChange: ((dates: RangePickerValue, dateStrings: Array<String>) -> Unit)?
    var onCalendarChange: ((dates: RangePickerValue, dateStrings: Array<String>) -> Unit)?
    var onOk: ((selectedTime: RangePickerPresetRange) -> Unit)?
    var showTime: Any? /* TimePickerProps | Boolean */
    var showToday: Boolean?
    var ranges: RangePickerRanges?
    var placeholder: Array<String>?
    var mode: Any? /* String | Array<String> */
    var separator: Any? /* String | ReactElement */
    var disabledTime: ((current: Moment?, type: String) -> DatePickerDisabledTime)?
    var onPanelChange: ((value: RangePickerValue?, mode: Any? /* String | Array<String> */) -> Unit)?
    var renderExtraFooter: (() -> Any /* String | ReactElement */)?
    var getPopupContainer: ((triggerNode: Element) -> HTMLElement)?
}

external interface RangePickerState : RState {
    var value: RangePickerValue
    var showDate: RangePickerValue
    var open: Boolean?
    var hoverValue: RangePickerValue?
}

external interface RangePickerRanges {
    /* [range: String]: RangePickerPresetRange */
}
