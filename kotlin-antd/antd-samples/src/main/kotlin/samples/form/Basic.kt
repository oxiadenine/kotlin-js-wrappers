package samples.form

import antd.button.button
import antd.checkbox.checkbox
import antd.form.*
import antd.input.input
import antd.input.password
import kotlinext.js.js
import kotlinext.js.jsObject
import react.RBuilder
import react.Props
import react.child
import react.fc
import styled.css
import styled.styledDiv

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

private val demo = fc<Props> {
    val handleFinish = { values: Any ->
        console.log("Success:", values)
    }

    val handleFinishFailed = { errorInfo: Any ->
        console.log("Failed:", errorInfo)
    }

    form {
        attrs {
            wrapperCol = formLayout.wrapperCol
            labelCol = formLayout.labelCol
            name = "basic"
            initialValues = js { remember = true }.unsafeCast<Store>()
            onFinish = handleFinish
            onFinishFailed = handleFinishFailed
        }
        formItem {
            attrs {
                label = "Username"
                name = "username"
                rules = arrayOf(
                    jsObject<AggregationRule> {
                        required = true
                        message = "Please input your username!"
                    }
                )
            }
            input {}
        }
        formItem {
            attrs {
                label = "Password"
                name = "password"
                rules = arrayOf(
                    jsObject<AggregationRule> {
                        required = true
                        message = "Please input your password!"
                    }
                )
            }
            password {}
        }
        formItem {
            attrs {
                wrapperCol = tailLayout.wrapperCol
                name = "remember"
                valuePropName = "checked"
            }
            checkbox { +"Remember me" }
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
        }
    }
}

fun RBuilder.basicDemo() = child(demo)

fun RBuilder.basic() {
    styledDiv {
        css { +FormStyles.basic }
        basicDemo()
    }
}
