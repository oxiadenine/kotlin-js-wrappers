package antd.layout

import antd.*
import org.w3c.dom.*
import react.*

external object SiderComponent : Component<SiderProps, SiderState> {
    override fun render(): ReactElement?
}

external val sderContext: RContext<SiderContextProps>

external interface SiderProps : HTMLAttributes<HTMLDivElement>, RProps {
    var prefixCls: String?
    var collapsible: Boolean?
    var collapsed: Boolean?
    var defaultCollapsed: Boolean?
    var reverseArrow: Boolean?
    var onCollapse: ((collapsed: Boolean, type: CollapseType) -> Unit)?
    var zeroWidthTriggerStyle: dynamic
    var trigger: Any? /* String | ReactElement */
    var width: Any? /* Number | String */
    var collapsedWidth: Any? /* Number | String */
    var breakpoint: String /* "xs" | "sm" | "md" | "lg" | "xl" | "xxl" */
    var theme: SiderTheme?
    var onBreakpoint: ((broken: Boolean) -> Unit)?
}

external interface SiderState : RState {
    var collapsed: Boolean?
    var below: Boolean
}

external interface InternalSideProps : SiderProps, LayoutContextProps

external interface SiderContextProps {
    var siderCollapsed: Boolean?
    var collapsedWidth: Any? /* String | Number */
}
