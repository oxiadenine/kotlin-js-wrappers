@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.datetime

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.CustomFormatConfig

@JsName("FormattedDate")
external class FormattedDateComponent : Component<FormattedDateProps, RState> {
    override fun render(): ReactElement?
}

@JsName("FormattedDateParts")
external class FormattedDatePartsComponent : Component<FormattedDatePartsProps, RState> {
    override fun render(): ReactElement?
}

@JsName("FormattedTime")
external class FormattedTimeComponent : Component<FormattedTimeProps, RState> {
    override fun render(): ReactElement?
}

@JsName("FormattedTimeParts")
external class FormattedTimePartsComponent : Component<FormattedTimePartsProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedDateProps : DateTimeFormatOptions, CustomFormatConfig, RProps {
    var value: Any? /* String | Number | Date */
        get() = definedExternally
        set(value) = definedExternally
}

external interface FormattedDatePartsProps : DateTimeFormatOptions, RProps {
    var value: Any /* String | Number | Date */
    fun children(value: Any /* String | Number | Date */): ReactElement?
}

external interface FormattedTimeProps : DateTimeFormatOptions, CustomFormatConfig, RProps {
    var value: Any? /* String | Number | Date */
        get() = definedExternally
        set(value) = definedExternally
}

external interface FormattedTimePartsProps : DateTimeFormatOptions, RProps {
    var value: Any /* String | Number | Date */
    fun children(value: Any /* String | Number | Date */): ReactElement?
}

external interface DateTimeFormatOptions : IntlDateTimeFormatOptions, CustomFormatConfig {
    var hourCycle: String? /* "h11" | "h12" | "h23" | "h24" */
        get() = definedExternally
        set(value) = definedExternally
    var dateStyle: String? /* "full" | "long" | "medium" | "short" */
        get() = definedExternally
        set(value) = definedExternally
    var timeStyle: String? /* "full" | "long" | "medium" | "short" */
        get() = definedExternally
        set(value) = definedExternally
    var fractionalSecondDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var calendar: String? /* "buddhist" | "chinese" | "coptic" | "ethiopia" | "ethiopic" | "gregory" | "hebrew" | "indian" | "islamic" | "iso8601" | "japanese" | "persian" | "roc" */
        get() = definedExternally
        set(value) = definedExternally
    var numberingSystem: String?
        get() = definedExternally
        set(value) = definedExternally
}
