package samples.rate

import antd.icon.*
import antd.rate.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.character() {
    styledDiv {
        css { +RateStyles.character }
        div {
            rate {
                attrs {
                    character = buildElement {
                        heartOutlined {}
                    }
                    allowHalf = true
                }
            }
            br {}
            rate {
                attrs {
                    character = "A"
                    allowHalf = true
                    style = js { fontSize = 36 }
                }
            }
            br {}
            rate {
                attrs {
                    character = "好"
                    allowHalf = true
                }
            }
        }
    }
}
