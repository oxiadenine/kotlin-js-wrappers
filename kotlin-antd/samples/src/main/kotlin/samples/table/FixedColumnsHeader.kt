package samples.table

import antd.table.*
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div

private val tableColumns = arrayOf<ColumnProps<Any>>(
        jsObject {
            title = "Full Name"
            width = 100
            dataIndex = "name"
            key = "name"
            fixed = "left"
        },
        jsObject {
            title = "Age"
            width = 100
            dataIndex = "age"
            key = "age"
            fixed = "left"
        },
        jsObject {
            title = "Column 1"
            dataIndex = "address"
            key = "1"
            width = 150
        },
        jsObject {
            title = "Column 2"
            dataIndex = "address"
            key = "2"
            width = 150
        },
        jsObject {
            title = "Column 3"
            dataIndex = "address"
            key = "3"
            width = 150
        },
        jsObject {
            title = "Column 4"
            dataIndex = "address"
            key = "4"
            width = 150
        },
        jsObject {
            title = "Column 5"
            dataIndex = "address"
            key = "5"
            width = 150
        },
        jsObject {
            title = "Column 6"
            dataIndex = "address"
            key = "6"
            width = 150
        },
        jsObject {
            title = "Column 7"
            dataIndex = "address"
            key = "7"
            width = 150
        },
        jsObject {
            title = "Column 8"
            dataIndex = "address"
            key = "8"
        },
        jsObject {
            title = "Action"
            key = "operation"
            fixed = "right"
            width = 100
            render = { _, _, _ ->
                buildElement {
                   a {
                       attrs.href = "javascript:;"
                       +"action"
                   }
                }!!
            }
        }
)

private val data = (0..100).map { i ->
    js {
        key = i
        name = "Edward $i"
        age = 32
        address = "London Park no. $i"
    }
}.toTypedArray().unsafeCast<Array<Any>>()

fun RBuilder.fixedColumnsHeader() {
    div("table-container") {
        attrs.id = "table-fixed-columns-header"
        table {
            attrs {
                columns = tableColumns
                dataSource = data
                scroll = jsObject {
                    x = 1500
                    y = 300
                }
            }
        }
    }
}
