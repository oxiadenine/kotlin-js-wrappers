package samples.select

import antd.select.*
import antd.select.option
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: String, option: Any) {
    console.log("selected $value")
}

private fun handleBlur() {
    console.log("blur")
}

private fun handleFocus(value: String) {
    console.log("focus")
}

private fun handleSearch(value: String) {
    console.log("search:", value)
}

private val filter: SelectFilterOption = { inputValue, option ->
    option.asDynamic().props.children.unsafeCast<String>().toLowerCase().contains(inputValue.toLowerCase())
}

fun RBuilder.search() {
    div("select-container") {
        attrs.id = "select-search"
        select<String, SelectComponent<String>> {
            attrs {
                showSearch = true
                style = js { width = 200 }
                placeholder = "Select a person"
                optionFilterProp = "children"
                onChange = ::handleChange
                onFocus = ::handleBlur
                onBlur = ::handleFocus
                onSearch = ::handleSearch
                filterOption = filter
            }
            option {
                attrs.value = "jack"
                +"Jack"
            }
            option {
                attrs.value = "lucy"
                +"Lucy"
            }
            option {
                attrs.value = "tom"
                +"Tom"
            }
        }
    }
}
