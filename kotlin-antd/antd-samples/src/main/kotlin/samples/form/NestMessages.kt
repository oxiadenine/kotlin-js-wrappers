package samples.form

import antd.button.button
import antd.form.*
import antd.input.input
import antd.input.textArea
import antd.inputnumber.inputNumber
import kotlinext.js.jso
import react.RBuilder
import react.Props
import react.child
import react.fc
import styled.css
import styled.styledDiv

private val formLayout = jso<FormProps<Any>> {
    labelCol = jso { span = 8 }
    wrapperCol = jso { span = 16 }
}

private val formValidateMessages = jso<ValidateMessages> {
    required = "\${label} is required!"
    types = jso {
            email = "\${label} is not a valid email!"
            number = "\${label} is not a valid number!"
    }
    number = jso {
            range = "\${label} must be between \${min} and \${max}"
    }
}

private val demo = fc<Props> {
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
                    jso<AggregationRule> {
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
                    jso<AggregationRule> {
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
                    jso<AggregationRule> {
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
