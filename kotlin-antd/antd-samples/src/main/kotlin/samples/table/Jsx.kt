package samples.table

import antd.divider.divider
import antd.table.*
import antd.tag.tag
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.a
import react.dom.div
import react.dom.span

private interface JsxTableDataItem {
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
    div("table-container") {
        attrs.id = "table-jsx"
        table<JsxTableDataItem, TableComponent<JsxTableDataItem>> {
            attrs.dataSource = data
            columnGroup {
                attrs.title = "Name"
                column<JsxTableDataItem> {
                    attrs {
                        title = "First Name"
                        dataIndex = "firstName"
                        key = "firstName"
                    }
                }
                column<JsxTableDataItem> {
                    attrs {
                        title = "Last Name"
                        dataIndex = "lastName"
                        key = "lastName"
                    }
                }
            }
            column<JsxTableDataItem> {
                attrs {
                    title = "Age"
                    dataIndex = "age"
                    key = "age"
                }
            }
            column<JsxTableDataItem> {
                attrs {
                    title = "Address"
                    dataIndex = "address"
                    key = "address"
                }
            }
            column<JsxTableDataItem> {
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
            column<JsxTableDataItem> {
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
