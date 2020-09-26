package samples.slider

import antd.grid.*
import antd.grid.col
import antd.inputnumber.*
import antd.slider.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

interface IntegerStepState : RState {
    var inputValue: SliderValue
}

class IntegerStep : RComponent<RProps, IntegerStepState>() {
    private val handleChange = fun(value: SliderValue) {
        setState {
            inputValue = value
        }
    }


    override fun IntegerStepState.init() {
        inputValue = 1
    }

    override fun RBuilder.render() {
        row {
            col {
                attrs.span = 12
                slider {
                    attrs {
                        min = 1
                        max = 20
                        onChange = handleChange
                        value = if (jsTypeOf(state.inputValue) == "number") state.inputValue else 0
                    }
                }
            }
            col {
                attrs.span = 4
                inputNumber {
                    attrs {
                        min = 1
                        max = 20
                        style = js { marginLeft = 16 }
                        value = state.inputValue
                        onChange = handleChange
                    }
                }
            }
        }
    }
}

fun RBuilder.integerStep() = child(IntegerStep::class) {}

interface DecimalStepState : RState {
    var inputValue: SliderValue
}

class DecimalStep : RComponent<RProps, DecimalStepState>() {
    private val handleChange = fun(value: SliderValue) {
        if (value.unsafeCast<Double>().isNaN()) {
            return
        }

        setState {
            inputValue = value
        }
    }


    override fun DecimalStepState.init() {
        inputValue = 0
    }

    override fun RBuilder.render() {
        row {
            col {
                attrs.span = 12
                slider {
                    attrs {
                        min = 0
                        max = 1
                        onChange = handleChange
                        value = if (jsTypeOf(state.inputValue) == "number") state.inputValue else 0
                        step = 0.01
                    }
                }
            }
            col {
                attrs.span = 4
                inputNumber {
                    attrs {
                        min = 0
                        max = 1
                        style = js { marginLeft = 16 }
                        step = 0.01
                        value = state.inputValue
                        onChange = handleChange
                    }
                }
            }
        }
    }
}

fun RBuilder.decimalStep() = child(DecimalStep::class) {}

fun RBuilder.inputNumber() {
    styledDiv {
        css { +SliderStyles.inputNumber }
        div {
            integerStep()
            decimalStep()
        }
    }
}
