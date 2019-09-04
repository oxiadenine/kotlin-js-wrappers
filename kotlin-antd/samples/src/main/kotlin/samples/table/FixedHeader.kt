package samples.table

import antd.pagination.PaginationConfig
import antd.table.ColumnProps
import antd.table.table
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private val tableColumns = arrayOf<ColumnProps<Any>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
            width = 150
        },
        jsObject {
            title = "Age"
            dataIndex = "age"
            width = 150
        },
        jsObject {
            title = "Address"
            dataIndex = "address"
        }
)

private val data = (0..100).map { i ->
    js {
        key = i
        name = "Edward King $i"
        age = 32
        address = "London, Park Lane no. $i"
    }
}.toTypedArray().unsafeCast<Array<Any>>()

fun RBuilder.fixedHeader() {
    div("table-container") {
        attrs.id = "table-fixed-header"
        table {
            attrs {
                columns = tableColumns
                dataSource = data
                pagination = jsObject<PaginationConfig> { pageSize = 50 }
                scroll = jsObject { y = 240 }
            }
        }
    }
}
