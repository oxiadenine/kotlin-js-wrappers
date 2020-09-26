package samples.form

import antd.FormEventHandler
import antd.button.button
import antd.form.*
import antd.icon.icon
import antd.input.input
import kotlinext.js.Object
import kotlinext.js.js
import kotlinext.js.jsObject
import org.w3c.dom.HTMLElement
import react.*
import styled.css
import styled.styledDiv

private fun hasErrors(fieldsError: dynamic): Boolean {
    return Object.keys(fieldsError as Any).any { field -> fieldsError[field] != null }
}

class HorizontalLoginForm : RComponent<FormComponentProps<Any>, RState>() {
    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, values ->
            if (err != null) {
                console.log("Received values of form: ", values)
            }
        }
    }

    override fun componentDidMount() {
        props.form.validateFields()
    }

    override fun RBuilder.render() {
        // Only show error after a field is touched.
        val userNameError = if (props.form.isFieldTouched("username")) {
            props.form.getFieldError("username")
        } else null

        val passwordError = if (props.form.isFieldTouched("password")) {
            props.form.getFieldError("password")
        } else null

        form {
            attrs {
                layout = "inline"
                onSubmit = handleSubmit
            }
            formItem {
                attrs {
                    validateStatus = if (userNameError != null) "error" else ""
                    help = userNameError
                }
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
                attrs {
                    validateStatus = if (passwordError != null) "error" else ""
                    help = passwordError
                }

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
                button {
                    attrs {
                        type = "primary"
                        htmlType = "submit"
                        disabled = hasErrors(props.form.getFieldsError())
                    }
                    +"Log in"
                }
            }
        }
    }
}

private val wrappedHorizontalLoginForm = FormComponent.create<FormComponentProps<Any>, RState>(
        jsObject { name = "horizontal_login" })(HorizontalLoginForm::class.js)

fun RBuilder.wrappedHorizontalLoginForm(handler: RHandler<FormComponentProps<Any>>) = child(wrappedHorizontalLoginForm, jsObject {}, handler)

fun RBuilder.horizontalLogin() {
    styledDiv {
        css { +FormStyles.horizontalLogin }
        wrappedHorizontalLoginForm {}
    }
}
