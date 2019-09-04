package samples.rate

import antd.icon.icon
import antd.rate.rate
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.character() {
    div("rate-container") {
        attrs.id = "rate-character"
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
