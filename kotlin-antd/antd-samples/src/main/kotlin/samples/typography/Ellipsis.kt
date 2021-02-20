package samples.typography

import antd.typography.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

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
