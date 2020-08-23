@file:JsModule("antd/lib/descriptions")
@file:JsNonModule

package antd.descriptions

import react.Component
import react.RProps
import react.RState
import react.ReactElement

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
    var size: DescriptionsSize?
    var children: ReactElement?
    var title: String?
    var column: Any? /* Number | ColumnBreakpoint */
    var layout: DescriptionsLayout?
}

external interface ColumnBreakpoint {
    var xxl: Number?
    var xl: Number?
    var lg: Number?
    var md: Number?
    var sm: Number?
    var xs: Number?
}
