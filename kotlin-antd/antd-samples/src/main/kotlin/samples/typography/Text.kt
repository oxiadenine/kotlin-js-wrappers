package samples.typography

import antd.typography.*
import antd.typography.link
import react.*
import react.dom.*
import styled.*

fun RBuilder.text() {
    styledDiv {
        css { +TypographyStyles.text }
        div {
            text { +"Ant Design" }
            text {
                attrs.type = "secondary"
                +"Ant Design"
            }
            text {
                attrs.type = "warning"
                +"Ant Design"
            }
            text {
                attrs.type = "danger"
                +"Ant Design"
            }
            text {
                attrs.disabled = true
                +"Ant Design"
            }
            text {
                attrs.mark = true
                +"Ant Design"
            }
            text {
                attrs.code = true
                +"Ant Design"
            }
            text {
                attrs.underline = true
                +"Ant Design"
            }
            text {
                attrs.delete = true
                +"Ant Design"
            }
            text {
                attrs.strong = true
                +"Ant Design"
            }
            link {
                attrs {
                    href = "https://ant.design"
                    target = "_blank"
                }
                +"Ant Design (Link)"
            }
        }
    }
}
