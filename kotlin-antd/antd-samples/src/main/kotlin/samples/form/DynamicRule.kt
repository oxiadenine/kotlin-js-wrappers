package samples.form

import antd.*
import antd.button.button
import antd.checkbox.*
import antd.form.*
import antd.input.input
import kotlinext.js.*
import react.*
import styled.*

private val formItemLayout = jso<FormItemProps<Any>> {
    labelCol = jso { span = 4 }
    wrapperCol = jso { span = 8 }
}

private val formTailLayout = jso<FormItemProps<Any>> {
    labelCol = jso { span = 4 }
    wrapperCol = jso {
        span = 8
        offset = 4
    }
}

private val dynamicRuleApp = fc<Props> {
    val formInstance = FormComponent.useForm()[0]
    val (checkNick, setCheckNick) = useState(false)

    useEffect(listOf(checkNick)) {
        formInstance.validateFields(arrayOf("nickname"))
    }

    val onCheckboxChange = { e: CheckboxChangeEvent ->
        setCheckNick(e.target.checked!!)
    }

    val onCheck: MouseEventHandler<Any> = {
        try {
            val values = formInstance.validateFields()
            console.log("Success:", values)
        } catch (e: Exception) {
            console.log("Failed:", e)
        }
    }

    form {
        attrs {
            form = formInstance
            name = "dynamic_rule"
        }
        formItem {
            attrs {
                labelCol = formItemLayout.labelCol
                wrapperCol = formItemLayout.wrapperCol
                name = "name"
                label = "Name"
                rules = arrayOf(jso<AggregationRule> {
                    required = true
                    message = "Please input your name"
                })
            }
            input {
                attrs.placeholder = "Please input your name"
            }
        }
        formItem {
            attrs {
                labelCol = formItemLayout.labelCol
                wrapperCol = formItemLayout.wrapperCol
                name = "nickname"
                label = "Nickname"
                rules = arrayOf(jso<AggregationRule> {
                    required = checkNick
                    message = "Please input your nickname"
                })
            }
            input {
                attrs.placeholder = "Please input your nickname"
            }
        }
        formItem {
            attrs {
                labelCol = formTailLayout.labelCol
                wrapperCol = formTailLayout.wrapperCol
            }
            checkbox {
                attrs {
                    checked = checkNick
                    onChange = onCheckboxChange
                }
                +"Nickname is required"
            }
        }
        formItem {
            attrs {
                labelCol = formTailLayout.labelCol
                wrapperCol = formTailLayout.wrapperCol
            }
            button {
                attrs {
                    type = "primary"
                    onClick = onCheck
                }
                +"Submit"
            }
        }
    }
}

fun RBuilder.dynamicRuleApp() = child(dynamicRuleApp) {}

fun RBuilder.dynamicRule() {
    styledDiv {
        css { +FormStyles.dynamicRule }
        dynamicRuleApp()
    }
}
