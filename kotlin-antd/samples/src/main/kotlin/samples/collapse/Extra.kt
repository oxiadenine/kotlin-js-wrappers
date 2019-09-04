package samples.collapse

import antd.collapse.collapse
import antd.collapse.collapsePanel
import antd.icon.icon
import antd.select.SelectValue
import antd.select.option
import antd.select.select
import kotlinx.html.id
import react.*
import react.dom.br
import react.dom.div
import react.dom.p

private fun callback(key: Any) {
    console.log(key)
}

private val text = """
    A dog is a type of domesticated animal. 
    Known for its loyalty and faithfulness, 
    it can be found as a welcome guest in many households across the world.
""".trimIndent()

private val genExtra: () -> ReactElement = {
    buildElement {
       icon {
           attrs {
               type = "setting"
               onClick = { event ->
                   // If you don't want click extra trigger collapse, you can prevent this:
                   event.stopPropagation()
               }
           }
       }
    }!!
}

interface ExtraDemoState : RState {
    var expandIconPosition: String
}

class ExtraDemo : RComponent<RProps, ExtraDemoState>() {
    private val onPositionChange: (SelectValue, Any) -> Unit = { value, _ ->
        setState {
            expandIconPosition = value.unsafeCast<String>()
        }
    }

    override fun ExtraDemoState.init() {
        expandIconPosition = "left"
    }

    override fun RBuilder.render() {
        div {
            collapse {
                attrs {
                    defaultActiveKey = arrayOf("1")
                    onChange = ::callback
                    expandIconPosition = state.expandIconPosition
                }
                collapsePanel {
                    attrs {
                        header = "This is panel header 1"
                        key = "1"
                        extra = genExtra()
                    }
                    p { +text }
                }
                collapsePanel {
                    attrs {
                        header = "This is panel header 2"
                        key = "2"
                        extra = genExtra()
                    }
                    p { +text }
                }
                collapsePanel {
                    attrs {
                        header = "This is panel header 3"
                        key = "3"
                        extra = genExtra()
                    }
                    p { +text }
                }
            }
            br {}
            +"Expand Icon Position: "
            select {
                attrs {
                    value = state.expandIconPosition
                    onChange = onPositionChange
                }
                option {
                    attrs.value = "left"
                    +"left"
                }
                option {
                    attrs.value = "right"
                    +"right"
                }
            }
        }
    }
}

fun RBuilder.extraDemo() = child(ExtraDemo::class) {}

fun RBuilder.extra() {
    div("collapse-container") {
        attrs.id = "collapse-extra"
        extraDemo()
    }
}
