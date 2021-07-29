package samples.typography

import antd.typography.typographyLink
import antd.typography.typographyText
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.text() {
    styledDiv {
        css { +TypographyStyles.text }
        div {
            typographyText { +"Ant Design" }
            typographyText {
                attrs.type = "secondary"
                +"Ant Design"
            }
            typographyText {
                attrs.type = "warning"
                +"Ant Design"
            }
            typographyText {
                attrs.type = "danger"
                +"Ant Design"
            }
            typographyText {
                attrs.disabled = true
                +"Ant Design"
            }
            typographyText {
                attrs.mark = true
                +"Ant Design"
            }
            typographyText {
                attrs.code = true
                +"Ant Design"
            }
            typographyText {
                attrs.underline = true
                +"Ant Design"
            }
            typographyText {
                attrs.delete = true
                +"Ant Design"
            }
            typographyText {
                attrs.strong = true
                +"Ant Design"
            }
            typographyLink {
                attrs {
                    href = "https://ant.design"
                    target = "_blank"
                }
                +"Ant Design (Link)"
            }
        }
    }
}
