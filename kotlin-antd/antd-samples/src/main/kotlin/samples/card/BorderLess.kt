package samples.card

import antd.card.*
import kotlinext.js.*
import kotlinx.css.background
import kotlinx.css.padding
import react.*
import react.dom.*
import styled.*

fun RBuilder.borderLess() {
    styledDiv {
        css { +CardStyles.borderLess }
        styledDiv {
            css {
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
