package samples.select

import antd.*
import antd.select.*
import kotlinext.js.*
import org.w3c.dom.*
import react.*
import styled.*

private val handleChange = { value: String, _: Any ->
    console.log("selected $value")
}

private val handleBlur: FocusEventHandler<HTMLElement> = {
    console.log("blur")
}

private val handleFocus: FocusEventHandler<HTMLElement> = {
    console.log("focus")
}

private val handleSearch = { value: String ->
    console.log("search:", value)
}

private val filter: FilterFunc<Any> = { inputValue, option ->
    option.asDynamic().props.children.unsafeCast<String>().lowercase().contains(inputValue.lowercase())
}

fun RBuilder.search() {
    styledDiv {
        css { +SelectStyles.search }
        select<String, SelectComponent<String>> {
            attrs {
                showSearch = true
                style = js { width = 200 }
                placeholder = "Select a person"
                optionFilterProp = "children"
                onChange = handleChange
                onFocus = handleBlur
                onBlur = handleFocus
                onSearch = handleSearch
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
