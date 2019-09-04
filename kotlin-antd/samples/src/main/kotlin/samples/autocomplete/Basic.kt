package samples.autocomplete

import antd.autocomplete.DataSourceItemType
import antd.autocomplete.autoComplete
import antd.select.SelectValue
import kotlinext.js.Object
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleSelect(value: SelectValue, option: Object) {
    console.log("onSelect", value)
}

interface BasicCompleteState : RState {
    var dataSource: Array<DataSourceItemType>
}

class BasicComplete : RComponent<RProps, BasicCompleteState>() {
    private val handleSearch = fun (value: String) {
        setState {
            dataSource = if (value.isEmpty()) {
                emptyArray()
            } else {
                arrayOf(value, value + value, value + value + value)
            }
        }
    }

    override fun BasicCompleteState.init() {
        dataSource = emptyArray()
    }

    override fun RBuilder.render() {
        autoComplete {
            attrs {
                dataSource = state.dataSource
                style = js { width = 200 }
                onSelect = ::handleSelect
                onSearch = handleSearch
                placeholder = "input here"
            }
        }
    }
}

fun RBuilder.basicComplete() = child(BasicComplete::class) {}

fun RBuilder.basic() {
    div("auto-complete-container") {
        attrs.id = "auto-complete-basic"
        basicComplete()
    }
}
