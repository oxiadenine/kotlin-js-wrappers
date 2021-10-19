package samples.button

import antd.button.button
import antd.button.buttonGroup
import antd.icon.downloadOutlined
import antd.icon.leftOutlined
import antd.icon.rightOutlined
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

external interface ButtonSizeState : State {
    var size: String
}

class ButtonSize : RComponent<Props, ButtonSizeState>() {
    private val handleSizeChange = fun(event: RadioChangeEvent) {
        setState {
            size = event.target.value as String
        }
    }

    override fun ButtonSizeState.init() {
        size = "large"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    value = state.size
                    onChange = handleSizeChange
                }
                radioButton {
                    attrs.value = "large"
                    +"Large"
                }
                radioButton {
                    attrs.value = "default"
                    +"Default"
                }
                radioButton {
                    attrs.value = "small"
                    +"Small"
                }
            }
            br {}
            br {}
            button {
                attrs {
                    type = "primary"
                    size = state.size
                }
                +"Primary"
            }
            button {
                attrs.size = state.size
                +"Normal"
            }
            button {
                attrs {
                    type = "dashed"
                    size = state.size
                }
                +"Dashed"
            }
            button {
                attrs {
                    type = "danger"
                    size = state.size
                }
                +"Danger"
            }
            button {
                attrs {
                    type = "link"
                    size = state.size
                }
                +"Link"
            }
            br {}
            button {
                attrs {
                    type = "primary"
                    shape = "circle"
                    icon = buildElement {
                        downloadOutlined {}
                    }
                    size = state.size
                }
            }
            button {
                attrs {
                    type = "primary"
                    shape = "round"
                    icon = buildElement {
                        downloadOutlined {}
                    }
                    size = state.size
                }
                +"Download"
            }
            button {
                attrs {
                    type = "primary"
                    icon = buildElement {
                        downloadOutlined {}
                    }
                    size = state.size
                }
                +"Download"
            }
            br {}
            buttonGroup {
                attrs.size = state.size
                button {
                    attrs.type = "primary"
                    leftOutlined {}
                    +"Backward"
                }
                button {
                    attrs.type = "primary"
                    +"Forward"
                    rightOutlined {}
                }
            }
        }
    }
}

fun RBuilder.buttonSize() = child(ButtonSize::class) {}

fun RBuilder.size() {
    styledDiv {
        css { +ButtonStyles.size }
        buttonSize()
    }
}
