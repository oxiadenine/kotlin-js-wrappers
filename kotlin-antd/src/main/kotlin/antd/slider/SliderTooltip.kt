package antd.slider

import antd.RefAttributes
import antd.tooltip.TooltipPropsWithOverlay
import antd.tooltip.TooltipPropsWithTitle
import react.*

external object SliderTooltipComponent : Component<SliderTooltipProps, State> {
    override fun render(): ReactElement?
}

external interface SliderTooltipProps : TooltipPropsWithOverlay, TooltipPropsWithTitle, RefAttributes<dynamic>, RProps
