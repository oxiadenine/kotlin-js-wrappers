package samples.typography

import antd.typography.typographyTitle
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.title() {
    styledDiv {
        css { +TypographyStyles.title }
        div {
            typographyTitle { +"h1. Ant Design" }
            typographyTitle {
                attrs.level = 2
                +"h2. Ant Design"
            }
            typographyTitle {
                attrs.level = 3
                +"h3. Ant Design"
            }
            typographyTitle {
                attrs.level = 4
                +"h4. Ant Design"
            }
        }
    }
}
