package samples.radio

import antd.radio.radioButton
import antd.radio.radioGroup
import kotlinx.css.marginTop
import kotlinx.css.px
import react.RBuilder
import react.dom.div
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
            styledDiv {
                css { marginTop = 16.px }
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
