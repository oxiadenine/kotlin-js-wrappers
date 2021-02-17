@file:JsModule("antd/lib/slider")
@file:JsNonModule

package antd.slider

import antd.tooltip.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object SliderComponent : Component<SliderProps, RState> {
    override fun render(): ReactElement?
}

external interface SliderProps : SliderSingleProps, SliderRangeProps, RProps

external interface SliderSingleProps : SliderBaseProps {
    var range: Boolean?
    var value: dynamic /* Number */
    var defaultValue: dynamic /* Number */
    var onChange: dynamic /* (value: Number) -> Unit */
    var onAfterChange: dynamic /* (value: Number) -> Unit */
    var handleStyle: dynamic
    var trackStyle: dynamic
}

external interface SliderRangeProps : SliderBaseProps {
    var range: Boolean?
    var value: dynamic /* Array<Number> */
    var defaultValue: dynamic /* Array<Number> */
    var onChange: dynamic /* (value: Array<Number>) -> Unit */
    var onAfterChange: dynamic /* (value: Array<Number>) -> Unit */
    var handleStyle: dynamic
    var trackStyle: dynamic
}

external interface SliderBaseProps {
    var prefixCls: String?
    var tooltipPrefixCls: String?
    var reverse: Boolean?
    var min: Number?
    var max: Number?
    var step: Number?
    var marks: SliderMarks?
    var dots: Boolean?
    var included: Boolean?
    var disabled: Boolean?
    var vertical: Boolean?
    var tipFormatter: ((value: Number?) -> Any /* String | ReactElement */)?
    var className: String?
    var id: String?
    var style: dynamic
    var tooltipVisible: Boolean?
    var tooltipPlacement: TooltipPlacement?
    var getTooltipPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var autoFocus: Boolean?
}

external interface SliderMarks

external interface HandleGeneratorInfo {
    var value: Number
    var dragging: Boolean?
    var index: Number
}

external interface HandleGeneratorFnConfig {
    var tooltipPrefixCls: String?
    var prefixCls: String?
    var info: HandleGeneratorInfo
}
