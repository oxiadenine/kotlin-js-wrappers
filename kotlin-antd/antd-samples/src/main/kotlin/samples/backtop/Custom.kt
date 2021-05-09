package samples.backtop

import antd.backtop.*
import kotlinx.css.Color
import kotlinx.css.color
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
            styledStrong {
                css { color = Color("#1088e9") }
                +" blue "
            }
            +"button."
        }
    }
}
