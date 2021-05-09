package samples.collapse

import antd.collapse.*
import kotlinx.css.paddingLeft
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

private val text = buildElement {
    styledP {
        css { paddingLeft = 24.px }
        +"""
           A dog is a type of domesticated animal. Known for its loyalty and faithfulness, it can be found 
           as a welcome guest in many households across the world.
       """.trimIndent()
    }
}

fun RBuilder.borderless() {
    styledDiv {
        css { +CollapseStyles.borderless }
        collapse {
            attrs {
                bordered = false
                defaultActiveKey = arrayOf("1")
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 1"
                    key = "1"
                }
                childList.add(text)
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 2"
                    key = "2"
                }
                childList.add(text)
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 3"
                    key = "3"
                }
                childList.add(text)
            }
        }
    }
}
