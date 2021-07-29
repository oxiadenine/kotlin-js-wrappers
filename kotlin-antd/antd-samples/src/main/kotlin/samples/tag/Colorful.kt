package samples.tag

import antd.tag.tag
import kotlinx.css.marginBottom
import kotlinx.css.px
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledH4

fun RBuilder.colorful() {
    styledDiv {
        css { +TagStyles.colorful }
        div {
            styledH4 {
                css { marginBottom = 16.px }
                +"Presets:"
            }
            div {
                tag {
                    attrs.color = "magenta"
                    +"magenta"
                }
                tag {
                    attrs.color = "red"
                    +"red"
                }
                tag {
                    attrs.color = "volcano"
                    +"volcano"
                }
                tag {
                    attrs.color = "orange"
                    +"orange"
                }
                tag {
                    attrs.color = "gold"
                    +"gold"
                }
                tag {
                    attrs.color = "lime"
                    +"lime"
                }
                tag {
                    attrs.color = "green"
                    +"green"
                }
                tag {
                    attrs.color = "cyan"
                    +"cyan"
                }
                tag {
                    attrs.color = "blue"
                    +"blue"
                }
                tag {
                    attrs.color = "geekblue"
                    +"geekblue"
                }
                tag {
                    attrs.color = "purple"
                    +"purple"
                }
            }
            styledH4 {
                css { marginBottom = 16.px }
                +"Custom:"
            }
            div {
                tag {
                    attrs.color = "#f50"
                    +"#f50"
                }
                tag {
                    attrs.color = "#2db7f5"
                    +"#2db7f5"
                }
                tag {
                    attrs.color = "#87d068"
                    +"#87d068"
                }
                tag {
                    attrs.color = "#108ee9"
                    +"#108ee9"
                }
            }
        }
    }
}
