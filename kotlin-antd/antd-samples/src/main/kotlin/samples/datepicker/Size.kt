package samples.datepicker

import antd.datepicker.*
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import kotlinx.html.id
import react.*
import react.dom.*

interface PickerSizesDemoState : RState {
    var size: String
}

class PickerSizesDemo : RComponent<RProps, PickerSizesDemoState>() {
    private val handleSizeChange = fun (event: RadioChangeEvent) {
        setState {
            size = event.target.value as String
        }
    }

    override fun PickerSizesDemoState.init() {
        size = "default"
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
            datePicker {
                attrs.size = state.size
            }
            br {}
            monthPicker {
                attrs {
                    size = state.size
                    placeholder = "Select Month"
                }
            }
            br {}
            rangePicker {
                attrs.size = state.size
            }
            br {}
            weekPicker {
                attrs {
                    size = state.size
                    placeholder = "Select Week"
                }
            }
        }
    }
}

fun RBuilder.pickerSizesDemo() = child(PickerSizesDemo::class) {}

fun RBuilder.size() {
    div("date-picker-container") {
        attrs.id = "date-pìcker-size"
        pickerSizesDemo()
    }
}
