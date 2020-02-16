package samples.transfer

import antd.MouseEvent
import antd.MouseEventHandler
import antd.transfer.TransferItem
import antd.transfer.transfer
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*
import kotlin.random.Random

interface SearchTransferItem : TransferItem {
    var chosen: Boolean
}

interface SearchAppState : RState {
    var mockData: Array<TransferItem>
    var targetKeys: Array<String>
}

class SearchApp : RComponent<RProps, SearchAppState>() {
    override fun componentDidMount() {
        getMock(js {}.unsafeCast<MouseEvent<Any>>())
    }

    override fun SearchAppState.init() {
        mockData = emptyArray()
        targetKeys = emptyArray()
    }

    private val getMock: MouseEventHandler<Any> = {
        val keys = mutableListOf<String>()
        val data = mutableListOf<TransferItem>()

        for (i in 0..19) {
            val item = jsObject<SearchTransferItem> {
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

    private val handleFilterOption = fun (inputValue: Any, item: Any): Boolean {
        return item.unsafeCast<SearchTransferItem>().description!!.contains(inputValue.unsafeCast<String>())
    }

    private val handleChange = fun (nextTargetKeys: Array<String>, _: String, _: Any) {
        setState {
            targetKeys = nextTargetKeys
        }
    }

    private val handleSearch = fun (direction: String, value: String) {
        console.log("search:", direction, value)
    }

    override fun RBuilder.render() {
        transfer {
            attrs {
                dataSource = state.mockData
                showSearch = true
                filterOption = handleFilterOption
                targetKeys = state.targetKeys
                onChange = handleChange
                onSearch = handleSearch
                render = { item -> item.title }
            }
        }
    }
}

fun RBuilder.searchApp() = child(SearchApp::class) {}

fun RBuilder.search() {
    div("transfer-container") {
        attrs.id = "transfer-search"
        searchApp()
    }
}
