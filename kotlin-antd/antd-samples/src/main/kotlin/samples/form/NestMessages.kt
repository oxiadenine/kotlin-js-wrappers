package samples.form

import antd.button.*
import antd.form.*
import antd.input.*
import antd.inputnumber.*
import kotlinext.js.*
import react.*
import styled.*

private val formLayout = jsObject<FormProps<Any>> {
    labelCol = jsObject { span = 8 }
    wrapperCol = jsObject { span = 16 }
}

private val formValidateMessages = jsObject<ValidateMessages> {
    required = "\${label} is required!"
    types = jsObject {
            email = "\${label} is not a valid email!"
            number = "\${label} is not a valid number!"
    }
    number = jsObject {
            range = "\${label} must be between \${min} and \${max}"
    }
}

private val demo = functionalComponent<RProps> {
    val handleFinish = { values: Any ->
        console.log(values)
    }

    form {
        attrs {
            wrapperCol = formLayout.wrapperCol
            labelCol = formLayout.labelCol
            name = "nest-messages"
            onFinish = handleFinish
            validateMessages = formValidateMessages
        }
        formItem {
            attrs {
                name = arrayOf("user", "name")
                label = "Name"
                rules = arrayOf(
                    jsObject<AggregationRule> {
                        required = true
                    }
                )
            }
            input {}
        }
        formItem {
            attrs {
                name = arrayOf("user", "email")
                label = "Email"
                rules = arrayOf(
                    jsObject<AggregationRule> {
                        type = "email"
                    }
                )
            }
            input {}
        }
        formItem {
            attrs {
                name = arrayOf("user", "age")
                label = "Age"
                rules = arrayOf(
                    jsObject<AggregationRule> {
                        type = "number"
                        min = 0
                        max = 99
                    }
                )
            }
            inputNumber {}
        }
        formItem {
            attrs {
                name = arrayOf("user", "website")
                label = "Website"
            }
            input {}
        }
        formItem {
            attrs {
                name = arrayOf("user", "introduction")
                label = "Introduction"
            }
            textArea {}
        }
        formItem {
            attrs.wrapperCol = formLayout.wrapperCol?.apply {
                offset = 8
            }
            button {
                attrs {
                    type = "primary"
                    htmlType = "submit"
                }
                +"Submit"
            }
        }
    }
}

fun RBuilder.nestMessagesDemo() = child(demo)

fun RBuilder.nestMessages() {
    styledDiv {
        css { +FormStyles.nestMessages }
        nestMessagesDemo()
    }
}
