@file:JsModule("react-responsive")
@file:JsNonModule

package reactresponsive

import react.*

@JsName("default")
external class MediaQueryComponent : Component<MediaQueryProps, RState> {
    override fun render(): ReactElement?
}

external interface MediaQueryProps : MediaQueryAllQueryable, RProps {
    var component: Any? /* String | RClass<RProps> */
        get() = definedExternally
        set(value) = definedExternally
    var query: String?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var children: Any? /* ReactElement | MediaQueryChildrenFn */
        get() = definedExternally
        set(value) = definedExternally
    var device: MediaQueryMatchers?
        get() = definedExternally
        set(value) = definedExternally
    var values: MediaQueryMatchers?
        get() = definedExternally
        set(value) = definedExternally
    var onBeforeChange: ((matches: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((matches: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("toQuery")
external fun toQuery(matchers: MediaQueryAllQueryable): String

@JsName("context")
external val context: RContext<MediaQueryAllQueryable>

external interface MediaQueryTypes {
    var all: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var grid: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var aural: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var braille: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var handheld: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var print: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var projection: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var screen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tty: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tv: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var embossed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MediaQueryMatchers {
    var aspectRatio: String?
        get() = definedExternally
        set(value) = definedExternally
    var deviceAspectRatio: String?
        get() = definedExternally
        set(value) = definedExternally
    var height: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var deviceHeight: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var width: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var deviceWidth: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var color: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var colorIndex: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var monochrome: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var orientation: MediaQueryMatcherOrientation?
        get() = definedExternally
        set(value) = definedExternally
    var scan: MediaQueryMatcherScan?
        get() = definedExternally
        set(value) = definedExternally
    var type: MediaQueryType?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MediaQueryFeatures : MediaQueryMatchers {
    var minAspectRatio: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxAspectRatio: String?
        get() = definedExternally
        set(value) = definedExternally

    var minDeviceAspectRatio: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxDeviceAspectRatio: String?
        get() = definedExternally
        set(value) = definedExternally

    var minHeight: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var maxHeight: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally

    var minDeviceHeight: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var maxDeviceHeight: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally

    var minWidth: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var maxWidth: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally

    var minDeviceWidth: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var maxDeviceWidth: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally

    var minColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxColor: Number?
        get() = definedExternally
        set(value) = definedExternally

    var minColorIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxColorIndex: Number?
        get() = definedExternally
        set(value) = definedExternally

    var minMonochrome: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxMonochrome: Number?
        get() = definedExternally
        set(value) = definedExternally

    var minResolution: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var maxResolution: Any? /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MediaQueryAllQueryable : MediaQueryFeatures, MediaQueryTypes
