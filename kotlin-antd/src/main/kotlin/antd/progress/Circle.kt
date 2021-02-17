package antd.progress

import react.*

external object CircleComponent : Component<CircleProps, RState> {
    override fun render(): ReactElement?
}

external interface CircleProps : ProgressProps {
    override var prefixCls: String?
    var children: Any /* String | ReactElement */
    var progressStatus: String
}
