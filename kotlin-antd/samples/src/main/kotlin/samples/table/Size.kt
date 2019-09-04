package samples.table

import antd.table.*
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.h4

private val tableColumns = arrayOf<ColumnProps<Any>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
        },
        jsObject {
            title = "Age"
            dataIndex = "age"
        },
        jsObject {
            title = "Address"
            dataIndex = "address"
        }
)

private val data = arrayOf(
        js {
            key = "1"
            name = "John Brown"
            age = 32
            address = "New York No. 1 Lake Park"
        },
        js {
            key = "2"
            name = "Jim Green"
            age = 42
            address = "London No. 1 Lake Park"
        },
        js {
            key = "3"
            name = "Joe Black"
            age = 32
            address = "Sidney No. 1 Lake Park"
        }
).unsafeCast<Array<Any>>()

fun RBuilder.size() {
    div("table-container") {
        attrs.id = "table-size"
        div {
            h4 { +"Middle size table" }
            table {
                attrs {
                    columns = tableColumns
                    dataSource = data
                    size = "middle"
                }
            }
            h4 { +"Small size table" }
            table {
                attrs {
                    columns = tableColumns
                    dataSource = data
                    size = "small"
                }
            }
        }
    }
}
