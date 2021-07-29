package samples.rate

import antd.icon.heartOutlined
import antd.rate.rate
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

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
