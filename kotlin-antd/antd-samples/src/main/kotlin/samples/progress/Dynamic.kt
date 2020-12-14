package samples.progress

import antd.*
import antd.button.*
import antd.button.button
import antd.icon.*
import antd.progress.progress
import react.*
import react.dom.div
import styled.*

interface DynamicAppState : RState {
    var percent: Number
}

class DynamicApp : RComponent<RProps, DynamicAppState>() {
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

    override fun DynamicAppState.init() {
        percent = 0
    }

    override fun RBuilder.render() {
        div {
            progress {
                attrs.percent = state.percent
            }
            buttonGroup {
                button {
                    attrs {
                        onClick = decline
                        icon = buildElement {
                            minusOutlined {}
                        }
                    }
                }
                button {
                    attrs {
                        onClick = increase
                        icon = buildElement {
                            plusOutlined {}
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.dynamicApp() = child(DynamicApp::class) {}

fun RBuilder.dynamic() {
    styledDiv {
        css { +ProgressStyles.dynamic }
        dynamicApp()
    }
}
