package samples.typography

import antd.typography.text
import kotlinx.html.id
import react.RBuilder
import react.dom.*

fun RBuilder.text() {
    div("typography-container") {
        attrs.id = "typography-text"
        div {
            text { +"Ant Design" }
            br {}
            text {
                attrs.type = "secondary"
                +"Ant Design"
            }
            br {}
            text {
                attrs.type = "warning"
                +"Ant Design"
            }
            br {}
            text {
                attrs.type = "danger"
                +"Ant Design"
            }
            br {}
            text {
                attrs.disabled = true
                +"Ant Design"
            }
            br {}
            text {
                attrs.mark = true
                +"Ant Design"
            }
            br {}
            text {
                attrs.code = true
                +"Ant Design"
            }
            br {}
            text {
                attrs.underline = true
                +"Ant Design"
            }
            br {}
            text {
                attrs.delete = true
                +"Ant Design"
            }
            br {}
            text {
                attrs.strong = true
                +"Ant Design"
            }
        }
    }
}
