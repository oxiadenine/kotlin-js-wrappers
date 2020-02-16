package samples.collapse

import antd.collapse.collapse
import antd.collapse.collapsePanel
import antd.icon.icon
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.p

private val text = """
    A dog is a type of domesticated animal. 
    Known for its loyalty and faithfulness, 
    it can be found as a welcome guest in many households across the world.
""".trimIndent()

private val customPanelStyle = js {
    background = "#f7f7f7"
    borderRadius = 4
    marginBottom = 24
    border = 0
    overflow = "hidden"
}

fun RBuilder.custom() {
    div("collapse-container") {
        attrs.id = "collapse-custom"
        collapse {
            attrs {
                bordered = false
                defaultActiveKey = arrayOf("1")
                expandIcon = {panelProps ->
                    icon {
                        attrs {
                            type = "caret-right"
                            rotate = if (panelProps.isActive!!) 90 else 0
                        }
                    }
                }
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 1"
                    key = "1"
                    style = customPanelStyle
                }
                p { +text }
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 2"
                    key = "2"
                    style = customPanelStyle
                }
                p { +text }
            }
            collapsePanel {
                attrs {
                    header = "This is panel header 3"
                    key = "3"
                    style = customPanelStyle
                }
                p { +text }
            }
        }
    }
}
