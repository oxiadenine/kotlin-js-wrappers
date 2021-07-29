package samples.backtop

import antd.backtop.backTop
import kotlinx.css.Color
import kotlinx.css.color
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledStrong

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
