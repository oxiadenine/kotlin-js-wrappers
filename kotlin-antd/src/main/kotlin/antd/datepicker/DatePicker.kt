@file:JsModule("antd/lib/date-picker")
@file:JsNonModule

package antd.datepicker

import antd.configprovider.SizeType
import antd.timepicker.TimePickerLocale
import moment.*
import react.*

@JsName("default")
external object DatePickerComponent : Component<DatePickerProps, State> {
    val WeekPicker: WeekPickerComponent
    val MonthPicker: MonthPickerComponent
    val YearPicker: YearPickerComponent
    val RangePicker: RangePickerComponent
    val TimePicker: TimePickerComponent
    val QuarterPicker: QuarterPickerComponent

    override fun render(): ReactElement?
}

external interface DatePickerProps : PickerProps<Moment>, Props

external interface PickerProps<DateType> : PickerBaseProps<DateType>, PickerDateProps<DateType>, PickerTimeProps<DateType>

external interface PickerBaseProps<DateType> : RcPickerBaseProps<DateType>

external interface PickerDateProps<DateType> : RcPickerDateProps<DateType> {
    var locale: PickerLocale?
    var size: SizeType?
    var bordered: Boolean?
}

external interface PickerTimeProps<DateType> : RcPickerTimeProps<DateType> {
    var locale: PickerLocale?
    var size: SizeType?
    var bordered: Boolean?
}

external interface PickerLocale : AdditionalPickerLocaleProps {
    var lang: PickerLocaleLang
    var timePickerLocale: TimePickerLocale
}

external interface PickerLocaleLang : Locale, AdditionalPickerLocaleLangProps

external interface AdditionalPickerLocaleProps {
    var dateFormat: String?
    var dateTimeFormat: String?
    var weekFormat: String?
    var monthFormat: String?
}

external interface AdditionalPickerLocaleLangProps {
    var placeholder: String
    var yearPlaceholder: String?
    var quarterPlaceholder: String?
    var monthPlaceholder: String?
    var weekPlaceholder: String?
    var rangeYearPlaceholder: Array<String>?
    var rangeMonthPlaceholder: Array<String>?
    var rangeWeekPlaceholder: Array<String>?
    var rangePlaceholder: Array<String>?
}
