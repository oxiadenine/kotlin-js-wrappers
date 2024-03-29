package samples.radio

import antd.input.input
import antd.radio.RadioChangeEvent
import antd.radio.radio
import antd.radio.radioGroup
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

external interface RadioGroupMoreAppState : State {
    var value: Any
}

class RadioGroupMoreApp : RComponent<Props, RadioGroupMoreAppState>() {
    private val handleChange = fun(event: RadioChangeEvent) {
        console.log("radio checked", event.target.value)

        setState {
            value = event.target.value!!
        }
    }

    override fun RadioGroupMoreAppState.init() {
        value = 1
    }

    override fun RBuilder.render() {
        val radioStyle = js {
            display = "block"
            height = "30px"
            lineHeight = "30px"
        }


        radioGroup {
            attrs {
                onChange = handleChange
                value = state.value
            }
            radio {
                attrs {
                    style = radioStyle
                    value = 1
                }
                +"Option A"
            }
            radio {
                attrs {
                    style = radioStyle
                    value = 2
                }
                +"Option B"
            }
            radio {
                attrs {
                    style = radioStyle
                    value = 3
                }
                +"Option C"
            }
            radio {
                attrs {
                    style = radioStyle
                    value = 4
                }
                +"More... "
                if (state.value == 4) {
                    input {
                        attrs.style = js {
                            width = 100
                            marginLeft = 10
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.radioGroupMoreApp() = child(RadioGroupMoreApp::class) {}

fun RBuilder.radioGroupMore() {
    styledDiv {
        css { +RadioStyles.radioGroupMore }
        radioGroupMoreApp()
    }
}
