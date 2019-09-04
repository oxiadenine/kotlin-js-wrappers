@file:JsModule("antd/lib/slider")

package antd.slider

import antd.tooltip.TooltipPlacement
import org.w3c.dom.HTMLElement
import react.*

@JsName("default")
external object SliderComponent : Component<SliderProps, SliderState> {
    override fun render(): ReactElement?
}

external interface SliderProps : RProps {
    var prefixCls: String?
    var tooltipPrefixCls: String?
    var range: Boolean?
    var min: Number?
    var max: Number?
    var step: Number?
    var marks: SliderMarks?
    var dots: Boolean?
    var value: SliderValue?
    var defaultValue: SliderValue?
    var included: Boolean?
    var disabled: Boolean?
    var vertical: Boolean?
    var onChange: ((value: SliderValue) -> Unit)?
    var onAfterChange: ((value: SliderValue) -> Unit)?
    var tipFormatter: ((value: Number) -> Any /* String | ReactElement */)?
    var className: String?
    var id: String?
    var style: dynamic
    var tooltipVisible: Boolean?
    var tooltipPlacement: TooltipPlacement?
    var getTooltipPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
}

external interface SliderState : RState {
    var visibles: Any /* {
        [index: Number]: Boolean
    }; */
}

external interface HandleGeneratorInfo {
    var value: Number
    var dragging: Boolean
    var index: Number
    var rest: Array<Any>
}

external interface SliderMarks {
    /* [key: Number]: ReactElement | {
        style: Any
        label: ReactElement
    } */
}
