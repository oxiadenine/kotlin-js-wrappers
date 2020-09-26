package samples.backtop

import antd.backtop.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.custom() {
    styledDiv {
        css { +BackTopStyles.custom }
        div {
            backTop {
                div(classes = "ant-back-top-inner") { +"UP" }
            }
            +"Scroll down to see the bottom-right"
            strong {
                attrs.jsStyle = js { color = "#1088e9" }
                +" blue "
            }
            +"button."
        }
    }
}
