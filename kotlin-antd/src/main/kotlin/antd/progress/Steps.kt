package antd.progress

import react.*

external object StepsComponent : Component<StepsProps, State> {
    override fun render(): ReactElement?
}

external interface StepsProps : ProgressProps {
    override var steps: Number?
    override var size: ProgressSize?
    override var strokeColor: dynamic /* String */
    override var trailColor: String?
}
