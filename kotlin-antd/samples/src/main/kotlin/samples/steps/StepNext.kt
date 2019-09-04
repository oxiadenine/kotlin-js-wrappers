package samples.steps

import antd.button.button
import antd.message.message
import antd.steps.step
import antd.steps.steps
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private data class Step(val title: String, val content: String)

private val steps = arrayOf(
        Step("First","First-content"),
        Step("Second","Second-content"),
        Step("Last","Last-content")
)

interface StepNextAppState : RState {
    var current: Number
}

class StepNextApp : RComponent<RProps, StepNextAppState>() {
    private fun next() {
        setState {
            current = state.current.toInt() + 1
        }
    }

    private fun prev() {
        setState {
            current = state.current.toInt() - 1
        }
    }

    override fun StepNextAppState.init() {
        current = 0
    }

    override fun RBuilder.render() {
        div {
            steps {
                attrs.current = state.current
                steps.map { step ->
                    step {
                        attrs {
                            key = step.title
                            title = step.title
                        }
                    }
                }
            }
            div("steps-content") {
                +steps[state.current.toInt()].content
            }
            div("steps-action") {
                if (state.current.toInt() < steps.size - 1) {
                    button {
                        attrs {
                            type = "primary"
                            onClick = { next() }
                        }
                        +"Next"
                    }
                }
                if (state.current.toInt() == steps.size - 1) {
                    button {
                        attrs {
                            type = "primary"
                            onClick = { message.success("Processing complete!") }
                        }
                        +"Done"
                    }
                }
                if (state.current.toInt() > 0) {
                    button {
                        attrs {
                            style = js { marginLeft = 8 }
                            onClick = { prev() }
                        }
                        +"Previous"
                    }
                }
            }
        }
    }
}

fun RBuilder.stepNextApp() = child(StepNextApp::class) {}

fun RBuilder.stepNext() {
    div("steps-container") {
        attrs.id = "steps-step-next"
        stepNextApp()
    }
}
