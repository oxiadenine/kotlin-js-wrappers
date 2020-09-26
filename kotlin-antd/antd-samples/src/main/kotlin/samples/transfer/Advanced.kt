package samples.transfer

import antd.*
import antd.button.*
import antd.transfer.*
import kotlinext.js.*
import react.*
import styled.*
import kotlin.random.*

interface AdvancedTransferItem : TransferItem {
    var chosen: Boolean
}

interface AdvancedAppState : RState {
    var mockData: Array<TransferItem>
    var targetKeys: Array<String>
}

class AdvancedApp : RComponent<RProps, AdvancedAppState>() {
    private val getMock: MouseEventHandler<Any> = {
        val keys = mutableListOf<String>()
        val data = mutableListOf<TransferItem>()

        for (i in 0..19) {
            val item = jsObject<AdvancedTransferItem> {
                key = i.toString()
                title = "content${i + 1}"
                description = "description of content${i + 1}"
                chosen = Random.nextDouble() * 2 > 1
            }

            if (item.chosen) {
                keys.add(item.key)
            }

            data.add(item)
        }

        setState {
            mockData = data.toTypedArray()
            targetKeys = keys.toTypedArray()
        }
    }

    private val handleChange = fun(nextTargetKeys: Array<String>, _: String, _: Any) {
        setState {
            targetKeys = nextTargetKeys
        }
    }

    private val renderFooter = fun(_: TransferListProps): ReactElement {
        return buildElement {
            button {
                attrs {
                    size = "small"
                    style = js {
                        float = "right"
                        margin = 5
                    }
                    onClick = getMock
                }
                +"reload"
            }
        }
    }

    override fun componentDidMount() {
        getMock(js {}.unsafeCast<MouseEvent<Any>>())
    }

    override fun AdvancedAppState.init() {
        mockData = emptyArray()
        targetKeys = emptyArray()
    }

    override fun RBuilder.render() {
        transfer {
            attrs {
                dataSource = state.mockData
                showSearch = true
                listStyle = js {
                    width = 250
                    height = 300
                }
                operations = arrayOf("to right", "to left")
                targetKeys = state.targetKeys
                onChange = handleChange
                render = { item -> "${item.title}-${item.description}" }
                footer = renderFooter
            }
        }
    }
}

fun RBuilder.advancedApp() = child(AdvancedApp::class) {}

fun RBuilder.advanced() {
    styledDiv {
        css { +TransferStyles.advanced }
        advancedApp()
    }
}
