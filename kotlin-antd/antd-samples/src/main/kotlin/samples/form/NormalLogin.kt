package samples.form

import antd.*
import antd.button.button
import antd.checkbox.*
import antd.form.*
import antd.icon.*
import antd.input.input
import kotlinext.js.*
import kotlinx.html.*
import org.w3c.dom.*
import react.*
import react.dom.a
import styled.*

class NormalLoginForm : RComponent<FormComponentProps<Any>, RState>() {
    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, values ->
            if (err != null) {
                console.log("Received values of form: ", values)
            }
        }
    }

    override fun RBuilder.render() {
        form {
            attrs {
                onSubmit = handleSubmit
                className = "login-form"
            }
            formItem {
                childList.add(props.form.getFieldDecorator("username", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please input your username!"
                    })
                })(buildElement {
                    input {
                        attrs {
                            prefix = buildElement {
                                icon {
                                    attrs {
                                        type = "user"
                                        style = js { color = "rgba(0,0,0,.25)" }
                                    }
                                }
                            }
                            placeholder = "Username"
                        }
                    }
                }))
            }
            formItem {
                childList.add(props.form.getFieldDecorator("password", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please input your Password!"
                    })
                })(buildElement {
                    input {
                        attrs {
                            prefix = buildElement {
                                icon {
                                    attrs {
                                        type = "lock"
                                        style = js { color = "rgba(0,0,0,.25)" }
                                    }
                                }
                            }
                            type = "password"
                            placeholder = "Password"
                        }
                    }
                }))
            }
            formItem {
                childList.add(props.form.getFieldDecorator("remember", jsObject {
                    valuePropName = "checked"
                    initialValue = true
                })(buildElement {
                    checkbox { +"Remember me" }
                }))
                a {
                    attrs {
                        classes = setOf("login-form-forgot")
                        href = ""
                    }
                    +"Forgot password"
                }
                button {
                    attrs {
                        type = "primary"
                        htmlType = "submit"
                        className = "login-form-button"
                    }
                    +"Log in"
                }
                +"Or "
                a {
                    attrs.href = ""
                    +"register now!"
                }
            }
        }
    }
}

private val wrappedNormalLoginForm = FormComponent.create<FormComponentProps<Any>, RState>(
    jsObject { name = "normal_login" })(NormalLoginForm::class.js)

fun RBuilder.wrappedNormalLoginForm(handler: RHandler<FormComponentProps<Any>>) = child(wrappedNormalLoginForm, jsObject {}, handler)

fun RBuilder.normalLogin() {
    styledDiv {
        css { +FormStyles.normalLogin }
        wrappedNormalLoginForm {}
    }
}
