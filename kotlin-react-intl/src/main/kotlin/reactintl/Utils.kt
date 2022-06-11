@file:JsModule("react-intl")
@file:JsNonModule

package reactintl

external fun createIntlCache(): IntlCache
external fun createFormatters(cache: IntlCache?): Formatters
external fun <T> getNamedFormat(
    formats: CustomFormats,
    type: T,
    name: String,
    onError: OnErrorFn
): Any? /* IntlNumber.NumberFormatOptions | IntlDateTime.DateTimeFormatOptions | IntlRelativeTime.RelativeTimeFormatOptions */