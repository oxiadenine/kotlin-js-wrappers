package samples.descriptions

import antd.descriptions.descriptions
import antd.descriptions.descriptionsItem
import antd.radio.RadioChangeEvent
import antd.radio.radio
import antd.radio.radioGroup
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

external interface SizeDemoState : State {
    var size: String
}

class SizeDemo : RComponent<Props, SizeDemoState>() {
    private val handleChange: (RadioChangeEvent) -> Unit = { e ->
        console.log("size checked", e.target.value)

        setState {
            size = e.target.value.unsafeCast<String>()
        }
    }

    override fun SizeDemoState.init() {
        size = "default"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    onChange = handleChange
                    value = state.size
                }
                radio {
                    attrs.value = "default"
                    +"default"
                }
                radio {
                    attrs.value = "middle"
                    +"middle"
                }
                radio {
                    attrs.value = "small"
                    +"small"
                }
            }
            br {}
            br {}
            descriptions {
                attrs {
                    bordered = true
                    title = "Custom Size"
                    size = state.size
                }
                descriptionsItem {
                    attrs.label = "Product"
                    +"Cloud Database"
                }
                descriptionsItem {
                    attrs.label = "Billing"
                    +"Prepaid"
                }
                descriptionsItem {
                    attrs.label = "Time"
                    +"18:00:00"
                }
                descriptionsItem {
                    attrs.label = "Amount"
                    +"\$80.00"
                }
                descriptionsItem {
                    attrs.label = "Discount"
                    +"$20.00"
                }
                descriptionsItem {
                    attrs.label = "Official"
                    +"\$60.00"
                }
                descriptionsItem {
                    attrs.label = "Config Info"
                    +"Data disk type: MongoDB"
                    br {}
                    +"Database version: 3.4"
                    br {}
                    +"Package: dds.mongo.mid"
                    br {}
                    +"Storage space: 10 GB"
                    br {}
                    +"Replication_factor:3"
                    br {}
                    +"Region: East China 1"
                    br {}
                }
            }
        }
    }
}

fun RBuilder.sizeDemo() = child(SizeDemo::class) {}

fun RBuilder.size() {
    styledDiv {
        css { +DescriptionsStyles.size }
        sizeDemo()
    }
}
