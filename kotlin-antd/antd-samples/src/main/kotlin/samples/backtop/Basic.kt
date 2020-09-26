package samples.backtop

import antd.backtop.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +BackTopStyles.basic }
        div {
            backTop {}
            +"Scroll down to see the bottom-right"
            strong {
                attrs.jsStyle = js { color = "rgba(64, 64, 64, 0.6)" }
                +" gray "
            }
            +"button."
        }
    }
}
