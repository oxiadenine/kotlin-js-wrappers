@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.displayname

external interface IntlDisplayNameFormatOptions {
    var style: String? /* "narrow" | "short" | "long" */
    var type: String? /* "language" | "region" | "script" | "currency" */
    var fallback: String? /* "code" | "none" */
}

external class IntlDisplayNames(
    locales: Any? /* String | Array<String> */,
    options: IntlDisplayNameFormatOptions? = definedExternally) {
    fun of(code: Any /* String | Number */): String? = definedExternally
    fun resolvedOptions(): DisplayNamesResolvedOptions
}

external interface DisplayNamesResolvedOptions {
    var locale: String
    var style: String /* "narrow" | "short" | "long" */
    var type: String /* "language" | "region" | "script" | "currency" */
    var fallback: String /* "code" | "none" */
}
