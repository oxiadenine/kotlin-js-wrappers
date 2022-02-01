package samples.table

import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jso
import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv
import styled.styledP

private external interface ExpandTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var description: String
}

private val tableColumns = arrayOf<ColumnType<ExpandTableDataItem>>(
    jso {
        title = "Name"
        dataIndex = "name"
        key = "name"
    },
    jso {
        title = "Age"
        dataIndex = "age"
        key = "age"
    },
    jso {
        title = "Address"
        dataIndex = "address"
        key = "address"
    },
    jso {
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
    jso {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York No. 1 Lake Park"
        description = "My name is John Brown, I am 32 years old, living in New York No. 1 Lake Park."
    },
    jso {
        key = "2"
        name = "Jim Green"
        age = 42
        address = "London No. 1 Lake Park"
        description = "My name is Jim Green, I am 42 years old, living in London No. 1 Lake Park."
    },
    jso {
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
                    buildElement {
                        styledP {
                            css { margin(0.px) }
                            +record.description
                        }
                    }
                }
                dataSource = tableData
            }
        }
    }
}
