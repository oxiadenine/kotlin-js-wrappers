package antd.progress

import react.Component
import react.RState
import react.ReactElement

external object CircleComponent : Component<CircleProps, RState> {
    override fun render(): ReactElement?
}

external interface CircleProps : ProgressProps {
    override var prefixCls: String?
    var children: ReactElement
    var progressStatus: String
}
