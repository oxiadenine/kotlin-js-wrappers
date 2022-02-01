package samples.table

import antd.badge.badge
import antd.dropdown.dropdown
import antd.icon.downOutlined
import antd.menu.menu
import antd.menu.menuItem
import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jso
import kotlinx.html.classes
import react.*
import react.dom.a
import react.dom.span
import styled.css
import styled.styledDiv

private external interface NestedTableNestedTableDataItem {
    var key: String
    var date: String
    var name: String
    var upgradeNum: String
}

private external interface NestedTableTableDataItem {
    var key: String
    var name: String
    var platform: String
    var version: String
    var upgradeNum: Number
    var creator: String
    var createdAt: String
}

private val menu = buildElement {
    menu {
        menuItem { +"Action 1" }
        menuItem { +"Action 2" }
    }
}

class NestedTableApp : RComponent<Props, State>() {
    private val expandRowRender: (Any, Number, Number, Boolean) -> ReactElement = { _, _, _, _ ->
        val tableColumns = arrayOf<ColumnType<NestedTableNestedTableDataItem>>(
            jso {
                title = "Date"
                dataIndex = "date"
                key = "date"
            },
            jso {
                title = "Name"
                dataIndex = "name"
                key = "name"
            },
            jso {
                title = "Status"
                key = "state"
                render = { _, _, _ ->
                    buildElement {
                        span {
                            badge {
                                attrs.status = "success"
                            }
                            +"Finished"
                        }
                    }
                }
            },
            jso {
                title = "Upgrade Status"
                dataIndex = "upgradeNum"
                key = "upgradeNum"
            },
            jso {
                title = "Action"
                dataIndex = "operation"
                key = "operation"
                render = { _, _, _ ->
                    buildElement {
                        span {
                            attrs.classes = setOf("table-operation")
                            a {
                                attrs.href = "javascript:;"
                                +"Pause"
                            }
                            a {
                                attrs.href = "javascript:;"
                                +"Stop"
                            }
                            dropdown {
                                attrs.overlay = menu
                                a {
                                    attrs.href = "javascript:;"
                                    +"More "
                                    downOutlined {}
                                }
                            }
                        }
                    }
                }
            }
        )

        val data = (0..3).map { i ->
            jso<NestedTableNestedTableDataItem> {
                key = "$i"
                date = "2014-12-24 23:12:00"
                name = "This is production name"
                upgradeNum = "Upgraded: 56"
            }
        }.toTypedArray()

        buildElement {
            table<NestedTableNestedTableDataItem, TableComponent<NestedTableNestedTableDataItem>> {
                attrs {
                    columns = tableColumns.unsafeCast<ColumnsType<NestedTableNestedTableDataItem>>()
                    dataSource = data
                    pagination = false
                }
            }
        }
    }

    override fun RBuilder.render() {
        val tableColumns = arrayOf<ColumnType<NestedTableTableDataItem>>(
            jso {
                title = "Name"
                dataIndex = "name"
                key = "name"
            },
            jso {
                title = "Platform"
                dataIndex = "platform"
                key = "platform"
            },
            jso {
                title = "Version"
                dataIndex = "version"
                key = "version"
            },
            jso {
                title = "Upgraded"
                dataIndex = "upgraded"
                key = "upgraded"
            },
            jso {
                title = "Creator"
                dataIndex = "creator"
                key = "creator"
            },
            jso {
                title = "Date"
                dataIndex = "createdAt"
                key = "createdAt"
            },
            jso {
                title = "Action"
                key = "creator"
                render = { _, _, _ ->
                    buildElement {
                        a {
                            attrs.href = "javascript:;"
                            +"Publish"
                        }
                    }
                }
            }
        )

        val data = (0..3).map { i ->
            jso<NestedTableTableDataItem> {
                key = "$i"
                name = "Screen"
                platform = "iOS"
                version = "10.3.4.5654"
                upgradeNum = 500
                creator = "Jack"
                createdAt = "2014-12-24 23:12:00"
            }
        }.toTypedArray()

        table<NestedTableTableDataItem, TableComponent<NestedTableTableDataItem>> {
            attrs {
                className = "components-table-demo-nested"
                columns = tableColumns.unsafeCast<ColumnsType<NestedTableTableDataItem>>()
                expandedRowRender = expandRowRender
                dataSource = data
            }
        }
    }
}

fun RBuilder.nestedTableApp() = child(NestedTableApp::class) {}

fun RBuilder.nestedTable() {
    styledDiv {
        css { +TableStyles.nestedTable }
        nestedTableApp()
    }
}
