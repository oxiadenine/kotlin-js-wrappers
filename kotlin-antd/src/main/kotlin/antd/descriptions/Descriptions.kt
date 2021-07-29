@file:JsModule("antd/lib/descriptions")
@file:JsNonModule

package antd.descriptions

import antd.ReactNode
import react.*

@JsName("default")
external object DescriptionsComponent : Component<DescriptionsProps, State> {
    val Item: DescriptionsItemComponent

    override fun render(): ReactElement?
}

external interface DescriptionsProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var bordered: Boolean?
    var size: String? /* "middle" | "small" | "default" */
    var children: ReactNode?
    var title: ReactNode?
    var extra: ReactNode?
    var column: Any? /* Number | ScreenSizeMap */
    var layout: String? /* "horizontal" | "vertical" */
    var colon: Boolean?
}
