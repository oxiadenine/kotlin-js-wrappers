@file:JsModule("antd/lib/grid/row")
@file:JsNonModule

package antd.grid

import antd.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object RowComponent : Component<RowProps, RowState> {
    override fun render(): ReactElement?
}

external interface RowProps : HTMLAttributes<HTMLDivElement>, RProps {
    var gutter: Any? /* Number | Map<RowBreakpoint, Number> */
    var type: RowType?
    var align: RowAlign?
    var justify: RowJustify?
    var prefixCls: String?
}

external interface RowState : RState {
    var screens: BreakpointMap
}
