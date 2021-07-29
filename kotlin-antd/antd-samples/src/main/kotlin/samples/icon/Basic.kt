package samples.icon

import antd.icon.*
import kotlinx.html.classes
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +IconStyles.basic }
        div {
            attrs.classes = setOf("icons-list")
            homeOutlined {}
            settingFilled {}
            smileOutlined {}
            syncOutlined {
                attrs.spin = true
            }
            smileOutlined {
                attrs.rotate = 180
            }
            loadingOutlined {}
        }
    }
}
