package samples.form

import antd.FocusEventHandler
import antd.FormEventHandler
import antd.autocomplete.DataSourceItemType
import antd.autocomplete.autoComplete
import antd.button.button
import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import antd.checkbox.checkbox
import antd.form.*
import antd.grid.col
import antd.grid.row
import antd.icon.icon
import antd.input.input
import antd.input.password
import antd.select.SelectComponent
import antd.select.SelectValue
import antd.select.option
import antd.select.select
import antd.tooltip.tooltip
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinext.js.objectAssign
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.a
import react.dom.div
import react.dom.span

private val residences: Array<CascaderOptionType> = arrayOf(
        jsObject {
            value = "zhejiang"
            label = "Zhejiang"
            children = arrayOf(jsObject {
                value = "hangzhou"
                label = "Hangzhou"
                children = arrayOf(jsObject {
                    value = "xihu"
                    label = "West Lake"
                })
            })
        },
        jsObject {
            value = "jiangsu"
            label = "Jiangsu"
            children = arrayOf(jsObject {
                value = "nanjing"
                label = "Nanjing"
                children = arrayOf(jsObject {
                    value = "zhonghuamen"
                    label = "Zhong Hua Men"
                })
            })
        }
)

interface RegistrationFormState : RState {
    var confirmDirty: Boolean
    var autoCompleteResult: Array<DataSourceItemType>
}

class RegistrationForm : RComponent<FormComponentProps<Any>, RegistrationFormState>() {
    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, values ->
            if (err != null) {
                console.log("Received values of form: ", values)
            }
        }
    }

    private val handleConfirmBlur: FocusEventHandler<HTMLInputElement> = { e ->
        val value = e.target.asDynamic().value.unsafeCast<String>()

        setState {
            confirmDirty = state.confirmDirty || value.isNotEmpty()
        }
    }

    private val compareToFirstPassword = fun (_: Any, value: Any?, callback: Any, _: Any?, _: Any?) {
        val form = props.form

        if (value != null && value != form.getFieldValue("password")) {
            callback.asDynamic()("Two passwords that you enter is inconsistent!")
        } else {
            callback.asDynamic()()
        }
    }

    private val validateToNextPassword = fun (_: Any, value: Any?, callback: Any, _: Any?, _: Any?) {
        val form = props.form

        if (value != null && state.confirmDirty) {
            form.validateFields(arrayOf("confirm"), jsObject<ValidateFieldsOptions> { force = true })
        }

        callback.asDynamic()()
    }

    private val handleWebsiteChange = fun (value: SelectValue) {
        val result: Array<DataSourceItemType>

        result = if (value.unsafeCast<String>().isEmpty()) {
            emptyArray()
        } else {
            arrayOf(".com", ".org", ".net")
                    .map { domain -> "$value$domain" }
                    .toTypedArray()
        }

        setState {
            autoCompleteResult = result
        }
    }

    override fun RegistrationFormState.init() {
        confirmDirty = false
        autoCompleteResult = emptyArray()
    }

    override fun RBuilder.render() {
        val formItemLayout = jsObject<FormItemProps> {
            labelCol = jsObject {
                xs = jsObject { span = 24 }
                sm = jsObject { span = 8 }
            }
            wrapperCol = jsObject {
                xs = jsObject { span = 24 }
                sm = jsObject { span = 16 }
            }
        }

        val tailFormItemLayout = jsObject<FormItemProps> {
            wrapperCol = jsObject {
                xs = jsObject {
                    span = 24
                    offset = 0
                }
                sm = jsObject {
                    span = 16
                    offset = 8
                }
            }
        }

        val prefixSelector = props.form.getFieldDecorator("prefix", jsObject {
            initialValue = "86"
        })(buildElement {
            select<String, SelectComponent<String>> {
                attrs.style = js { width = 70 }
                option {
                    attrs.value = "86"
                    +"+86"
                }
                option {
                    attrs.value = "87"
                    +"+87"
                }
            }
        }!!)

        val websiteOptions = state.autoCompleteResult.map { website ->
            buildElement {
                option {
                    attrs.key = website.unsafeCast<String>()
                    +website.unsafeCast<String>()
                }
            }
        }.toTypedArray().unsafeCast<Array<DataSourceItemType>>()

        form {
            objectAssign(attrs, formItemLayout)
            attrs.onSubmit = handleSubmit
            formItem {
                attrs.label = "E-mail"
                childList.add(props.form.getFieldDecorator("email", jsObject {
                    rules = arrayOf(
                            jsObject {
                                type = "email"
                                message = "The input is not valid E-mail!"
                            },
                            jsObject {
                                required = true
                                message = "Please input your E-mail!"
                            }
                    )
                })(buildElement {
                    input {}
                }!!))
            }
            formItem {
                attrs.label = "Password"
                childList.add(props.form.getFieldDecorator("password", jsObject {
                    rules = arrayOf(
                            jsObject {
                                required = true
                                message = "Please input your password!"
                            },
                            jsObject {
                                validator = validateToNextPassword
                            }
                    )
                })(buildElement {
                    password {}
                }!!))
            }
            formItem {
                attrs.label = "Confirm Password"
                childList.add(props.form.getFieldDecorator("confirm", jsObject {
                    rules = arrayOf(
                            jsObject {
                                required = true
                                message = "Please confirm your password!"
                            },
                            jsObject {
                                validator = compareToFirstPassword
                            }
                    )
                })(buildElement {
                    password {
                        attrs.onBlur = handleConfirmBlur
                    }
                }!!))
            }
            formItem {
                attrs.label = buildElement {
                    span {
                        +"Nickname "
                        tooltip {
                            attrs.title = "What do you want others to call you?"
                            icon {
                                attrs.type = "question-circle-o"
                            }
                        }
                    }
                }
                childList.add(props.form.getFieldDecorator("nickname", jsObject {
                    rules = arrayOf(
                            jsObject {
                                required = true
                                message = "Please input your nickname!"
                            }
                    )
                })(buildElement {
                    input {}
                }!!))
            }
            formItem {
                attrs.label = "Habitual Residence"
                childList.add(props.form.getFieldDecorator("residence", jsObject {
                    initialValue = arrayOf("zhejiang", "hangzhou", "xihu")
                    rules = arrayOf(
                            jsObject {
                                type = "array"
                                required = true
                                message = "Please input your habitual residence!"
                            }
                    )
                })(buildElement {
                    cascader {
                        attrs.options = residences
                    }
                }!!))
            }
            formItem {
                attrs.label = "Phone Number"
                childList.add(props.form.getFieldDecorator("phone", jsObject {
                    rules = arrayOf(
                            jsObject {
                                required = true
                                message = "Please input your phone number!"
                            }
                    )
                })(buildElement {
                    input {
                        attrs {
                            addonBefore = prefixSelector
                            style = js { width = "100%" }
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "Website"
                childList.add(props.form.getFieldDecorator("website", jsObject {
                    rules = arrayOf(
                            jsObject {
                                required = true
                                message = "Please input your website!"
                            }
                    )
                })(buildElement {
                    autoComplete {
                        attrs {
                            dataSource = websiteOptions
                            onChange = handleWebsiteChange
                            placeholder = "website"
                        }
                        input {}
                    }
                }!!))
            }
            formItem {
                attrs {
                    label = "Captcha"
                    extra = "We must make sure that your are a human."
                }
                row {
                    attrs.gutter = 8
                    col {
                        attrs.span = 12
                        childList.add(props.form.getFieldDecorator("captcha", jsObject {
                            rules = arrayOf(
                                    jsObject {
                                        required = true
                                        message = "Please input the captcha you got!"
                                    }
                            )
                        })(buildElement {
                            input {}
                        }!!))
                    }
                    col {
                        attrs.span = 12
                        button { +"Get captcha" }
                    }
                }
            }
            formItem {
                objectAssign(attrs, tailFormItemLayout)
                childList.add(props.form.getFieldDecorator("agreement", jsObject {
                    valuePropName = "checked"
                })(buildElement {
                    checkbox {
                        +"I have read the "
                        a {
                            attrs.href = ""
                            +"agreement"
                        }
                    }
                }!!))
            }
            formItem {
                objectAssign(attrs, tailFormItemLayout)
                button {
                    attrs {
                        type = "primary"
                        htmlType = "submit"
                    }
                    +"Register"
                }
            }
        }
    }
}

private val wrappedRegistrationForm = FormComponent.create<FormComponentProps<Any>, RegistrationFormState>(
        jsObject { name = "register" })(RegistrationForm::class.js)

fun RBuilder.wrappedRegistrationForm(handler: RHandler<FormComponentProps<Any>>) = child(wrappedRegistrationForm, jsObject {}, handler)

fun RBuilder.register() {
    div("form-container") {
        attrs.id = "form-register"
        wrappedRegistrationForm {}
    }
}
