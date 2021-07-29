package antd.datepicker

import antd.AriaAttributes
import antd.FocusEventHandler
import antd.MouseEventHandler
import antd.button.ButtonProps
import antd.ReactNode
import antd.tag.TagProps
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import react.*

external interface PickerButtonComponent : ComponentType<ButtonProps>

external interface PickerTagComponent : ComponentType<TagProps>

external interface RcPickerBaseProps<DateType> : RcPickerSharedProps<DateType>, RcPickerPanelBaseProps<DateType>

external interface RcPickerDateProps<DateType> : RcPickerSharedProps<DateType>, RcPickerPanelDateProps<DateType>

external interface RcPickerTimeProps<DateType> : RcPickerSharedProps<DateType>, RcPickerPanelTimeProps<DateType> {
    override var picker: String /* "time" */
    var defaultOpenValue: DateType?
}

external interface RcPickerSharedProps<DateType> : AriaAttributes {
    var dropdownClassName: String?
    var dropdownAlign: AlignType?
    var popupStyle: dynamic
    var transitionName: String?
    var placeholder: Any? /* String | Array<String> */
    var allowClear: Boolean?
    var autoFocus: Boolean?
    var disabled: Any? /* Boolean | Array<Boolean> */
    var tabIndex: Number?
    var open: Boolean?
    var defaultOpen: Boolean?
    var inputReadOnly: Boolean?
    var id: String?
    var format: Any? /* String | CustomFormat<DateType> | Array<Any /* String | CustomFormat<DateType> */> */
    var suffixIcon: ReactNode?
    var clearIcon: ReactNode?
    var prevIcon: ReactNode?
    var nextIcon: ReactNode?
    var superPrevIcon: ReactNode?
    var superNextIcon: ReactNode?
    var getPopupContainer: ((node: HTMLElement) -> HTMLElement)?
    var panelRender: ((originPanel: ReactNode) -> ReactNode)?
    var onOpenChange: ((open: Boolean) -> Unit)?
    var onFocus: FocusEventHandler<HTMLInputElement>?
    var onBlur: FocusEventHandler<HTMLInputElement>?
    var onMouseDown: MouseEventHandler<HTMLDivElement>?
    var onMouseUp: MouseEventHandler<HTMLDivElement>?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
    var onClick: MouseEventHandler<HTMLDivElement>?
    var onContextMenu: MouseEventHandler<HTMLDivElement>?
    var pickerRef: MutableRefObject<PickerRefConfig>?
    var role: String?
    var name: String?
    var autoComplete: String?
    var direction: String? /* "ltr" | "rtl" */
}

external interface SharedTimeProps<DateType> : DisabledTimes {
    var showNow: Boolean?
    var showHour: Boolean?
    var showMinute: Boolean?
    var showSecond: Boolean?
    var use12Hours: Boolean?
    var hourStep: Number?
    var minuteStep: Number?
    var secondStep: Number?
    var hideDisabledOptions: Boolean?
}

external interface PickerRefConfig {
    var focus: () -> Unit
    var blur: () -> Unit
}

external interface AlignType {
    var points: Array<AlignPoint>?
    var offset: Array<Number>?
    var targetOffset: Array<Number>?
    var overflow: AlignTypeOverflow?
    var useCssRight: Boolean?
    var useCssBottom: Boolean?
    var useCssTransform: Boolean?
    var ignoreShake: Boolean?
}

external interface AlignTypeOverflow {
    var adjustX: Any? /* Boolean | Number */
    var adjustY: Any? /* Boolean | Number */
}

external interface Locale {
    var locale: String
    var monthBeforeYear: Boolean?
    var yearFormat: String
    var monthFormat: String?
    var quarterFormat: String?
    var today: String
    var now: String
    var backToToday: String
    var ok: String
    var timeSelect: String
    var dateSelect: String
    var weekSelect: String?
    var clear: String
    var month: String
    var year: String
    var previousMonth: String
    var nextMonth: String
    var monthSelect: String
    var yearSelect: String
    var decadeSelect: String
    var dayFormat: String
    var dateFormat: String
    var dateTimeFormat: String
    var previousYear: String
    var nextYear: String
    var previousDecade: String
    var nextDecade: String
    var previousCentury: String
    var nextCentury: String
    var shortWeekDays: Array<String>?
    var shortMonths: Array<String>?
}

external interface GenerateConfig<DateType> {
    var getWeekDay: (value: DateType) -> Number
    var getSecond: (value: DateType) -> Number
    var getMinute: (value: DateType) -> Number
    var getHour: (value: DateType) -> Number
    var getDate: (value: DateType) -> Number
    var getMonth: (value: DateType) -> Number
    var getYear: (value: DateType) -> Number
    var getNow: () -> DateType
    var getFixedDate: (fixed: String) -> DateType
    var getEndDate: (value: DateType) -> DateType
    var addYear: (value: DateType, diff: Number) -> DateType
    var addMonth: (value: DateType, diff: Number) -> DateType
    var addDate: (value: DateType, diff: Number) -> DateType
    var setYear: (value: DateType, year: Number) -> DateType
    var setMonth: (value: DateType, month: Number) -> DateType
    var setDate: (value: DateType, date: Number) -> DateType
    var setHour: (value: DateType, hour: Number) -> DateType
    var setMinute: (value: DateType, minute: Number) -> DateType
    var setSecond: (value: DateType, second: Number) -> DateType
    var isAfter: (date1: DateType, date2: DateType) -> Boolean
    var isValidate: (date: DateType) -> Boolean
    var locale: GenerateConfigLocale<DateType>
}

external interface GenerateConfigLocale<DateType> {
    var getWeekFirstDay: (locale: String) -> Number
    var getWeekFirstDate: (locale: String, value: DateType) -> DateType
    var getWeek: (locale: String, value: DateType) -> Number
    var format: (locale: String, date: DateType, format: String) -> String
    var parse: (locale: String, text: String, formats: Array<String>) -> DateType?
    var getShortWeekDays: ((locale: String) -> Array<String>)?
    var getShortMonths: ((locale: String) -> Array<String>)?
}

external interface DisabledTimes {
    var disabledHours: (() -> Array<Number>)?
    var disabledMinutes: ((hour: Number) -> Array<Number>)?
    var disabledSeconds: ((hour: Number, minute: Number) -> Array<Number>)?
}

external interface Components {
    var button: Any? /* ComponentClass | String */
    var rangeItem: Any? /* ComponentClass | String */
}
