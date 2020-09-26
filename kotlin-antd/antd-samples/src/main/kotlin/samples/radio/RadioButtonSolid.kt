package samples.radio

import antd.radio.radioButton
import antd.radio.radioGroup
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.radioButtonSolid() {
    styledDiv {
        css { +RadioStyles.radioButtonSolid }
        div {
            div {
                radioGroup {
                    attrs {
                        defaultValue = "a"
                        buttonStyle = "solid"
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
                        defaultValue = "a"
                        buttonStyle = "solid"
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
        }
    }
}
