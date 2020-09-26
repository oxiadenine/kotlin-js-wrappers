package samples.backtop

import antd.backtop.backTop
import kotlinext.js.js
import react.RBuilder
import react.dom.div
import react.dom.jsStyle
import react.dom.strong
import styled.css
import styled.styledDiv

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
