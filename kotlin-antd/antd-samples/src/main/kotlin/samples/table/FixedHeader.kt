package samples.table

import antd.pagination.PaginationConfig
import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

private external interface FixedHeaderTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<FixedHeaderTableDataItem>>(
    jso {
        title = "Name"
        dataIndex = "name"
        width = 150
    },
    jso {
        title = "Age"
        dataIndex = "age"
        width = 150
    },
    jso {
        title = "Address"
        dataIndex = "address"
    }
)

private val tableData = (0..100).map { i ->
    jso<FixedHeaderTableDataItem> {
        key = "$i"
        name = "Edward King $i"
        age = 32
        address = "London, Park Lane no. $i"
    }
}.toTypedArray()

fun RBuilder.fixedHeader() {
    styledDiv {
        css { +TableStyles.fixedHeader }
        table<FixedHeaderTableDataItem, TableComponent<FixedHeaderTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<FixedHeaderTableDataItem>>()
                dataSource = tableData
                pagination = jso<PaginationConfig> { pageSize = 50 }
                scroll = jso { y = 240 }
            }
        }
    }
}
