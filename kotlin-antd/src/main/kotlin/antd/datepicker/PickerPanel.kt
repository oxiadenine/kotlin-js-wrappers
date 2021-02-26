package antd.datepicker

import antd.MouseEventHandler
import antd.ReactNode
import org.w3c.dom.HTMLDivElement

external interface RcPickerPanelBaseProps<DateType> : RcPickerPanelSharedProps<DateType> {
    var picker: String /* "week" | "month" | "quarter" | "year" */
}

external interface RcPickerPanelDateProps<DateType> : RcPickerPanelSharedProps<DateType> {
    var picker: String /* "date" */
    var showToday: Boolean?
    var showNow: Boolean?
    var showTime: Any? /* Boolean | SharedTimeProps<DateType> */
    var disabledTime: Any? /* DisabledTime<DateType> | (date: DateType, type: RangeType) -> DisabledTimes */
}

external interface RcPickerPanelTimeProps<DateType> : RcPickerPanelSharedProps<DateType>, SharedTimeProps<DateType> {
    var picker: String /* "time" */
}

external interface RcPickerPanelSharedProps<DateType> {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var mode: Any? /* PanelMode | Array<PanelMode> */
    var tabIndex: Number?
    var generateConfig: GenerateConfig<DateType>
    var value: Any? /* DataType | RangeValue<DateType> */
    var defaultValue: Any? /* DataType | RangeValue<DateType> */
    var pickerValue: DateType?
    var defaultPickerValue: Any? /* DataType | Array<DateType> */
    var disabledDate: ((date: DateType) -> Boolean)?
    var dateRender: Any? /* DateRender<DateType> | RangeDateRender<DateType> */
    var monthCellRender: MonthCellRender<DateType>?
    var renderExtraFooter: ((mode: PanelMode) -> ReactNode)?
    var onSelect: ((value: DateType) -> Unit)?
    var onChange: Any? /* (value: DateType, dateString: String) -> Unit | (values: RangeValue<DateType>, formatString: Array<String>) -> Unit */
    var onPanelChange: Any? /* OnPanelChange<DateType> | (values: RangeValue<DateType>, modes: Array<PanelMode>) -> Unit */
    var onMouseDown: MouseEventHandler<HTMLDivElement>?
    var onOk: Any? /* (date: DateType) -> Unit | (dates: RangeValue<DateType>) -> Unit */
    var direction: String? /* "ltr" | "rtl" */
    var hideHeader: Boolean?
    var onPickerValueChange: ((date: DateType) -> Unit)?
    var components: Components?
}
