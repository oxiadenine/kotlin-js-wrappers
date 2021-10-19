@file:JsModule("antd/lib/grid/row")
@file:JsNonModule

package antd.grid

import antd.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object RowComponent : Component<RowProps, State> {
    override fun render(): ReactElement?
}

external interface RowProps : HTMLAttributes<HTMLDivElement>, RefAttributes<HTMLDivElement>, Props {
    var gutter: Any? /* Gutter | Array<Gutter> */
    var align: RowAligns?
    var justify: RowJustify?
    var prefixCls: String?
    var wrap: Boolean?
}
