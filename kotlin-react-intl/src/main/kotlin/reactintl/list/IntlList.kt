@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.list

import reactintl.Part

external interface IntlListFormatOptions {
    var type: String? /* "conjunction" | "disjunction" | "unit" */
    var style: String? /* "long" | "short" | "narrow" */
}

external class IntlListFormat(
    locales: Any? /* String | Array<String> */,
    options: IntlListFormatOptions? = definedExternally) {
    fun format(elements: Array<String>): String
    fun formatToParts(elements: Array<String>): Array<Part>
    fun resolvedOptions(): ResolvedListFormatOptions
}

external interface ResolvedListFormatOptions {
    var locale: String
    var type: String /* "conjunction" | "disjunction" | "unit" */
    var style: String /* "long" | "short" | "narrow" */
}
