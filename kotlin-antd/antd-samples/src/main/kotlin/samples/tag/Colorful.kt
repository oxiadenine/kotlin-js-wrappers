package samples.tag

import antd.tag.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.colorful() {
    styledDiv {
        css { +TagStyles.colorful }
        div {
            h4 {
                attrs.jsStyle = js { marginBttom = 16 }
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
            h4 {
                attrs.jsStyle = js { marginBttom = 16 }
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
