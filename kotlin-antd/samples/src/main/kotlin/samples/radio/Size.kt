package samples.radio

import antd.radio.radioButton
import antd.radio.radioGroup
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.size() {
    div("radio-container") {
        attrs.id = "radio-size"
        div {
            div {
                radioGroup {
                    attrs {
                        defaultValue = "a"
                        size = "large"
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
                    attrs.defaultValue = "a"
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
                        defaultValue = "a"
                        size = "small"
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
