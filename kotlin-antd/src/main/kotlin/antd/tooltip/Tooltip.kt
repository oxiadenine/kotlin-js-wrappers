@file:JsModule("antd/lib/tooltip")
@file:JsNonModule

package antd.tooltip

import kotlinext.js.Object
import org.w3c.dom.HTMLElement
import react.*

@JsName("default")
external object TooltipComponent : Component<TooltipProps, RState> {
    override fun render(): ReactElement?
}

external interface TooltipProps : AbstractTooltipProps, RProps {
    var title: Any? /* ReactElement | RenderFunction */
    var overlay: Any? /* ReactElement | RenderFunction */
}

external interface AbstractTooltipProps {
    var prefixCls: String?
    var overlayClassName: String?
    var style: dynamic
    var className: String?
    var overlayStyle: dynamic
    var placement: TooltipPlacement?
    var builtinPlacements: Object?
    var defaultVisible: Boolean?
    var visible: Boolean?
    var onVisibleChange: ((visible: Boolean) -> Unit)?
    var mouseEnterDelay: Number?
    var mouseLeaveDelay: Number?
    var transitionName: String?
    var trigger: TooltipTrigger?
    var openClassName: String?
    var arrowPointAtCenter: Boolean?
    var autoAdjustOverflow: Any? /* Boolean | AdjustOverflow */
    var getTooltipContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var children: ReactElement?
    var align: TooltipAlignConfig?
    var destroyTooltipOnHide: Boolean?
}

external interface TooltipAlignConfig {
    var points: Array<String>?
    var offset: Array<Any /* Number | String */>?
    var targetOffset: Array<Any /* Number | String */>?
    var overflow: TooltipOverflow?
    var useCssRight: Boolean?
    var usevCssBottom: Boolean?
    var useCssTransform: Boolean?
}

external interface TooltipOverflow {
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
