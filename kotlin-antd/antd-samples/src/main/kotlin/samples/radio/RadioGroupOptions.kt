package samples.radio

import antd.checkbox.*
import antd.radio.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val plainOptions: Array<CheckboxValueType> = arrayOf("Apple", "Pear", "Orange")
private val groupOptions = arrayOf<CheckboxOptionType>(
    jsObject {
        label = "Apple"
        value = "Apple"
    },
    jsObject {
        label = "Pear"
        value = "Pear"
    },
    jsObject {
        label = "Orange"
        value = "Orange"
    }
)
private val optionsWithDisabled = arrayOf<CheckboxOptionType>(
    jsObject {
        label = "Apple"
        value = "Apple"
    },
    jsObject {
        label = "Pear"
        value = "Pear"
    },
    jsObject {
        label = "Orange"
        value = "Orange"
        disabled = false
    }
)

external interface RadioGroupOptionsAppState : RState {
    var value1: CheckboxValueType
    var value2: CheckboxValueType
    var value3: CheckboxValueType
}

class RadioGroupOptionsApp : RComponent<RProps, RadioGroupOptionsAppState>() {
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
