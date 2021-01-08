package samples.autocomplete

import antd.autocomplete.*
import antd.select.*
import kotlinext.js.*
import react.*
import styled.*

private val datasource = arrayOf("Burns Bay Road", "Downing Street", "Wall Street")

private val filter: FilterFunc<Any> = { inputValue, option ->
    option.asDynamic().props.children.unsafeCast<String>().toLowerCase().contains(inputValue.toLowerCase())
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
