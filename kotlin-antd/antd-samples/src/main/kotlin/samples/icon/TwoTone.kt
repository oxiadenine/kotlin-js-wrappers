package samples.icon

import antd.icon.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

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
