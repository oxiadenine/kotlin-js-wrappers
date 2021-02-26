package samples.input

import antd.autocomplete.*
import antd.cascader.*
import antd.datepicker.*
import antd.grid.col
import antd.input.*
import antd.input.input
import antd.inputnumber.*
import antd.select.*
import antd.select.option
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val cascaderOptions = arrayOf<CascaderOptionType>(
    jsObject {
        value = "zhejiang"
        label = "Zhejiang"
        children = arrayOf(
            jsObject {
                value = "hangzhou"
                label = "Hangzhou"
                children = arrayOf(
                    jsObject {
                        value = "xihu"
                        label = "West Lake"
                    }
                )
            }
        )
    },
    jsObject {
        value = "jiangsu"
        label = "Jiangsu"
        children = arrayOf(
            jsObject {
                value = "nanjing"
                label = "Nanjing"
                children = arrayOf(
                    jsObject {
                        value = "zhonghuamen"
                        label = "Zhong Hua Men"
                    }
                )
            }
        )
    }
)

interface GroupCompactDemoState : RState {
    var dataSource: Any
}

class GroupCompactDemo : RComponent<RProps, GroupCompactDemoState>() {
    private val handleChange = { value: SelectValue, _: Any ->
        setState {
            dataSource = if (value.unsafeCast<String>().isEmpty() || value.unsafeCast<String>().contains("@")) {
                emptyArray<Any>()
            } else {
                arrayOf("$value@gmail.com", "$value@163.com", "$value@qq.com")
            }
        }
    }

    override fun GroupCompactDemoState.init() {
        dataSource = emptyArray<Any>()
    }

    override fun RBuilder.render() {
        div {
            inputGroup {
                attrs.size = "large"
                col {
                    attrs.span = 5
                    input {
                        attrs.defaultValue = "0571"
                    }
                }
                col {
                    attrs.span = 8
                    input {
                        attrs.defaultValue = "26888888"
                    }
                }
            }
            br {}
            inputGroup {
                attrs.compact = true
                input {
                    attrs {
                        style = js { width = "20%" }
                        defaultValue = "0571"
                    }
                }
                input {
                    attrs {
                        style = js { width = "30%" }
                        defaultValue = "26888888"
                    }
                }
            }
            br {}
            inputGroup {
                attrs.compact = true
                select<String, SelectComponent<String>> {
                    attrs.defaultValue = "Zhejiang"
                    option {
                        attrs.value = "Zhejiang"
                        +"Zhejiang"
                    }
                    option {
                        attrs.value = "Jiangsu"
                        +"Jiangsu"
                    }
                }
                input {
                    attrs {
                        style = js { width = "50%" }
                        defaultValue = "Xihu District, Hangzhou"
                    }
                }
            }
            br {}
            inputGroup {
                attrs.compact = true
                select<String, SelectComponent<String>> {
                    attrs.defaultValue = "Option1"
                    option {
                        attrs.value = "Option1"
                        +"Option1"
                    }
                    option {
                        attrs.value = "Option2"
                        +"Option2"
                    }
                }
                input {
                    attrs {
                        style = js { width = "50%" }
                        defaultValue = "input content"
                    }
                }
                inputNumber {}
            }
            br {}
            inputGroup {
                attrs.compact = true
                input {
                    attrs {
                        style = js { width = "50%" }
                        defaultValue = "input content"
                    }
                }
                br {}
                datePicker {}
            }
            br {}
            inputGroup {
                attrs.compact = true
                select<String, SelectComponent<String>> {
                    attrs.defaultValue = "Option1-1"
                    option {
                        attrs.value = "Option1-1"
                        +"Option1-1"
                    }
                    option {
                        attrs.value = "Option1-2"
                        +"Option1-2"
                    }
                }
                select<String, SelectComponent<String>> {
                    attrs.defaultValue = "Option2-2"
                    option {
                        attrs.value = "Option2-1"
                        +"Option2-1"
                    }
                    option {
                        attrs.value = "Option2-2"
                        +"Option2-2"
                    }
                }
            }
            br {}
            inputGroup {
                attrs.compact = true
                select<String, SelectComponent<String>> {
                    attrs.defaultValue = "1"
                    option {
                        attrs.value = "1"
                        +"Between"
                    }
                    option {
                        attrs.value = "2"
                        +"Except"
                    }
                }
                input {
                    attrs {
                        style = js {
                            width = 100
                            textAlign = "center"
                        }
                        placeholder = "Minimum"
                    }
                }
                input {
                    attrs {
                        style = js {
                            width = 30
                            borderLeft = 0
                            pointerEvents = "none"
                            backgroundColor = "#fff"
                        }
                        placeholder = "-"
                        disabled = true
                    }
                }
                input {
                    attrs {
                        style = js {
                            width = 100
                            textAlign = "center"
                            borderLeft = 0
                        }
                        placeholder = "Maximum"
                    }
                }
            }
            br {}
            inputGroup {
                attrs.compact = true
                select<String, SelectComponent<String>> {
                    attrs.defaultValue = "Sign Up"
                    option {
                        attrs.value = "Sign Up"
                        +"Sign Up"
                    }
                    option {
                        attrs.value = "Sign In"
                        +"Sign In"
                    }
                }
                autoComplete {
                    attrs {
                        dataSource = state.dataSource.unsafeCast<Array<DataSourceItemType>>()
                        style = js { width = 200 }
                        onChange = handleChange
                        placeholder = "Email"
                    }
                }
            }
            br {}
            inputGroup {
                attrs.compact = true
                select<String, SelectComponent<String>> {
                    attrs {
                        style = js { widht = "30%" }
                        defaultValue = "Home"
                    }
                    option {
                        attrs.value = "Home"
                        +"Home"
                    }
                    option {
                        attrs.value = "Company"
                        +"Company"
                    }
                }
                cascader {
                    attrs {
                        style = js { widht = "70%" }
                        options = cascaderOptions
                        placeholder = "Select Address"
                    }
                }
            }
        }
    }
}

fun RBuilder.groupCompactDemo() = child(GroupCompactDemo::class) {}

fun RBuilder.group() {
    styledDiv {
        css { +InputStyles.group }
        groupCompactDemo()
    }
}
