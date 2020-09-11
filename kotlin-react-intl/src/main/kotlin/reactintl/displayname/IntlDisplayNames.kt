@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.displayname

external interface IntlDisplayNameFormatOptions {
    var style: String? /* "narrow" | "short" | "long" */
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "language" | "region" | "script" | "currency" */
        get() = definedExternally
        set(value) = definedExternally
    var fallback: String? /* "code" | "none" */
        get() = definedExternally
        set(value) = definedExternally
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
