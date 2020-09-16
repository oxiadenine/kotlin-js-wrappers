@file:JsModule("react-responsive")
@file:JsNonModule

package reactresponsive

@JsName("useMediaQuery")
external fun useMediaQuery(
    settings: MediaQuerySettings,
    device: MediaQueryMatchers? = definedExternally,
    callback: ((matches: Boolean) -> Unit)? = definedExternally): Boolean

external interface MediaQuerySettings : MediaQueryAllQueryable {
    var query: String?
}
