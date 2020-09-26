package samples.rate

import antd.icon.icon
import antd.rate.rate
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.character() {
    styledDiv {
        css { +RateStyles.character }
        div {
            rate {
                attrs {
                    character = buildElement {
                        icon {
                            attrs.type = "heart"
                        }
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
