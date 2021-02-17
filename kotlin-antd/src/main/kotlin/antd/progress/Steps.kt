package antd.progress

import react.Component
import react.RState
import react.ReactElement

external object StepsComponent : Component<StepsProps, RState> {
    override fun render(): ReactElement?
}

external interface StepsProps : ProgressProps {
    override var steps: Number?
    override var size: ProgressSize?
    override var strokeColor: dynamic /* String */
    override var trailColor: String?
}
