package samples.backtop

import antd.backtop.backTop
import kotlinext.js.js
import kotlinx.html.classes
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.jsStyle
import react.dom.strong

fun RBuilder.custom() {
    div("back-top-container") {
        attrs.id = "back-top-custom"
        div {
            backTop {
                div {
                    attrs.classes = setOf("ant-back-top-inner")
                    +"UP"
                }
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
