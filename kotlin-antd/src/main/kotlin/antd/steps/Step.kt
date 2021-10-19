package antd.steps

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

external interface StepComponent : ComponentType<StepProps>

external interface StepProps : Props {
    var className: String?
    var description: ReactNode?
    var icon: ReactNode?
    var onClick: MouseEventHandler<HTMLElement>?
    var status: String? /* "wait" | "process" | "finish" | "error" */
    var title: ReactNode?
    var subTitle: ReactNode?
    var style: dynamic
}
