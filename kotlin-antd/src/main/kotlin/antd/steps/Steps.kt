@file:JsModule("antd/lib/steps")
@file:JsNonModule

package antd.steps

import react.*

@JsName("default")
external object StepsComponent : Component<StepsProps, State> {
    val Step: StepComponent

    override fun render(): ReactElement?
}

external interface StepsProps : RProps {
    var type: String? /* "default" | "navigation" */
    var className: String?
    var current: Number?
    var direction: String? /* "horizontal" | "vertical" */
    var iconPrefix: String?
    var initial: Number?
    var labelPlacement: String? /* "horizontal" | "vertical" */
    var prefixCls: String?
    var progressDot: Any? /* Boolean | Function<Any> */
    var size: String? /* "default" | "small" */
    var status: String? /* "wait" | "process" | "finish" | "error" */
    var style: dynamic
    var percent: Number?
    var onChange: ((current: Number) -> Unit)?
}
