package samples.icon

import antd.icon.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

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
            /*icon {
                attrs {
                    type = "smile"
                    rotate = 180
                }
            }
            icon {
                attrs.type = "loading"
            }*/
        }
    }
}
