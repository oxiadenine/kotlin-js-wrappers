package samples.collapse

import antd.collapse.collapse
import antd.collapse.collapsePanel
import react.RBuilder
import react.dom.p
import styled.css
import styled.styledDiv

private fun callback(key: Any) {
    console.log(key)
}

private val text = """
    A dog is a type of domesticated animal. 
    Known for its loyalty and faithfulness, 
    it can be found as a welcome guest in many households across the world.
""".trimIndent()

fun RBuilder.mix() {
    styledDiv {
        css { +CollapseStyles.mix }
        collapse {
            attrs.onChange = ::callback
            collapsePanel {
                attrs {
                    header = "This is panel header 1"
                    key = "1"
                }
                collapse {
                    attrs.defaultActiveKey = "1"
                    collapsePanel {
                        attrs {
                            header = "This is panel nest panel"
                            key = "1"
                        }
                        p { +text }
                    }
                }
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
