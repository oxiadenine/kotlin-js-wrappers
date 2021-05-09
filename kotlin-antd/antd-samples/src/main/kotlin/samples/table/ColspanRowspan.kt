package samples.table

import antd.table.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private external interface ColspanRowspanTableDataItem {
    var key: String
    var name: String
    var age: Number
    var tel: String
    var phone: String
    var address: String
}

private val renderContent: (Any, Any, Number) -> Any = { value, _, index ->
    val obj = js {
        children = value
        props = js {}
    }

    if (index.toInt() == 4) {
        obj.props.colSpan = 0
    }

    obj.unsafeCast<Any>()
}

private val tableColumns = arrayOf<ColumnType<ColspanRowspanTableDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        render = { text, _, index ->
            if (index.toInt() < 4) {
                buildElement {
                    a {
                        attrs.href = "javascript:;"
                        +text.unsafeCast<String>()
                    }
                }
            } else {
                val obj = js {
                    props = js {}
                }

                obj.children = buildElement {
                    a {
                        attrs.href = "javascript:;"
                        +text.unsafeCast<String>()
                    }
                }
                obj.props.colSpan = 5

                obj.unsafeCast<Any>()
            }
        }
    },
    jsObject {
        title = "Age"
        dataIndex = "age"
        render = renderContent
    },
    jsObject {
        title = "Home phone"
        colSpan = 2
        dataIndex = "tel"
        render = { value, _, index ->
            val obj = js {}

            obj.children = value
            obj.props = js {}

            if (index.toInt() == 2) {
                obj.props.rowSpan = 2
            }

            // These two are merged into above cell
            if (index.toInt() == 3) {
                obj.props.rowSpan = 0
            }

            if (index.toInt() == 4) {
                obj.props.colSpan = 0
            }

            obj.unsafeCast<Any>()
        }
    },
    jsObject {
        title = "Phone"
        colSpan = 0
        dataIndex = "phone"
        render = renderContent
    },
    jsObject {
        title = "Address"
        dataIndex = "address"
        render = renderContent
    }
)

private val tableData = arrayOf<ColspanRowspanTableDataItem>(
    jsObject {
        key = "1"
        name = "John Brown"
        age = 32
        tel = "0571-22098909"
        phone = "18889898989"
        address = "New York No. 1 Lake Park"
    },
    jsObject {
        key = "2"
        name = "Jim Green"
        tel = "0571-22098333"
        phone = "18889898888"
        age = 42
        address = "London No. 1 Lake Park"
    },
    jsObject {
        key = "3"
        name = "Joe Black"
        age = 32
        tel = "0575-22098909"
        phone = "18900010002"
        address = "Sidney No. 1 Lake Park"
    },
    jsObject {
        key = "4"
        name = "Jim Red"
        age = 18
        tel = "0575-22098909"
        phone = "18900010002"
        address = "London No. 2 Lake Park"
    },
    jsObject {
        key = "5"
        name = "Jake White"
        age = 18
        tel = "0575-22098909"
        phone = "18900010002"
        address = "Dublin No. 2 Lake Park"
    }
)

fun RBuilder.colspanRowspan() {
    styledDiv {
        css { +TableStyles.colspanRowspan }
        table<ColspanRowspanTableDataItem, TableComponent<ColspanRowspanTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<ColspanRowspanTableDataItem>>()
                dataSource = tableData
                bordered = true
            }
        }
    }
}
