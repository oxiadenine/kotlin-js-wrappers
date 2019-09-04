package antd.progress

import react.Component
import react.RState
import react.ReactElement

external object LineComponent : Component<LineProps, RState> {
    override fun render(): ReactElement?
}

external interface LineProps : ProgressProps {
    override var prefixCls: String?
    var children: ReactElement
}

external val sortGradient: (gradients: ProgressGradient) -> Any
external val handleGradient: (strokeColor: ProgressGradient) -> HandleGradientResult

external interface HandleGradientResult {
    var backgroundImage: String
}
