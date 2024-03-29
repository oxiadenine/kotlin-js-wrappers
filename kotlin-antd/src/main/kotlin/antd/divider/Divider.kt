@file:JsModule("antd/lib/divider")
@file:JsNonModule

package antd.divider

import antd.ReactNode
import react.*

@JsName("default")
external object DividerComponent : Component<DividerProps, State> {
    override fun render(): ReactElement?
}

external interface DividerProps : Props {
    var prefixCls: String?
    var type: String? /* "horizontal" | "vertical" */
    var orientation: String? /* "left" | "right" | "center" */
    var className: String?
    var children: ReactNode?
    var dashed: Boolean?
    var style: dynamic
    var plain: Boolean?
}
