@file:JsModule("antd/lib/grid/col")
@file:JsNonModule

package antd.grid

import antd.HTMLAttributes
import org.w3c.dom.HTMLDivElement
import react.*

@JsName("default")
external object ColComponent : Component<ColProps, RState> {
    override fun render(): ReactElement?
}

external interface ColProps : HTMLAttributes<HTMLDivElement>, RProps {
    var span: ColSpanType?
    var order: ColSpanType?
    var offset: ColSpanType?
    var push: ColSpanType?
    var pull: ColSpanType?
    var xs: Any? /* ColSpanType | ColSize */
    var sm: Any? /* ColSpanType | ColSize */
    var md: Any? /* ColSpanType | ColSize */
    var lg: Any? /* ColSpanType | ColSize */
    var xl: Any? /* ColSpanType | ColSize */
    var xxl: Any? /* ColSpanType | ColSize */
    var prefixCls: String?
}

external interface ColSize {
    var span: ColSpanType?
    var order: ColSpanType?
    var offset: ColSpanType?
    var push: ColSpanType?
    var pull: ColSpanType?
}
