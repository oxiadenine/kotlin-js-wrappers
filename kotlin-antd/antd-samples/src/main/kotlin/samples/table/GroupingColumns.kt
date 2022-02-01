package samples.table

import antd.table.ColumnGroupType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

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
    jso {
        title = "Name"
        dataIndex = "name"
        key = "name"
        width = 100
        fixed = "left"
        filters = arrayOf(
            jso {
                text = "Joe"
                value = "Joe"
            },
            jso {
                text = "John"
                value = "John"
            }
        )
        onFilter = { value, record ->
            record.name.indexOf(value.unsafeCast<String>()) == 0
        }
    },
    jso {
        title = "Other"
        children = arrayOf(
            jso {
                title = "Age"
                dataIndex = "age"
                key = "age"
                width = 200
                sorter = fun(a: GroupingColumnsTableDataItem, b: GroupingColumnsTableDataItem): Number {
                    return a.age.toInt() - b.age.toInt()
                }
            },
            jso {
                title = "Address"
                children = arrayOf(
                    jso {
                        title = "Street"
                        dataIndex = "street"
                        key = "street"
                        width = 200
                    },
                    jso {
                        title = "Block"
                        children = arrayOf(
                            jso {
                                title = "Building"
                                dataIndex = "building"
                                key = "building"
                                width = 100
                            },
                            jso {
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
    jso {
        title = "Company Address"
        dataIndex = "companyAddress"
        key = "companyAddress"
        width = 200
    },
    jso {
        title = "Company Name"
        dataIndex = "companyName"
        key = "companyName"
    },
    jso {
        title = "Gender"
        dataIndex = "gender"
        key = "gender"
        width = 80
        fixed = "right"
    }

)

private val tableData = (0..100).map { i ->
    jso<GroupingColumnsTableDataItem> {
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
                scroll = jso {
                    x = "130%"
                    y = 240
                }
            }
        }
    }
}
