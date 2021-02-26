package antd.progress

import antd.ReactNode
import react.*

external object CircleComponent : Component<CircleProps, RState> {
    override fun render(): ReactElement?
}

external interface CircleProps : ProgressProps {
    override var prefixCls: String?
    var children: ReactNode
    var progressStatus: String
}
