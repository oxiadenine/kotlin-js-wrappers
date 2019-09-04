package antd.steps

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.steps(handler: RHandler<StepsProps>) = child(StepsComponent::class, handler)
fun RBuilder.step(handler: RHandler<StepProps>) = child(StepsComponent.Step, jsObject {}, handler)
