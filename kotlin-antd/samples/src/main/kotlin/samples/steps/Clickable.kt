package samples.steps

import antd.divider.divider
import antd.steps.step
import antd.steps.steps
import kotlinx.html.id
import react.*
import react.dom.div

interface ClickableDemoState : RState {
    var current: Number
}

class ClickableDemo : RComponent<RProps, ClickableDemoState>() {
    private val handleChange: (current: Number) -> Unit = {
        console.log("onchange: $it")

        setState {
            current = it
        }
    }

    override fun ClickableDemoState.init() {
        current = 0
    }

    override fun RBuilder.render() {
        div {
            steps {
                attrs {
                    current = state.current
                    onChange = handleChange
                }
                step {
                    attrs {
                        title = "Step 1"
                        description = "This is a description."
                    }
                }
                step {
                    attrs {
                        title = "Step 2"
                        description = "This is a description."
                    }
                }
                step {
                    attrs {
                        title = "Step 3"
                        description = "This is a description."
                    }
                }
            }
            divider {}
            steps {
                attrs {
                    current = state.current
                    onChange = handleChange
                    direction = "vertical"
                }
                step {
                    attrs {
                        title = "Step 1"
                        description = "This is a description."
                    }
                }
                step {
                    attrs {
                        title = "Step 2"
                        description = "This is a description."
                    }
                }
                step {
                    attrs {
                        title = "Step 3"
                        description = "This is a description."
                    }
                }
            }
        }
    }
}

fun RBuilder.clickableDemo() = child(ClickableDemo::class) {}

fun RBuilder.clickable() {
    div("steps-container") {
        attrs.id = "steps-clickable"
        clickableDemo()
    }
}
