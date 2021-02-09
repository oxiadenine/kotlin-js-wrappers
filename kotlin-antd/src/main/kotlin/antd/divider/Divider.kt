@file:JsModule("antd/lib/divider")
@file:JsNonModule

package antd.divider

import react.*

@JsName("default")
external object DividerComponent : Component<DividerProps, RState> {
    override fun render(): ReactElement?
}

external interface DividerProps : RProps {
    var prefixCls: String?
    var type: String? /* "horizontal" | "vertical" */
    var orientation: String? /* "left" | "right" | "center" */
    var className: String?
    var children: Any? /* String | ReactElement */
    var dashed: Boolean?
    var style: dynamic
    var plain: Boolean?
}
