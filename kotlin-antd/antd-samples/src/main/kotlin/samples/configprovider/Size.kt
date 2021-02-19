package samples.configprovider

import antd.button.button
import antd.card.*
import antd.configprovider.*
import antd.datepicker.*
import antd.divider.*
import antd.input.*
import antd.input.input
import antd.input.textArea
import antd.radio.*
import antd.select.*
import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

interface DataItem {
    var key: String
    var name: String
    var age: Number
}

val formSizeDemo = functionalComponent<RProps> {
    val (componentSize, setComponentSize) = useState("small")

    div {
        radioGroup {
            attrs {
                value = componentSize
                onChange = { e ->
                    setComponentSize(e.target.value as String)
                }
            }
            radioButton {
                attrs.value = "small"
                +"Small"
            }
            radioButton {
                attrs.value = "middle"
                +"Middle"
            }
            radioButton {
                attrs.value = "large"
                +"Large"
            }
        }
        divider {}
        configProvider {
            attrs.componentSize = componentSize
            div(classes = "example") {
                input {}
            }
            div(classes = "example") {
                search {
                    attrs.allowClear = true
                }
            }
            div(classes = "example") {
                textArea {}
            }
            div(classes = "example") {
                select<String, SelectComponent<String>> {
                    attrs {
                        defaultValue = "demo"
                        options = arrayOf<OptionsType>(jsObject { value = "demo" })
                    }
                }
            }
            div(classes = "example") {
                datePicker {}
            }
            div(classes = "example") {
                rangePicker {}
            }
            div(classes = "example") {
                button { +"Button" }
            }
            div(classes = "example") {
                card {
                    attrs.title = "Card"
                }
                table<DataItem, TableComponent<DataItem>> {
                    attrs {
                        columns = arrayOf<ColumnType<DataItem>>(
                            jsObject {
                                title = "Name"
                                dataIndex = "name"
                            },
                            jsObject {
                                title = "Age"
                                dataIndex = "name"
                            }
                        ).unsafeCast<ColumnsType<Any>>()
                        dataSource = arrayOf(
                            jsObject {
                                key = "1"
                                name = "John Brown"
                                age = 32
                            },
                            jsObject {
                                key = "2"
                                name = "Jim Green"
                                age = 42
                            },
                            jsObject {
                                key = "3"
                                name = "Joe Blac"
                                age = 32
                            }
                        )
                    }
                }
            }
        }
    }
}

fun RBuilder.formSizeDemo() = child(formSizeDemo) {}

fun RBuilder.size() {
    styledDiv {
        css { +ConfigProviderStyles.size }
        formSizeDemo()
    }
}
