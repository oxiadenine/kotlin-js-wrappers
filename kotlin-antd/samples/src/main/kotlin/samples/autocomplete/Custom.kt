package samples.autocomplete

import antd.KeyboardEventHandler
import antd.autocomplete.DataSourceItemType
import antd.autocomplete.autoComplete
import antd.input.textArea
import antd.select.SelectValue
import kotlinext.js.Object
import kotlinext.js.js
import kotlinx.html.id
import org.w3c.dom.HTMLTextAreaElement
import react.*
import react.dom.*

private fun handleSelect(value: SelectValue, option: Object) {
    console.log("onSelect", value)
}

interface CustomCompleteState : RState {
    var dataSource: Array<DataSourceItemType>
}

class CustomComplete : RComponent<RProps, CustomCompleteState>() {
    private val handleSearch = fun (value: String) {
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
    div("auto-complete-container") {
        attrs.id = "auto-complete-custom"
        customComplete()
    }
}
