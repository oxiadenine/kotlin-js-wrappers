package samples.table

import antd.divider.divider
import antd.table.column
import antd.table.columnGroup
import antd.table.table
import antd.tag.tag
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.a
import react.dom.div
import react.dom.span

private val data = arrayOf(
        js {
            key = "1"
            firstName = "John"
            lastName = "Brown"
            age = 32
            address = "New York No. 1 Lake Park"
            tags = arrayOf("nice", "developer")
        },
        js {
            key = "2"
            firstName = "Jim"
            lastName = "Green"
            age = 42
            address = "London No. 1 Lake Park"
            tags = arrayOf("loser")
        },
        js {
            key = "3"
            firstName = "Joe"
            lastName = "Black"
            age = 32
            address = "Sidney No. 1 Lake Park"
            tags = arrayOf("cool", "teacher")
        }
).unsafeCast<Array<Any>>()

fun RBuilder.jsx() {
    div("table-container") {
        attrs.id = "table-jsx"
        table {
            attrs.dataSource = data
            columnGroup {
                attrs.title = "Name"
                column {
                    attrs {
                        title = "First Name"
                        dataIndex = "firstName"
                        key = "firstName"
                    }
                }
                column {
                    attrs {
                        title = "Last Name"
                        dataIndex = "lastName"
                        key = "lastName"
                    }
                }
            }
            column {
                attrs {
                    title = "Age"
                    dataIndex = "age"
                    key = "age"
                }
            }
            column {
                attrs {
                    title = "Address"
                    dataIndex = "address"
                    key = "address"
                }
            }
            column {
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
            column {
                attrs {
                    title = "Action"
                    key = "action"
                    render = { _, record, _ ->
                        span {
                            a {
                                attrs.href = "javascript:;"
                                +"Invite ${record.asDynamic().lastName}"
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
