package samples.table

import antd.table.*
import kotlinext.js.*
import react.*
import styled.*

private external interface GroupingColumnsTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var street: String
    var building: String
    var number: Number
    var companyAddress: String
    var companyName: String
    var gender: String
}

private val tableColumns = arrayOf<ColumnGroupType<GroupingColumnsTableDataItem>>(
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
            record.name.indexOf(value.unsafeCast<String>()) == 0
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
                sorter = fun(a: GroupingColumnsTableDataItem, b: GroupingColumnsTableDataItem): Number {
                    return a.age.toInt() - b.age.toInt()
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

private val tableData = (0..100).map { i ->
    jsObject<GroupingColumnsTableDataItem> {
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
}.toTypedArray()

fun RBuilder.groupingColumns() {
    styledDiv {
        css { +TableStyles.groupingColumns }
        table<GroupingColumnsTableDataItem, TableComponent<GroupingColumnsTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<GroupingColumnsTableDataItem>>()
                dataSource = tableData
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
