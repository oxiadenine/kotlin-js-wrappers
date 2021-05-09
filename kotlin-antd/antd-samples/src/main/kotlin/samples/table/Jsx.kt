package samples.table

import antd.divider.*
import antd.table.*
import antd.tag.*
import kotlinext.js.*
import react.RBuilder
import react.dom.*
import styled.*

private external interface JsxTableDataItem {
    var key: String
    var firstName: String
    var lastName: String
    var age: Number
    var address: String
    var tags: Array<String>
}

private val data = arrayOf<JsxTableDataItem>(
    jsObject {
        key = "1"
        firstName = "John"
        lastName = "Brown"
        age = 32
        address = "New York No. 1 Lake Park"
        tags = arrayOf("nice", "developer")
    },
    jsObject {
        key = "2"
        firstName = "Jim"
        lastName = "Green"
        age = 42
        address = "London No. 1 Lake Park"
        tags = arrayOf("loser")
    },
    jsObject {
        key = "3"
        firstName = "Joe"
        lastName = "Black"
        age = 32
        address = "Sidney No. 1 Lake Park"
        tags = arrayOf("cool", "teacher")
    }
)

fun RBuilder.jsx() {
    styledDiv {
        css { +TableStyles.jsx }
        table<JsxTableDataItem, TableComponent<JsxTableDataItem>> {
            attrs.dataSource = data
            tableColumnGroup<JsxTableDataItem> {
                attrs.title = "Name"
                tableColumn<JsxTableDataItem> {
                    attrs {
                        title = "First Name"
                        dataIndex = "firstName"
                        key = "firstName"
                    }
                }
                tableColumn<JsxTableDataItem> {
                    attrs {
                        title = "Last Name"
                        dataIndex = "lastName"
                        key = "lastName"
                    }
                }
            }
            tableColumn<JsxTableDataItem> {
                attrs {
                    title = "Age"
                    dataIndex = "age"
                    key = "age"
                }
            }
            tableColumn<JsxTableDataItem> {
                attrs {
                    title = "Address"
                    dataIndex = "address"
                    key = "address"
                }
            }
            tableColumn<JsxTableDataItem> {
                attrs {
                    title = "Tags"
                    dataIndex = "tags"
                    key = "tags"
                    render = { tags, _, _ ->
                        span {
                            tags.unsafeCast<Array<String>>().map { tag ->
                                tag {
                                    attrs {
                                        color = "blue"
                                        key = tag
                                    }
                                    +tag
                                }
                            }.toTypedArray()
                        }
                    }
                }
            }
            tableColumn<JsxTableDataItem> {
                attrs {
                    title = "Action"
                    key = "action"
                    render = { _, record, _ ->
                        span {
                            a {
                                attrs.href = "javascript:;"
                                +"Invite ${record.lastName}"
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
        }
    }
}
