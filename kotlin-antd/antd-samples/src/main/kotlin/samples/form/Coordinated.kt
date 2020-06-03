package samples.form

import antd.FormEventHandler
import antd.button.button
import antd.form.*
import antd.input.input
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.Object
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div

class CoordinatedApp : RComponent<FormComponentProps<Any>, RState>() {
    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, values ->
            if (err != null) {
                console.log("Received values of form: ", values)
            }
        }
    }

    private val handleSelectChange = fun (value: String, _: Any) {
        console.log(value)

        props.form.setFieldsValue(js {
            note = "Hi, ${if (value == "male") "man" else "lady"}!"
        }.unsafeCast<Object>())
    }

    override fun RBuilder.render() {
        form {
            attrs.onSubmit = handleSubmit
            formItem {
                attrs {
                    label = "Note"
                    labelCol = jsObject { span = 5 }
                    wrapperCol = jsObject { span = 12 }
                }
                childList.add(props.form.getFieldDecorator("note", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please input your note!"
                    })
                })(buildElement {
                    input {}
                }))
            }
            formItem {
                attrs {
                    label = "Gender"
                    labelCol = jsObject { span = 5 }
                    wrapperCol = jsObject { span = 12 }
                }
                childList.add(props.form.getFieldDecorator("gender", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please input your gender!"
                    })
                })(buildElement {
                    select<String, SelectComponent<String>> {
                        attrs {
                            placeholder = "Select a option and change input text above"
                            onChange = handleSelectChange
                        }
                        option {
                            attrs.value = "male"
                            +"male"
                        }
                        option {
                            attrs.value = "female"
                            +"female"
                        }
                    }
                }))
            }
            formItem {
                attrs {
                    wrapperCol = jsObject {
                        span = 12
                        offset = 5
                    }
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
}

private val wrappedCoordinatedApp = FormComponent.create<FormComponentProps<Any>, RState>(
        jsObject { name = "coordinated" })(CoordinatedApp::class.js)

fun RBuilder.wrappedCoordinatedApp(handler: RHandler<FormComponentProps<Any>>) = child(wrappedCoordinatedApp, jsObject {}, handler)

fun RBuilder.coordinated() {
    div("form-container") {
        attrs.id = "form-coordinated"
        wrappedCoordinatedApp {}
    }
}
