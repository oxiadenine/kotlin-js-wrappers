package samples.transfer

import antd.*
import antd.transfer.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*
import kotlin.random.*

external interface CustomItemTransferItem : TransferItem {
    var chosen: Boolean
}

external interface CustomItemAppState : RState {
    var mockData: Array<TransferItem>
    var targetKeys: Array<String>
}

class CustomItemApp : RComponent<RProps, CustomItemAppState>() {
    private val getMock: MouseEventHandler<Any> = {
        val keys = mutableListOf<String>()
        val data = mutableListOf<TransferItem>()

        for (i in 0..19) {
            val item = jsObject<CustomItemTransferItem> {
                key = i.toString()
                title = "content${i + 1}"
                description = "description of content${i + 1}"
                chosen = Random.nextDouble() * 2 > 1
            }

            if (item.chosen) {
                keys.add(item.key!!)
            }

            data.add(item)
        }

        setState {
            mockData = data.toTypedArray()
            targetKeys = keys.toTypedArray()
        }
    }

    private val handleChange = fun(nextTargetKeys: Array<String>, direction: String, moveKeys: Any) {
        console.log(nextTargetKeys, direction, moveKeys)

        setState {
            targetKeys = nextTargetKeys
        }
    }

    private val renderItem = fun(item: TransferItem): Any {
        val customLabel = buildElement {
            span("custom-item") {
                +"${item.title} - ${item.description}"
            }
        }

        return js {
            label = customLabel // for displayed item
            value = item.title  // for title and filter matching
        }.unsafeCast<Any>()
    }

    override fun componentDidMount() {
        getMock(js {}.unsafeCast<MouseEvent<Any>>())
    }

    override fun CustomItemAppState.init() {
        mockData = emptyArray()
        targetKeys = emptyArray()
    }

    override fun RBuilder.render() {
        transfer<TransferItem, TransferComponent<TransferItem>> {
            attrs {
                dataSource = state.mockData
                listStyle = js {
                    width = 250
                    height = 300
                }
                targetKeys = state.targetKeys
                onChange = handleChange
                render = renderItem
            }
        }
    }
}

fun RBuilder.customItemApp() = child(CustomItemApp::class) {}

fun RBuilder.customItem() {
    styledDiv {
        css { +TransferStyles.customItem }
        customItemApp()
    }
}
