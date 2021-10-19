package samples.form

import antd.button.button
import antd.checkbox.checkbox
import antd.form.AggregationRule
import antd.form.Store
import antd.form.form
import antd.form.formItem
import antd.icon.lockOutlined
import antd.icon.userOutlined
import antd.input.input
import kotlinext.js.js
import kotlinext.js.jsObject
import react.*
import react.dom.a
import styled.css
import styled.styledDiv

private val normalLoginForm = fc<Props> {
    val handleFinish = { values: Any ->
        console.log("Received values of form: ", values)
    }

    form {
        attrs {
            name = "normal_login"
            className = "login-form"
            initialValues = js { remember = true }.unsafeCast<Store>()
            onFinish = handleFinish
        }
        formItem {
            attrs {
                name = "username"
                rules = arrayOf(jsObject<AggregationRule> {
                    required = true
                    message = "Please input your username!"
                })
            }
            input {
                attrs {
                    prefix = buildElement {
                        userOutlined {
                            attrs.className = "site-form-item-icon"
                        }
                        placeholder = "Username"
                    }
                }
            }
        }
        formItem {
            attrs {
                name = "password"
                rules = arrayOf(jsObject<AggregationRule> {
                    required = true
                    message = "Please input your password!"
                })
            }
            input {
                attrs {
                    prefix = buildElement {
                        lockOutlined {
                            attrs.className = "site-form-item-icon"
                        }
                        placeholder = "Password"
                    }
                }
            }
        }
        formItem {
            formItem {
                attrs {
                    name = "remember"
                    valuePropName = "checked"
                    noStyle = true
                }
                checkbox { +"Remember me" }
            }
            a(classes = "login-form-forgot", href = "") { +"Forgot password" }
        }
        formItem {
            button {
                attrs {
                    type = "primary"
                    htmlType = "submit"
                    className = "login-form-button"
                }
                +"Login"
            }
            +"Or "
            a(href = "") { +"register now" }
        }
    }
}

fun RBuilder.normalLoginForm() = child(normalLoginForm) {}

fun RBuilder.normalLogin() {
    styledDiv {
        css { +FormStyles.normalLogin }
        normalLoginForm()
    }
}
