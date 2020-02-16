package samples.autocomplete

import antd.autocomplete.DataSourceItemType
import antd.autocomplete.autoComplete
import antd.select.SelectFilterOption
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val datasource = arrayOf("Burns Bay Road", "Downing Street", "Wall Street")

private val filter: SelectFilterOption = { inputValue, option ->
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
    div("auto-complete-container") {
        attrs.id = "auto-complete-non-case-sensitive"
        nonCaseSensitiveComplete()
    }
}
