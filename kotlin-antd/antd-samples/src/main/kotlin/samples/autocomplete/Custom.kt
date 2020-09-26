package samples.autocomplete

import antd.*
import antd.autocomplete.*
import antd.input.*
import antd.select.*
import kotlinext.js.*
import org.w3c.dom.*
import react.*
import styled.*

private fun handleSelect(value: SelectValue, option: Object) {
    console.log("onSelect", value)
}

interface CustomCompleteState : RState {
    var dataSource: Array<DataSourceItemType>
}

class CustomComplete : RComponent<RProps, CustomCompleteState>() {
    private val handleSearch = fun(value: String) {
        setState {
            dataSource = if (value.isEmpty()) {
                emptyArray()
            } else {
                arrayOf(value, value + value, value + value + value)
            }
        }
    }

    private val handleKeyPress: KeyboardEventHandler<HTMLTextAreaElement> = {
        console.log("handleKeyPress", it)
    }

    override fun CustomCompleteState.init() {
        dataSource = emptyArray()
    }

    override fun RBuilder.render() {
        autoComplete {
            attrs {
                dataSource = state.dataSource
                style = js { width = 200 }
                onSelect = ::handleSelect
                onSearch = handleSearch
            }
            textArea {
                attrs {
                    placeholder = "input here"
                    className = "custom"
                    style = js { height = 50 }
                    onKeyPress = handleKeyPress
                }
            }
        }
    }
}

fun RBuilder.customComplete() = child(CustomComplete::class) {}

fun RBuilder.custom() {
    styledDiv {
        css { +AutoCompleteStyles.custom }
        customComplete()
    }
}
