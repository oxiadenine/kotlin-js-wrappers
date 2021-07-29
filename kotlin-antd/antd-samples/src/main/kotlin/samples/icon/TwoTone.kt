package samples.icon

import antd.icon.checkCircleTwoTone
import antd.icon.heartTwoTone
import antd.icon.smileTwoTone
import kotlinx.html.classes
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.twoTone() {
    styledDiv {
        css { +IconStyles.twoTone }
        div {
            attrs.classes = setOf("icons-list")
            smileTwoTone {}
            heartTwoTone {
                attrs.twoToneColor = "#eb2f96"
            }
            checkCircleTwoTone {
                attrs.twoToneColor = "#52c41a"
            }
        }
    }
}
