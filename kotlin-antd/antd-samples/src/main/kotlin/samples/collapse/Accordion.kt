package samples.collapse

import antd.collapse.*
import react.*
import react.dom.*
import styled.*

private val text = """
    A dog is a type of domesticated animal. 
    Known for its loyalty and faithfulness, 
    it can be found as a welcome guest in many households across the world.
""".trimIndent()

fun RBuilder.accordion() {
    styledDiv {
        css { +CollapseStyles.accordion }
        collapse {
            attrs.accordion = true
            collapsePanel {
                attrs {
                    header = "This is panel header 1"
                    key = "1"
                }
                p { +text }
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 2"
                    key = "2"
                }
                p { +text }
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 3"
                    key = "3"
                }
                p { +text }
            }
        }
    }
}
