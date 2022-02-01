package antd.steps

import kotlinext.js.*
import react.*

fun RBuilder.steps(handler: RHandler<StepsProps>) = child(StepsComponent::class, handler)
fun RBuilder.step(handler: RHandler<StepProps>) = child(StepsComponent.Step, jso {}, handler)
