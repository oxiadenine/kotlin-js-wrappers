package samples.table

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
            key = "name"
            width = 100
            fixed = "left"
            filters = arrayOf(
                    jsObject {
                        text = "Joe"
                        value = "Joe"
                    },
                    jsObject {
                        text = "John"
                        value = "John"
                    }
            )
            onFilter = { value, record ->
                record.asDynamic().name.unsafeCast<String>().indexOf(value.unsafeCast<String>()) == 0
            }
        },
        jsObject {
            title = "Other"
            children = arrayOf(
                    jsObject {
                        title = "Age"
                        dataIndex = "age"
                        key = "age"
                        width = 200
                        sorter = fun (a: Any, b: Any): Number {
                            return a.asDynamic().age.unsafeCast<Number>().toInt() - b.asDynamic().age.unsafeCast<Number>().toInt()
                        }
                    },
                    jsObject {
                        title = "Address"
                        children = arrayOf(
                                jsObject {
                                    title = "Street"
                                    dataIndex = "street"
                                    key = "street"
                                    width = 200
                                },
                                jsObject {
                                    title = "Block"
                                    children = arrayOf(
                                            jsObject {
                                                title = "Building"
                                                dataIndex = "building"
                                                key = "building"
                                                width = 100
                                            },
                                            jsObject {
                                                title = "Door No."
                                                dataIndex = "number"
                                                key = "number"
                                                width = 100
                                            }
                                    )
                                }
                        )
                    }
            )
        },
        jsObject {
            title = "Company Address"
            dataIndex = "companyAddress"
            key = "companyAddress"
            width = 200
        },
        jsObject {
            title = "Company Name"
            dataIndex = "companyName"
            key = "companyName"
        },
        jsObject {
            title = "Gender"
            dataIndex = "gender"
            key = "gender"
            width = 80
            fixed = "right"
        }

)

private val data = (0..100).map { i ->
    js {
        key = "$i"
        name = "John Brown"
        age = i + 1
        street = "Lake Park"
        building = "C"
        number = 2035
        companyAddress = "Lake Street 42"
        companyName = "SoftLake Co"
        gender = "M"
    }
}.toTypedArray().unsafeCast<Array<Any>>()

fun RBuilder.groupingColumns() {
    div("table-container") {
        attrs.id = "table-groping-columns"
        table {
            attrs {
                columns = tableColumns
                dataSource = data
                bordered = true
                size = "middle"
                scroll = jsObject {
                    x = "130%"
                    y = 240
                }
            }
        }
    }
}
