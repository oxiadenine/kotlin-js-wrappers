package samples.radio

import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(event: RadioChangeEvent) {
    console.log("radio checked: ${event.target.value}")
}

fun RBuilder.radioButton() {
    div("radio-container") {
        attrs.id = "radio-radio-button"
        div {
            div {
                radioGroup {
                    attrs {
                        onChange = ::handleChange
                        defaultValue = "a"
                    }
                    radioButton {
                        attrs.value = "a"
                        +"Hangzhou"
                    }
                    radioButton {
                        attrs.value = "b"
                        +"Shanghai"
                    }
                    radioButton {
                        attrs.value = "c"
                        +"Beijing"
                    }
                    radioButton {
                        attrs.value = "d"
                        +"Chengdu"
                    }
                }
            }
            div {
                attrs.jsStyle = js { marginTop = 16 }
                radioGroup {
                    attrs {
                        onChange = ::handleChange
                        defaultValue = "a"
                    }
                    radioButton {
                        attrs.value = "a"
                        +"Hangzhou"
                    }
                    radioButton {
                        attrs {
                            value = "b"
                            disabled = true
                        }
                        +"Shanghai"
                    }
                    radioButton {
                        attrs.value = "c"
                        +"Beijing"
                    }
                    radioButton {
                        attrs.value = "d"
                        +"Chengdu"
                    }
                }
            }
            div {
                attrs.jsStyle = js { marginTop = 16 }
                radioGroup {
                    attrs {
                        disabled = true
                        onChange = ::handleChange
                        defaultValue = "a"
                    }
                    radioButton {
                        attrs.value = "a"
                        +"Hangzhou"
                    }
                    radioButton {
                        attrs.value = "b"
                        +"Shanghai"
                    }
                    radioButton {
                        attrs.value = "c"
                        +"Beijing"
                    }
                    radioButton {
                        attrs.value = "d"
                        +"Chengdu"
                    }
                }
            }
        }
    }
}
