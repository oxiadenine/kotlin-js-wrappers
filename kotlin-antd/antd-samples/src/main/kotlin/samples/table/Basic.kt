package samples.table

import antd.divider.*
import antd.table.*
import antd.tag.*
import kotlinext.js.*
import react.RBuilder
import react.buildElement
import react.dom.*
import styled.*

private interface BasicTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var tags: Array<String>
}

private val tableColumns = arrayOf<ColumnType<BasicTableDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        key = "name"
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
        title = "Tags"
        key = "tags"
        dataIndex = "tags"
        render = { tags, _, _ ->
            buildElement {
                span {
                    tags.unsafeCast<Array<String>>().map { tag ->
                        var tagColor = if (tag.length > 5) "geekblue" else "green"

                        if (tag == "loser") {
                            tagColor = "volcano"
                        }

                        tag {
                            attrs {
                                color = tagColor
                                key = tag
                            }
                            +tag.toUpperCase()
                        }
                    }.toTypedArray()
                }
            }
        }
    },
    jsObject {
        title = "Action"
        key = "action"
        render = { _, record, _ ->
            buildElement {
                span {
                    a {
                        attrs.href = "javascript:;"
                        +"Invite ${record.name}"
                    }
                    divider {
                        attrs.type = "vertical"
                    }
                    a {
                        attrs.href = "javascript:;"
                        +"Delete"
                    }
                }
            }
        }
    }
)

private val tableData = arrayOf<BasicTableDataItem>(
    jsObject {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York No. 1 Lake Park"
        tags = arrayOf("nice", "developer")
    },
    jsObject {
        key = "2"
        name = "Jim Green"
        age = 42
        address = "London No. 1 Lake Park"
        tags = arrayOf("loser")
    },
    jsObject {
        key = "3"
        name = "Joe Black"
        age = 32
        address = "Sidney No. 1 Lake Park"
        tags = arrayOf("cool", "teacher")
    }
)

fun RBuilder.basic() {
    styledDiv {
        css { +TableStyles.basic }
        table<BasicTableDataItem, TableComponent<BasicTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<BasicTableDataItem>>()
                dataSource = tableData
            }
        }
    }
}
