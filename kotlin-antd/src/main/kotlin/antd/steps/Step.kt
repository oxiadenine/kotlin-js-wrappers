package antd.steps

import antd.*
import org.w3c.dom.*
import react.*

external object StepComponent : Component<StepProps, RState> {
    override fun render(): ReactElement?
}

external interface StepProps : RProps {
    var className: String?
    var description: ReactNode?
    var icon: ReactNode?
    var onClick: MouseEventHandler<HTMLElement>?
    var status: String? /* "wait" | "process" | "finish" | "error" */
    var title: ReactNode?
    var subTitle: ReactNode?
    var style: dynamic
}
