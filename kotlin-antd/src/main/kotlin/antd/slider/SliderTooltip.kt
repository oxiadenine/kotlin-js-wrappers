package antd.slider

import antd.RefAttributes
import antd.tooltip.TooltipPropsWithOverlay
import antd.tooltip.TooltipPropsWithTitle
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object SliderTooltipComponent : Component<SliderTooltipProps, RState> {
    override fun render(): ReactElement?
}

external interface SliderTooltipProps : TooltipPropsWithOverlay, TooltipPropsWithTitle, RefAttributes<dynamic>, RProps
