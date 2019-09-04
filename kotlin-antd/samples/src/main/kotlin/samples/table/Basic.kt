package samples.table

import antd.divider.divider
import antd.table.ColumnProps
import antd.table.table
import antd.tag.tag
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div
import react.dom.span

private val tableColumns = arrayOf<ColumnProps<Any>>(
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
                }!!
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
                }!!
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
                            +"Invite ${record.asDynamic().name}"
                        }
                        divider {
                            attrs.type = "vertical"
                        }
                        a {
                            attrs.href = "javascript:;"
                            +"Delete"
                        }
                    }
                }!!
            }
        }
)

private val data = arrayOf(
        js {
            key = "1"
            name = "John Brown"
            age = 32
            address = "New York No. 1 Lake Park"
            tags = arrayOf("nice", "developer")
        },
        js {
            key = "2"
            name = "Jim Green"
            age = 42
            address = "London No. 1 Lake Park"
            tags = arrayOf("loser")
        },
        js {
            key = "3"
            name = "Joe Black"
            age = 32
            address = "Sidney No. 1 Lake Park"
            tags = arrayOf("cool", "teacher")
        }
).unsafeCast<Array<Any>>()

fun RBuilder.basic() {
    div("table-container") {
        attrs.id = "table-basic"
        table {
            attrs {
                columns = tableColumns
                dataSource = data
            }
        }
    }
}
