package samples.radio

import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import kotlinx.css.marginTop
import kotlinx.css.px
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

private fun handleChange(event: RadioChangeEvent) {
    console.log("radio checked: ${event.target.value}")
}

fun RBuilder.radioButton() {
    styledDiv {
        css { +RadioStyles.radioButton }
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
            styledDiv {
                css { marginTop = 16.px }
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
            styledDiv {
                css { marginTop = 16.px }
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
