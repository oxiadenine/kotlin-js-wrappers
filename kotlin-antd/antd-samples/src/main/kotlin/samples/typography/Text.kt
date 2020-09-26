package samples.typography

import antd.typography.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.text() {
    styledDiv {
        css { +TypographyStyles.text }
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
