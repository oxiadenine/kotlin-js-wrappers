package samples.progress

import antd.MouseEventHandler
import antd.button.button
import antd.button.buttonGroup
import antd.progress.progress
import kotlinx.html.id
import react.*
import react.dom.div

interface CircleDynamicAppState : RState {
    var percent: Number
}

class CircleDynamicApp : RComponent<RProps, CircleDynamicAppState>() {
    private val increase: MouseEventHandler<Any> = {
        var newPercent = state.percent.toInt() + 10

        if (newPercent > 100) {
            newPercent = 100
        }

        setState {
            percent = newPercent
        }
    }

    private val decline: MouseEventHandler<Any> = {
        var newPercent = state.percent.toInt() - 10

        if (newPercent < 0) {
            newPercent = 0
        }

        setState {
            percent = newPercent
        }
    }

    override fun CircleDynamicAppState.init() {
        percent = 0
    }

    override fun RBuilder.render() {
        div {
            progress {
                attrs {
                    type = "circle"
                    percent = state.percent
                }
            }
            buttonGroup {
                button {
                    attrs {
                        onClick = decline
                        icon = "minus"
                    }
                }
                button {
                    attrs {
                        onClick = increase
                        icon = "plus"
                    }
                }
            }
        }
    }
}

fun RBuilder.circleDynamicApp() = child(CircleDynamicApp::class) {}

fun RBuilder.circleDynamic() {
    div("progress-container") {
        attrs.id = "progress-circle-dynamic"
        circleDynamicApp()
    }
}
