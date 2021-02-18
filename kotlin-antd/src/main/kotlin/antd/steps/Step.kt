package antd.steps

import antd.*
import org.w3c.dom.*
import react.*

external object StepComponent : Component<StepProps, RState> {
    override fun render(): ReactElement?
}

external interface StepProps : RProps {
    var className: String?
    var description: Any? /* String | ReactElement */
    var icon: Any? /* String | ReactElement */
    var onClick: MouseEventHandler<HTMLElement>?
    var status: String? /* "wait" | "process" | "finish" | "error" */
    var title: Any? /* String | ReactElement */
    var subTitle: Any? /* String | ReactElement */
    var style: dynamic
}
