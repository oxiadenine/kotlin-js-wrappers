package samples.radio

import antd.checkbox.CheckboxOptionType
import antd.checkbox.CheckboxValueType
import antd.radio.RadioChangeEvent
import antd.radio.radioGroup
import kotlinext.js.jso
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private val plainOptions: Array<CheckboxValueType> = arrayOf("Apple", "Pear", "Orange")
private val groupOptions = arrayOf<CheckboxOptionType>(
    jso {
        label = "Apple"
        value = "Apple"
    },
    jso {
        label = "Pear"
        value = "Pear"
    },
    jso {
        label = "Orange"
        value = "Orange"
    }
)
private val optionsWithDisabled = arrayOf<CheckboxOptionType>(
    jso {
        label = "Apple"
        value = "Apple"
    },
    jso {
        label = "Pear"
        value = "Pear"
    },
    jso {
        label = "Orange"
        value = "Orange"
        disabled = false
    }
)

external interface RadioGroupOptionsAppState : State {
    var value1: CheckboxValueType
    var value2: CheckboxValueType
    var value3: CheckboxValueType
}

class RadioGroupOptionsApp : RComponent<Props, RadioGroupOptionsAppState>() {
    private val handleChange1 = fun(event: RadioChangeEvent) {
        console.log("radio1 checked", event.target.value)

        setState {
            value1 = event.target.value!!
        }
    }

    private val handleChange2 = fun(event: RadioChangeEvent) {
        console.log("radio2 checked", event.target.value)

        setState {
            value2 = event.target.value!!
        }
    }

    private val handleChange3 = fun(event: RadioChangeEvent) {
        console.log("radio3 checked", event.target.value)

        setState {
            value3 = event.target.value!!
        }
    }

    override fun RadioGroupOptionsAppState.init() {
        value1 = "Apple"
        value2 = "Apple"
        value3 = "Apple"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    options = plainOptions.unsafeCast<Array<Any>>()
                    onChange = handleChange1
                    value = state.value1
                }
            }
            br {}
            radioGroup {
                attrs {
                    options = groupOptions.unsafeCast<Array<Any>>()
                    onChange = handleChange2
                    value = state.value2
                }
            }
            br {}
            radioGroup {
                attrs {
                    options = optionsWithDisabled.unsafeCast<Array<Any>>()
                    onChange = handleChange3
                    value = state.value3
                }
            }
        }
    }
}

fun RBuilder.radioGroupOptionsApp() = child(RadioGroupOptionsApp::class) {}

fun RBuilder.radioGroupOptions() {
    styledDiv {
        css { +RadioStyles.radioGroupOptions }
        radioGroupOptionsApp()
    }
}
