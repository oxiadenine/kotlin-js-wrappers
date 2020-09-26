package samples.typography

import antd.typography.title
import react.*
import react.dom.div
import styled.*

fun RBuilder.title() {
    styledDiv {
        css { +TypographyStyles.title }
        div {
            title { +"h1. Ant Design" }
            title {
                attrs.level = 2
                +"h2. Ant Design"
            }
            title {
                attrs.level = 3
                +"h3. Ant Design"
            }
            title {
                attrs.level = 4
                +"h4. Ant Design"
            }
        }
    }
}
