package samples.typography

import antd.typography.EllipsisConfig
import antd.typography.paragraph
import kotlinext.js.jsObject
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.ellipsis() {
    styledDiv {
        css { +TypographyStyles.ellipsis }
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
