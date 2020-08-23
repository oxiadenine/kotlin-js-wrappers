@file:JsModule("antd/lib/steps")
@file:JsNonModule

package antd.steps

import react.*

@JsName("default")
external object StepsComponent : Component<StepsProps, RState> {
    val Step: StepComponent

    override fun render(): ReactElement?
}

external interface StepsProps : RProps {
    var className: String?
    var current: Number?
    var direction: StepsDirection?
    var iconPrefix: String?
    var initial: Number?
    var labelPlacement: StepsPlacement?
    var prefixCls: String?
    var progressDot: Any? /* Boolean | Function<Any> */
    var size: StepsSize?
    var status: StepsStatus?
    var style: dynamic
    var onChange: ((current: Number) -> Unit)?
}
