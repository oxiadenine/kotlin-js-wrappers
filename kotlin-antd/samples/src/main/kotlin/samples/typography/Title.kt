package samples.typography

import antd.typography.title
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.title() {
    div("typography-container") {
        attrs.id = "typography-title"
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
