package samples.collapse

import antd.collapse.collapse
import antd.collapse.collapsePanel
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.jsStyle
import react.dom.p

private val text = buildElement {
   p {
       attrs.jsStyle = js { paddingLeft = 24 }
       +"""
           A dog is a type of domesticated animal. Known for its loyalty and faithfulness, it can be found 
           as a welcome guest in many households across the world.
       """.trimIndent()
   }
}!!

fun RBuilder.borderless() {
    div("collapse-container") {
        attrs.id = "collapse-borderless"
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
