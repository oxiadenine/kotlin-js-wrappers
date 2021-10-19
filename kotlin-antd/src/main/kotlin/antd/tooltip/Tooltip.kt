@file:JsModule("antd/lib/tooltip")
@file:JsNonModule

package antd.tooltip

import antd.LiteralUnion
import antd.PresetColorType
import antd.RefAttributes
import antd.ReactNode
import org.w3c.dom.*
import react.*

@JsName("default")
external object TooltipComponent : Component<TooltipProps, State> {
    override fun render(): ReactElement?
}

external interface TooltipProps : TooltipPropsWithTitle, TooltipPropsWithOverlay, RefAttributes<dynamic>, Props

external interface TooltipPropsWithOverlay : AbstractTooltipProps {
    var title: Any? /* ReactNode | RenderFunction */
    override var overlay: dynamic /* ReactNode | RenderFunction */
}

external interface TooltipPropsWithTitle : AbstractTooltipProps {
    var title: Any? /* ReactNode | RenderFunction */
    override var overlay: dynamic /* ReactNode | RenderFunction */
}

external interface AbstractTooltipProps : RcTooltipProps {
    var style: dynamic
    override var className: String?
    var color: LiteralUnion<PresetColorType, String>?
    override var placement: TooltipPlacement?
    override var builtinPlacements: BuildInPlacements?
    var openClassName: String?
    var arrowPointAtCenter: Boolean?
    var autoAdjustOverflow: Any? /* Boolean | AdjustOverflow */
    override var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    override var children: ReactNode
}

external interface RcTooltipProps : TriggerProps {
    var trigger: Any? /* ActionType | Array<ActionType> */
    var defaultVisible: Boolean?
    var visible: Boolean?
    var placement: String?
    var transitionName: String?
    var animation: AnimationType?
    var onVisibleChange: ((visible: Boolean) -> Unit)?
    var afterVisibleChange: (() -> Unit)?
    var overlay: Any /* () -> ReactNode | ReactNode */
    var overlayStyle: dynamic
    var overlayClassName: String?
    override var prefixCls: String?
    override var mouseEnterDelay: Number?
    override var mouseLeaveDelay: Number?
    var getTooltipContainer: ((node: HTMLElement) -> HTMLElement)?
    var destroyTooltipOnHide: Any? /* Boolean | DestroyTooltipOnHide */
    var align: AlignType?
    var arrowContent: ReactNode?
    var id: String?
    override var children: dynamic /* ReactNode */
    override var popupVisible: Boolean?
    var overlayInnerStyle: dynamic
}

external interface DestroyTooltipOnHide {
    var keepParent: Boolean?
}

external interface TooltipAlignConfig {
    var points: Array<String>?
    var offset: Array<Any /* Number | String */>?
    var targetOffset: Array<Any /* Number | String */>?
    var overflow: TooltipAlignConfigOverflow?
    var useCssRight: Boolean?
    var usevCssBottom: Boolean?
    var useCssTransform: Boolean?
}

external interface TooltipAlignConfigOverflow {
    var adjustX: Boolean
    var adjustY: Boolean
}

external interface AdjustOverflow {
    var adjustX: Number? /* 0 | 1 */
    var adjustY: Number? /* 0 | 1 */
}

external interface PlacementsConfig {
    var arrowWidth: Number?
    var horizontalArrowShift: Number?
    var verticalArrowShift: Number?
    var arrowPointAtCenter: Boolean?
    var autoAdjustOverflow: Any?
}
