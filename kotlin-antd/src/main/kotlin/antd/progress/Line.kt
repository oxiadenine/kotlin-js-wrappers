package antd.progress

import antd.configprovider.DirectionType
import antd.ReactNode
import react.*

external object LineComponent : Component<LineProps, State> {
    override fun render(): ReactElement?
}

external interface LineProps : ProgressProps {
    override var prefixCls: String?
    var direction: DirectionType?
    var children: ReactNode
}

external val sortGradient: (gradients: ProgressGradient) -> Any
external val handleGradient: (strokeColor: ProgressGradient) -> HandleGradientResult

external interface HandleGradientResult {
    var backgroundImage: String
}
