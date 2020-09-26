package samples.card

import antd.card.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.borderLess() {
    styledDiv {
        css { +CardStyles.borderLess }
        div {
            attrs.jsStyle = js {
                background = "#ECECEC"
                padding = "30px"
            }
            card {
                attrs {
                    title = "Card tittle"
                    bordered = false
                    style = js { width = 300 }
                }
                p { +"Card content" }
                p { +"Card content" }
                p { +"Card content" }
            }
        }
    }
}
