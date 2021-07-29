package samples.autocomplete

import antd.autocomplete.DataSourceItemType
import antd.autocomplete.autoComplete
import antd.select.FilterFunc
import kotlinext.js.js
import react.RBuilder
import styled.css
import styled.styledDiv

private val datasource = arrayOf("Burns Bay Road", "Downing Street", "Wall Street")

private val filter: FilterFunc<Any> = { inputValue, option ->
    option.asDynamic().props.children.unsafeCast<String>().lowercase().contains(inputValue.lowercase())
}

fun RBuilder.nonCaseSensitiveComplete() {
    autoComplete {
        attrs {
            style = js { width = 200 }
            dataSource = datasource.unsafeCast<Array<DataSourceItemType>>()
            placeholder = "try to type `b`"
            filterOption = filter
        }
    }
}

fun RBuilder.nonCaseSensitive() {
    styledDiv {
        css { +AutoCompleteStyles.nonCaseSensitive }
        nonCaseSensitiveComplete()
    }
}
