package samples.form

import antd.MouseEventHandler
import antd.button.button
import antd.form.*
import antd.input.input
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinext.js.jso
import react.*
import styled.css
import styled.styledDiv

private val formLayout = jso<FormProps<Any>> {
    labelCol = jso { span = 8 }
    wrapperCol = jso { span = 16 }
}

private val tailLayout = jso<FormItemProps<Any>> {
    wrapperCol = jso {
        offset = 8
        span = 16
    }
}

private val demo = fc<Props> {
    val formComponent = FormComponent.useForm()[0]

    val handleGenderChange = { value: String, _: Any ->
        when (value) {
            "male" -> formComponent.setFieldsValue(js {
                note = "Hi, man!"
            }.unsafeCast<Any>())
            "female" -> formComponent.setFieldsValue(js {
                note = "Hi, lady!"
            }.unsafeCast<Any>())
            "other" -> formComponent.setFieldsValue(js {
                note = "Hi, there!"
            }.unsafeCast<Any>())
        }
    }

    val handleFinish = { values: Any ->
        console.log(values)
    }

    val handleReset: MouseEventHandler<Any> = {
        formComponent.resetFields()
    }

    val handleFill: MouseEventHandler<Any> = {
        formComponent.setFieldsValue(js {
            note = "Hello world!"
            gender = "male"
        }.unsafeCast<Any>())
    }

    form {
        attrs {
            wrapperCol = formLayout.wrapperCol
            labelCol = formLayout.labelCol
            form = formComponent
            name = "control-hooks"
            onFinish = handleFinish
        }
        formItem {
            attrs {
                label = "Note"
                name = "note"
                rules = arrayOf(
                    jso<AggregationRule> { required = true }
                )
            }
            input {}
        }
        formItem {
            attrs {
                label = "Gender"
                name = "gender"
                rules = arrayOf(
                    jso<AggregationRule> { required = true }
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
                if (formComponent.getFieldValue("gender") === "other") {
                    formItem {
                        attrs {
                            name = "customizeGender"
                            label = "Customize Gender"
                            rules = arrayOf(
                                jso<AggregationRule> {
                                    required = true
                                }
                            )
                        }
                        input {}
                    }
                } else null
            }
            childList.add(getFieldValue.unsafeCast<ReactNode>())
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

fun RBuilder.controlHooksDemo() = child(demo)

fun RBuilder.controlHooks() {
    styledDiv {
        css { +FormStyles.controlHooks }
        controlHooksDemo()
    }
}
