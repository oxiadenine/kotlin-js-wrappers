package samples.radio

import antd.radio.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.size() {
    styledDiv {
        css { +RadioStyles.size }
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
