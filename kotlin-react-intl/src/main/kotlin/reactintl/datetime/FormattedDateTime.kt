@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.datetime

import react.*
import reactintl.*

@JsName("FormattedDate")
external class FormattedDateComponent : Component<FormattedDateProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedDateParts")
external class FormattedDatePartsComponent : Component<FormattedDatePartsProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedTime")
external class FormattedTimeComponent : Component<FormattedTimeProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedTimeParts")
external class FormattedTimePartsComponent : Component<FormattedTimePartsProps, State> {
    override fun render(): ReactElement?
}

external interface FormattedDateProps : DateTimeFormatOptions, CustomFormatConfig, RProps {
    var value: Any? /* String | Number | Date */
}

external interface FormattedDatePartsProps : DateTimeFormatOptions, RProps {
    var value: Any /* String | Number | Date */
    fun children(value: Any /* String | Number | Date */): ReactElement?
}

external interface FormattedTimeProps : DateTimeFormatOptions, CustomFormatConfig, RProps {
    var value: Any? /* String | Number | Date */
}

external interface FormattedTimePartsProps : DateTimeFormatOptions, RProps {
    var value: Any /* String | Number | Date */
    fun children(value: Any /* String | Number | Date */): ReactElement?
}

external interface DateTimeFormatOptions : IntlDateTimeFormatOptions, CustomFormatConfig {
    var hourCycle: String? /* "h11" | "h12" | "h23" | "h24" */
    var dateStyle: String? /* "full" | "long" | "medium" | "short" */
    var timeStyle: String? /* "full" | "long" | "medium" | "short" */
    var fractionalSecondDigits: Number?
    var calendar: String? /* "buddhist" | "chinese" | "coptic" | "ethiopia" | "ethiopic" | "gregory" | "hebrew" | "indian" | "islamic" | "iso8601" | "japanese" | "persian" | "roc" */
    var numberingSystem: String?
}
