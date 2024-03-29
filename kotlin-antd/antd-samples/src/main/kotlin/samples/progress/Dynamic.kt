package samples.progress

import antd.MouseEventHandler
import antd.button.button
import antd.button.buttonGroup
import antd.icon.minusOutlined
import antd.icon.plusOutlined
import antd.progress.progress
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface DynamicAppState : State {
    var percent: Number
}

class DynamicApp : RComponent<Props, DynamicAppState>() {
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
