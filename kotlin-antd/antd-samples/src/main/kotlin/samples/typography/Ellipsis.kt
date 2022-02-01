package samples.typography

import antd.typography.EllipsisConfig
import antd.typography.typographyParagraph
import kotlinext.js.jso
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.ellipsis() {
    styledDiv {
        css { +TypographyStyles.ellipsis }
        div {
            typographyParagraph {
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
            typographyParagraph {
                attrs.ellipsis = jso<EllipsisConfig> {
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
