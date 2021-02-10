@file:JsModule("antd/lib/descriptions")
@file:JsNonModule

package antd.descriptions

import react.*

@JsName("default")
external object DescriptionsComponent : Component<DescriptionsProps, RState> {
    val Item: DescriptionsItemComponent

    override fun render(): ReactElement?
}

external interface DescriptionsProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var bordered: Boolean?
    var size: String? /* "middle" | "small" | "default" */
    var children: Any? /* String | ReactElement */
    var title: Any? /* String | ReactElement */
    var extra: Any? /* String | ReactElement */
    var column: Any? /* Number | ScreenSizeMap */
    var layout: String? /* "horizontal" | "vertical" */
    var colon: Boolean?
}
