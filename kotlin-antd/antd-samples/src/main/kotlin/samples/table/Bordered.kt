package samples.table

import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jsObject
import react.RBuilder
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv

private external interface BorderedTableDataItem {
    var key: String
    var name: String
    var money: String
    var address: String
}

private val tableColumns = arrayOf<ColumnType<BorderedTableDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        render = { text, _, _ ->
            buildElement {
                a {
                    attrs.href = "javascript:;"
                    +text.unsafeCast<String>()
                }
            }
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

private val tableData = arrayOf<BorderedTableDataItem>(
    jsObject {
        key = "1"
        name = "John Brown"
        money = "￥300,000.00"
        address = "New York No. 1 Lake Park"
    },
    jsObject {
        key = "2"
        name = "Jim Green"
        money = "￥1,256,000.00"
        address = "London No. 1 Lake Park"
    },
    jsObject {
        key = "3"
        name = "Joe Black"
        money = "￥120,000.00"
        address = "Sidney No. 1 Lake Park"
    }
)

fun RBuilder.bordered() {
    styledDiv {
        css { +TableStyles.bordered }
        table<BorderedTableDataItem, TableComponent<BorderedTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<BorderedTableDataItem>>()
                dataSource = tableData
                bordered = true
                title = { _ -> "Header" }
                footer = { _ -> "Footer" }
            }
        }
    }
}
