package samples.card

import antd.card.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.simple() {
    styledDiv {
        css { +CardStyles.simple }
        card {
            attrs.style = js { width = 300 }
            p { +"Card content" }
            p { +"Card content" }
            p { +"Card content" }
        }
    }
}
