package samples.form

import antd.button.*
import antd.cascader.*
import antd.datepicker.*
import antd.form.*
import antd.input.*
import antd.inputnumber.*
import antd.radio.*
import antd.select.*
import antd.switch.*
import antd.treeselect.*
import kotlinext.js.*
import react.*
import styled.*

private val demo = functionalComponent<RProps> {
    val (componentSize, setComponentSize) = useState("default")

    val onFormLayoutChange = { size: Any, _: Any ->
        setComponentSize(size.asDynamic().size as String)
    }

    form {
        attrs {
            labelCol = jsObject { span = 4 }
            wrapperCol = jsObject { span = 14 }
            layout = "horizontal"
            initialValues = js { size = componentSize }.unsafeCast<Store>()
            onValuesChange = onFormLayoutChange
            size = componentSize
        }
        formItem {
            attrs {
                label = "Form Size"
                name = "size"
            }
            radioGroup {
                radioButton {
                    attrs.value = "small"
                    +"Small"
                }
                radioButton {
                    attrs.value = "default"
                    +"Default"
                }
                radioButton {
                    attrs.value = "large"
                    +"Large"
                }
            }
        }
        formItem {
            attrs.label = "Input"
            input {}
        }
        formItem {
            attrs.label = "Select"
            select<String, SelectComponent<String>> {
                option {
                    attrs.value = "demo"
                    +"Demo"
                }
            }
        }
        formItem {
            attrs.label = "TreeSelect"
            treeSelect<String, TreeSelectComponent<String>> {
                attrs.treeData = arrayOf(
                    js {
                        title = "Light"
                        value = "light"
                        children = arrayOf(
                            js {
                                title = "Bamboo"
                                value = "bamboo"
                            }
                        )
                    }.unsafeCast<TreeNode>()
                )
            }
        }
        formItem {
            attrs.label = "Cascader"
            cascader {
                attrs.options = arrayOf(
                    jsObject {
                        value = "zhejiang"
                        label = "Zhejiang"
                        children = arrayOf(
                            jsObject {
                            value = "hangzhou"
                            label = "Hangzhou"
                        })
                    }
                )
            }
        }
        formItem {
            attrs.label = "DatePicker"
            datePicker {}
        }
        formItem {
            attrs.label = "InputNumber"
            inputNumber {}
        }
        formItem {
            attrs.label = "Switch"
            switch {}
        }
        formItem {
            attrs.label = "Button"
            button {}
        }
    }
}

fun RBuilder.sizeDemo() = child(demo)

fun RBuilder.size() {
    styledDiv {
        css { +FormStyles.size }
        sizeDemo()
    }
}
