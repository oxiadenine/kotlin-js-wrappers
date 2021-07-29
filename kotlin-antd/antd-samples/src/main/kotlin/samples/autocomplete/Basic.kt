package samples.autocomplete

import antd.autocomplete.DataSourceItemType
import antd.autocomplete.autoComplete
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

private val handleSelect = { value: Any, _: Any ->
    console.log("onSelect", value)
}

external interface BasicCompleteState : State {
    var dataSource: Array<DataSourceItemType>
}

class BasicComplete : RComponent<RProps, BasicCompleteState>() {
    private val handleSearch = fun(value: String) {
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
                onSelect = handleSelect
                onSearch = handleSearch
                placeholder = "input here"
            }
        }
    }
}

fun RBuilder.basicComplete() = child(BasicComplete::class) {}

fun RBuilder.basic() {
    styledDiv {
        css { +AutoCompleteStyles.basic }
        basicComplete()
    }
}
