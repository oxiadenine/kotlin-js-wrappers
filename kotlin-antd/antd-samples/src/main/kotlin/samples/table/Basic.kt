package samples.table

import antd.divider.divider
import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import antd.tag.tag
import kotlinext.js.jso
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.span
import styled.css
import styled.styledDiv

private external interface BasicTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var tags: Array<String>
}

private val tableColumns = arrayOf<ColumnType<BasicTableDataItem>>(
    jso {
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
                            +tag.uppercase()
                        }
                    }.toTypedArray()
                }
            }
        }
    },
    jso {
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
    jso {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York No. 1 Lake Park"
        tags = arrayOf("nice", "developer")
    },
    jso {
        key = "2"
        name = "Jim Green"
        age = 42
        address = "London No. 1 Lake Park"
        tags = arrayOf("loser")
    },
    jso {
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
