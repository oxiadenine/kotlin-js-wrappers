package samples.form

import antd.*
import antd.button.*
import antd.form.*
import antd.input.*
import antd.select.*
import kotlinext.js.*
import react.*
import styled.*

private val formLayout = jsObject<FormProps<Any>> {
    labelCol = jsObject { span = 8 }
    wrapperCol = jsObject { span = 16 }
}

private val tailLayout = jsObject<FormItemProps<Any>> {
    wrapperCol = jsObject {
        offset = 8
        span = 16
    }
}

private class Demo : RComponent<RProps, State>() {
    var formInstance: FormInstance<Any>? = null

    val handleGenderChange = { value: String, _: Any ->
        when (value) {
            "male" -> formInstance!!.setFieldsValue(js {
                note = "Hi, man!"
            }.unsafeCast<Any>())
            "female" -> formInstance!!.setFieldsValue(js {
                note = "Hi, lady!"
            }.unsafeCast<Any>())
            "other" -> formInstance!!.setFieldsValue(js {
                note = "Hi, there!"
            }.unsafeCast<Any>())
        }
    }

    val handleFinish = { values: Any ->
        console.log(values)
    }

    val handleReset: MouseEventHandler<Any> = {
        formInstance?.resetFields()
    }

    val handleFill: MouseEventHandler<Any> = {
        formInstance!!.setFieldsValue(js {
            note = "Hello world!"
            gender = "male"
        }.unsafeCast<Any>())
    }

    override fun RBuilder.render() {
        form {
            attrs {
                ref = formInstance
                wrapperCol = formLayout.wrapperCol
                labelCol = formLayout.labelCol
                name = "control-ref"
                onFinish = handleFinish
            }
            formItem {
                attrs {
                    label = "Note"
                    name = "note"
                    rules = arrayOf(
                        jsObject<AggregationRule> { required = true }
                    )
                }
                input {}
            }
            formItem {
                attrs {
                    label = "Gender"
                    name = "gender"
                    rules = arrayOf(
                        jsObject<AggregationRule> { required = true }
                    )
                }
                select<String, SelectComponent<String>> {
                    attrs {
                        placeholder =
                            "Select a option and change input text above"
                        onChange = handleGenderChange
                        allowClear = true
                    }
                    option {
                        attrs.value = "male"
                        +"male"
                    }
                    option {
                        attrs.value = "female"
                        +"female"
                    }
                    option {
                        attrs.value = "other"
                        +"other"
                    }
                }
            }
            formItem {
                attrs {
                    noStyle = true
                    shouldUpdate = { prevValues: Any, currentValues: Any ->
                        prevValues.asDynamic().gender !== currentValues.asDynamic().gender
                    }
                }
                val getFieldValue = {
                    if (formInstance!!.getFieldValue("gender") === "other") {
                        formItem {
                            attrs {
                                name = "customizeGender"
                                label = "Customize Gender"
                                rules = arrayOf(
                                    jsObject<AggregationRule> {
                                        required = true
                                    }
                                )
                            }
                            input {}
                        }
                    } else null
                }
                childList += getFieldValue
                +""
            }
            formItem {
                attrs.wrapperCol = tailLayout.wrapperCol
                button {
                    attrs {
                        type = "primary"
                        htmlType = "submit"
                    }
                    +"Submit"
                }
                button {
                    attrs {
                        htmlType = "button"
                        onClick = handleReset
                    }
                    +"Reset"
                }
                button {
                    attrs {
                        type = "link"
                        htmlType = "button"
                        onClick = handleFill
                    }
                    +"Fill form"
                }
            }
        }
    }
}

fun RBuilder.controlRefDemo() = child(Demo::class) {}

fun RBuilder.controlRef() {
    styledDiv {
        css { +FormStyles.controlRef }
        controlRefDemo()
    }
}
