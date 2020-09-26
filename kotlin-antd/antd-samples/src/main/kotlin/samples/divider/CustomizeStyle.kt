package samples.divider

import antd.divider.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.customizeStyle() {
    styledDiv {
        css { +DividerStyles.customizeStyle }
        div {
            +"Text"
            divider {
                attrs.style = js {
                    height = 2
                    backgroundColor = "#7cb305"
                }
            }
            divider {
                attrs {
                    style = js { borderColor = "#7cb305" }
                    dashed = true
                }
            }
            divider {
                attrs {
                    type = "vertical"
                    style = js {
                        height = 60
                        backgroundColor = "#7cb305"
                    }
                }
            }
            divider {
                attrs {
                    type = "vertical"
                    style = js {
                        height = 60
                        borderColor = "#7cb305"
                    }
                    dashed = true
                }
            }
        }
    }
}
