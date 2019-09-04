package samples.typography

import antd.typography.EllipsisConfig
import antd.typography.paragraph
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.ellipsis() {
    div("typography-container") {
        attrs.id = "typography-ellipsis"
        div {
            paragraph {
                attrs.ellipsis = true
                +"""
                    Ant Design, a design language for background applications, is refined by Ant UED Team. Ant
                    Design, a design language for background applications, is refined by Ant UED Team. Ant Design,
                     a design language for background applications, is refined by Ant UED Team. Ant Design, a
                    design language for background applications, is refined by Ant UED Team. Ant Design, a design
                    language for background applications, is refined by Ant UED Team. Ant Design, a design
                    language for background applications, is refined by Ant UED Team.
                """.trimIndent()
            }
            paragraph {
                attrs.ellipsis = jsObject<EllipsisConfig> {
                    rows = 3
                    expandable = true
                }
                +"""
                    Ant Design, a design language for background applications, is refined by Ant UED Team. Ant
                    Design, a design language for background applications, is refined by Ant UED Team. Ant Design,
                    a design language for background applications, is refined by Ant UED Team. Ant Design, a
                    design language for background applications, is refined by Ant UED Team. Ant Design, a design
                    language for background applications, is refined by Ant UED Team. Ant Design, a design
                    language for background applications, is refined by Ant UED Team.
                """.trimIndent()
            }
        }
    }
}
