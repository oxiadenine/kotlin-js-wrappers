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
            title = "Name"
            dataIndex = "name"
            render = { text, _, _ ->
                buildElement {
                    a {
                        attrs.href = "javascript:;"
                        +text.unsafeCast<String>()
                    }
                }!!
            }
        },
        jsObject {
            title = "Cash Assets"
            className = "column-money"
            dataIndex = "money"
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
            money = "￥300,000.00"
            address = "New York No. 1 Lake Park"
        },
        js {
            key = "2"
            name = "Jim Green"
            money = "￥1,256,000.00"
            address = "London No. 1 Lake Park"
        },
        js {
            key = "3"
            name = "Joe Black"
            money = "￥120,000.00"
            address = "Sidney No. 1 Lake Park"
        }
).unsafeCast<Array<Any>>()

fun RBuilder.bordered() {
    div("table-container") {
        attrs.id = "table-bordered"
        table {
            attrs {
                columns = tableColumns
                dataSource = data
                bordered = true
                title = { _ -> "Header" }
                footer = { _ -> "Footer" }
            }
        }
    }
}
