@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.list

import react.*
import reactintl.FormatListOptions

@JsName("FormattedList")
external val FormattedList: FC<FormattedListProps>

external interface FormattedListProps : ListFormatOptions, Props {
    var value: Array<ReactNode>
}

external interface FormattedListPartsProps : FormatListOptions, Props {
    var value: Array<String>
    var children: (Array<Part<Any>>) -> ReactElement?
}

external interface ListFormatOptions {
    var localeMatcher: String? /* "best fit" | "lookup" */
    var type: String? /* "conjunction" | "disjunction" | "unit" */
    var style: String? /* "long" | "short" | "narrow" */
}

external interface ResolvedListFormatOptions {
    var locale: String
    var type: String /* "conjunction" | "disjunction" | "unit" */
    var style: String /* "long" | "short" | "narrow" */
}

external interface ElementPart<T> {
    var type: String /* "element" */
    var value: T
}

external interface LiteralPart {
    var type: String /* "literal" */
    var value: String
}

external class ListFormat(locales: Any /* String | Array<String> */, options: ListFormatOptions?) {
    fun format(elements: Array<String>): String
    fun formatToParts(elements: Array<String>): Array<Part<ElementPart<Any>>>
    fun resolvedOptions(): ResolvedListFormatOptions
}
