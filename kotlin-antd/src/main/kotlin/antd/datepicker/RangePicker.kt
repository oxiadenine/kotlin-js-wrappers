package antd.datepicker

import antd.FocusEventHandler
import antd.ReactNode
import antd.configprovider.SizeType
import kotlinext.js.Record
import moment.Moment
import org.w3c.dom.*
import react.*

external object RangePickerComponent : Component<RangePickerProps, RState> {
    override fun render(): ReactElement?
}

external interface RangePickerProps : RangePickerBaseProps<Moment>, RangePickerDateProps<Moment>, RangePickerTimeProps<Moment>, RProps

external interface RangePickerBaseProps<DateType> : RcRangePickerBaseProps<DateType> {
    var locale: PickerLocale?
    var size: SizeType?
    var bordered: Boolean?
}

external interface RangePickerDateProps<DateType> : RcRangePickerDateProps<DateType> {
    var locale: PickerLocale?
    var size: SizeType?
    var bordered: Boolean?
}

external interface RangePickerTimeProps<DateType> : RcRangePickerTimeProps<DateType> {
    var locale: PickerLocale?
    var size: SizeType?
    var bordered: Boolean?
}

external interface RcRangePickerBaseProps<DateType> : RcRangePickerSharedProps<DateType>, RcPickerBaseProps<DateType>

external interface RcRangePickerDateProps<DateType> : RcRangePickerSharedProps<DateType>, RcPickerDateProps<DateType> {
    override var showTime: Any? /* Boolean | RangeShowTimeObject<DateType> */
}

external interface RcRangePickerTimeProps<DateType> : RcRangePickerSharedProps<DateType>, RcPickerTimeProps<DateType> {
    var order: Boolean?
}

external interface RcRangePickerSharedProps<DateType> {
    var id: String?
    var ranges: Record<String, Any /* RangeValue<DateType>> | () -> RangeValue<DateType>> */>
    var separator: ReactNode?
    var allowEmpty: Array<Boolean>?
    var onCalendarChange: ((values: RangeValue<DateType>, formatString: Array<String>, info: RangeInfo) -> Unit)?
    var onFocus: FocusEventHandler<HTMLInputElement>?
    var onBlur: FocusEventHandler<HTMLInputElement>?
    var direction: String? /* "ltr" | "rtl" */
    var autoComplete: String?
    var activePickerIndex: Number? /* 0 | 1 */
    var panelRender: ((originPanel: ReactNode) -> ReactNode)?
}

external interface RangeInfo {
    var range: RangeType
}

external interface RangeShowTimeObject<DateType> : SharedTimeProps<DateType> {
    var defaultValue: Any?
}
