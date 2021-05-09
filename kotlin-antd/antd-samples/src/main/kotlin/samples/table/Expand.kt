package samples.table

import antd.table.*
import kotlinext.js.*
import kotlinx.css.margin
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

private external interface ExpandTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var description: String
}

private val tableColumns = arrayOf<ColumnType<ExpandTableDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        key = "name"
    },
    jsObject {
        title = "Age"
        dataIndex = "age"
        key = "age"
    },
    jsObject {
        title = "Address"
        dataIndex = "address"
        key = "address"
    },
    jsObject {
        title = "Action"
        dataIndex = ""
        key = "x"
        render = { _, _, _ ->
            buildElement {
                a {
                    attrs.href = "javascript:;"
                    +"Delete"
                }
            }
        }
    }
)

private val tableData = arrayOf<ExpandTableDataItem>(
    jsObject {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York No. 1 Lake Park"
        description = "My name is John Brown, I am 32 years old, living in New York No. 1 Lake Park."
    },
    jsObject {
        key = "2"
        name = "Jim Green"
        age = 42
        address = "London No. 1 Lake Park"
        description = "My name is Jim Green, I am 42 years old, living in London No. 1 Lake Park."
    },
    jsObject {
        key = "3"
        name = "Joe Black"
        age = 32
        address = "Sidney No. 1 Lake Park"
        description = "My name is Joe Black, I am 32 years old, living in Sidney No. 1 Lake Park."
    }
)

fun RBuilder.expand() {
    styledDiv {
        css { +TableStyles.expand }
        table<ExpandTableDataItem, TableComponent<ExpandTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<ExpandTableDataItem>>()
                expandedRowRender = { record, _, _, _ ->
                    styledP {
                        css { margin(0.px) }
                        +record.description
                    }
                }
                dataSource = tableData
            }
        }
    }
}
