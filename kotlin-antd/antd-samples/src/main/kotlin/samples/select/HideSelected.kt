package samples.select

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val options = arrayOf("Apples", "Nails", "Bananas", "Helicopters")

interface SelectWithHiddenSelectedOptionsState : RState {
    var selectedItems: Array<String>
}

class SelectWithHiddenSelectedOptions : RComponent<RProps, SelectWithHiddenSelectedOptionsState>() {
    private val handlehange: (Array<String>, Any) -> Unit = { items, _ ->
        setState {
            selectedItems = items
        }
    }

    override fun SelectWithHiddenSelectedOptionsState.init() {
        selectedItems = emptyArray()
    }

    override fun RBuilder.render() {
        val filteredOptions = options.filter { o -> !state.selectedItems.contains(o) }

        select<Array<String>, SelectComponent<Array<String>>> {
            attrs {
                mode = "multiple"
                placeholder = "Inserted are removed"
                value = state.selectedItems
                onChange = handlehange
                style = js { width = "100%" }
            }
            filteredOptions.map { item ->
                option {
                    attrs {
                        key = item
                        value = item
                    }
                    +item
                }
            }.toTypedArray()
        }
    }
}

fun RBuilder.selectWithHiddenSelectedOptions() = child(SelectWithHiddenSelectedOptions::class) {}

fun RBuilder.hideSelected() {
    div("select-container") {
        attrs.id = "select-hide-selected"
        selectWithHiddenSelectedOptions()
    }
}
