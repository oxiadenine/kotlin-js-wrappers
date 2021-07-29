package samples.radio

import antd.radio.RadioChangeEvent
import antd.radio.radio
import antd.radio.radioGroup
import react.*
import styled.css
import styled.styledDiv

external interface RadioGroupAppState : State {
    var value: Any
}

class RadioGroupApp : RComponent<RProps, RadioGroupAppState>() {
    private val handleChange = fun(event: RadioChangeEvent) {
        console.log("radio checked", event.target.value)

        setState {
            value = event.target.value!!
        }
    }

    override fun RadioGroupAppState.init() {
        value = 1
    }

    override fun RBuilder.render() {
        radioGroup {
            attrs {
                onChange = handleChange
                value = state.value
            }
            radio {
                attrs.value = 1
                +"A"
            }
            radio {
                attrs.value = 2
                +"B"
            }
            radio {
                attrs.value = 3
                +"C"
            }
            radio {
                attrs.value = 4
                +"D"
            }
        }
    }
}

fun RBuilder.radioGroupApp() = child(RadioGroupApp::class) {}

fun RBuilder.radioGroup() {
    styledDiv {
        css { +RadioStyles.radioGroup }
        radioGroupApp()
    }
}
