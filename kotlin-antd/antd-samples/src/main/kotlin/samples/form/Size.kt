package samples.form

import antd.button.button
import antd.cascader.cascader
import antd.datepicker.datePicker
import antd.form.Store
import antd.form.form
import antd.form.formItem
import antd.input.input
import antd.inputnumber.inputNumber
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import antd.switch.switch
import antd.treeselect.DataNode
import antd.treeselect.TreeSelectComponent
import antd.treeselect.treeSelect
import kotlinext.js.js
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

private val demo = fc<Props> {
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
                    jsObject {
                        title = "Light"
                        value = "light"
                        children = arrayOf<DataNode>(
                            jsObject {
                                title = "Bamboo"
                                value = "bamboo"
                            }
                        )
                    }
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
