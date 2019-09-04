package samples.table

import antd.pagination.PaginationConfig
import antd.table.*
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private val tableColumns = arrayOf<ColumnProps<Any>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
            filters = arrayOf(
                    jsObject {
                        text = "Joe"
                        value = "Joe"
                    },
                    jsObject {
                        text = "Jim"
                        value = "Jim"
                    },
                    jsObject {
                        text = "Submenu"
                        value = "Submenu"
                        children = arrayOf(
                                jsObject {
                                    text = "Green"
                                    value = "Green"
                                },
                                jsObject {
                                    text = "Black"
                                    value = "Black"
                                }
                        )
                    }
            )
            // specify the condition of filtering result
            // here is that finding the name started with `value`
            onFilter = { value, record ->
                record.asDynamic().name.unsafeCast<String>().indexOf(value.unsafeCast<String>()) == 0
            }
            sorter = fun (a: Any, b: Any): Number {
               return  a.asDynamic().name.unsafeCast<String>().length - b.asDynamic().name.unsafeCast<String>().length
            }
            sortDirections = arrayOf("descend")

        },
        jsObject {
            title = "Age"
            dataIndex = "age"
            defaultSortOrder = "descend"
            sorter = fun (a: Any, b: Any): Number {
                return a.asDynamic().age.unsafeCast<Number>().toInt() - b.asDynamic().age.unsafeCast<Number>().toInt()
            }
        },
        jsObject {
            title = "Address"
            dataIndex = "address"
            filters = arrayOf(
                    jsObject {
                        text = "London"
                        value = "London"
                    },
                    jsObject {
                        text = "New York"
                        value = "New York"
                    }
            )
            filterMultiple = false
            onFilter = { value, record ->
                record.asDynamic().address.unsafeCast<String>().indexOf(value.unsafeCast<String>()) == 0
            }
            sorter =  fun (a: Any, b: Any): Number {
                return a.asDynamic().address.unsafeCast<String>().length - b.asDynamic().address.unsafeCast<String>().length
            }
            sortDirections = arrayOf("descend", "ascend")
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
        },
        js {
            key = "4"
            name = "Jim Red"
            age = 32
            address = "London No. 2 Lake Park"
        }
).unsafeCast<Array<Any>>()

private fun onChange(pagination: PaginationConfig, filters: Any, sorter: SorterResult<Any>, extra: TableCurrentDataSource<Any>) {
    console.log("params", pagination, filters, sorter)
}

fun RBuilder.head() {
    div("table-container") {
        attrs.id = "table-head"
        table {
            attrs {
                columns = tableColumns
                dataSource = data
                onChange = ::onChange
            }
        }
    }
}
