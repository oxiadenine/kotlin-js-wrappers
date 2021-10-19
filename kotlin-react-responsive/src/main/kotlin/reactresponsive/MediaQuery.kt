@file:JsModule("react-responsive")
@file:JsNonModule

package reactresponsive

import react.*

@JsName("default")
external class MediaQueryComponent : Component<MediaQueryProps, State> {
    override fun render(): ReactElement?
}

external interface MediaQueryProps : MediaQueryAllQueryable, Props {
    var component: Any? /* String | ComponentClass<Props> */
    var query: String?
    var style: dynamic
    var className: String?
    var children: Any? /* ReactElement | MediaQueryChildrenFn */
    var device: MediaQueryMatchers?
    var values: MediaQueryMatchers?
    var onBeforeChange: ((matches: Boolean) -> Unit)?
    var onChange: ((matches: Boolean) -> Unit)?
}

@JsName("toQuery")
external fun toQuery(matchers: MediaQueryAllQueryable): String

@JsName("context")
external val context: Context<MediaQueryAllQueryable>

external interface MediaQueryTypes {
    var all: Boolean?
    var grid: Boolean?
    var aural: Boolean?
    var braille: Boolean?
    var handheld: Boolean?
    var print: Boolean?
    var projection: Boolean?
    var screen: Boolean?
    var tty: Boolean?
    var tv: Boolean?
    var embossed: Boolean?
}

external interface MediaQueryMatchers {
    var aspectRatio: String?
    var deviceAspectRatio: String?
    var height: Any? /* Number | String */
    var deviceHeight: Any? /* Number | String */
    var width: Any? /* Number | String */
    var deviceWidth: Any? /* Number | String */
    var color: Boolean?
    var colorIndex: Boolean?
    var monochrome: Boolean?
    var resolution: Any? /* Number | String */
    var orientation: MediaQueryMatcherOrientation?
    var scan: MediaQueryMatcherScan?
    var type: MediaQueryType?
}

external interface MediaQueryFeatures : MediaQueryMatchers {
    var minAspectRatio: String?
    var maxAspectRatio: String?

    var minDeviceAspectRatio: String?
    var maxDeviceAspectRatio: String?

    var minHeight: Any? /* Number | String */
    var maxHeight: Any? /* Number | String */

    var minDeviceHeight: Any? /* Number | String */
    var maxDeviceHeight: Any? /* Number | String */

    var minWidth: Any? /* Number | String */
    var maxWidth: Any? /* Number | String */

    var minDeviceWidth: Any? /* Number | String */
    var maxDeviceWidth: Any? /* Number | String */

    var minColor: Number?
    var maxColor: Number?

    var minColorIndex: Number?
    var maxColorIndex: Number?

    var minMonochrome: Number?
    var maxMonochrome: Number?

    var minResolution: Any? /* Number | String */
    var maxResolution: Any? /* Number | String */
}

external interface MediaQueryAllQueryable : MediaQueryFeatures, MediaQueryTypes
