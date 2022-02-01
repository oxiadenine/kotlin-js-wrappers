package samples.form

import antd.autocomplete.DataSourceItemType
import antd.autocomplete.autoComplete
import antd.button.button
import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import antd.checkbox.checkbox
import antd.form.*
import antd.grid.col
import antd.grid.row
import antd.icon.questionCircleOutlined
import antd.input.input
import antd.input.password
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import antd.tooltip.tooltip
import kotlinext.js.js
import kotlinext.js.jso
import react.*
import react.dom.a
import react.dom.span
import styled.css
import styled.styledDiv
import kotlin.js.Promise

private val residences: Array<CascaderOptionType> = arrayOf(
    jso {
        value = "zhejiang"
        label = "Zhejiang"
        children = arrayOf(jso {
            value = "hangzhou"
            label = "Hangzhou"
            children = arrayOf(jso {
                value = "xihu"
                label = "West Lake"
            })
        })
    },
    jso {
        value = "jiangsu"
        label = "Jiangsu"
        children = arrayOf(jso {
            value = "nanjing"
            label = "Nanjing"
            children = arrayOf(jso {
                value = "zhonghuamen"
                label = "Zhong Hua Men"
            })
        })
    }
)

private val formItemLayout = jso<FormItemProps<Any>> {
    labelCol = jso {
        xs = jso { span = 24 }
        sm = jso { span = 8 }
    }
    wrapperCol = jso {
        xs = jso { span = 24 }
        sm = jso { span = 16 }
    }
}

private val tailFormItemLayout = jso<FormProps<Any>> {
    wrapperCol = jso {
        xs = jso {
            span = 24
            offset = 0
        }
        sm = jso {
            span = 16
            offset = 8
        }
    }
}

external interface RegistrationFormState : State {
    var confirmDirty: Boolean
    var autoCompleteResult: Array<DataSourceItemType>
}

private val registrationForm = fc<Props> {
    val formInstance = FormComponent.useForm()[0]

    val handleFinish = { values: Any ->
        console.log("Received values of form: ", values)
    }

    val prefixSelector = buildElement {
        formItem {
            attrs {
                name = "prefix"
                noStyle = true
            }
            select<String, SelectComponent<String>> {
                option {
                    attrs.value = "86"
                    +"86"
                }
                option {
                    attrs.value = "87"
                    +"87"
                }
            }
        }
    }

    val (autoCompleteResult, setAutoCompleteResult) = useState(emptyArray<String>())

    val onWebsiteChange = { value: String?, _: Any ->
        if (value !== null) {
            setAutoCompleteResult(emptyArray())
        } else {
            setAutoCompleteResult(arrayOf(".com", ".org", ".net")
                .map { domain -> "$value$domain" }
                .toTypedArray()
            )
        }
    }

    val websiteOptions = autoCompleteResult.map { website ->
        js {
            label = website
            value = website
        }
    }.toTypedArray()

    form {
        attrs {
            labelCol = formItemLayout.labelCol
            wrapperCol = formItemLayout.wrapperCol
            form = formInstance
            name = "register"
            onFinish = handleFinish
            initialValues = js {
                residance = arrayOf("zhejiang", "hangzhou", "xihu")
                prefix = "86"
            }.unsafeCast<Store>()
            scrollToFirstError = true
        }
        formItem {
            attrs {
                name = "email"
                label = "Email"
                rules = arrayOf(
                    jso<AggregationRule> {
                        type = "email"
                        message = "The input is not valid E-mail!"
                    },
                    jso<AggregationRule> {
                        required = true
                        message = "Please input your E-mail!"
                    }
                )
            }
            input {}
        }
        formItem {
            attrs {
                name = "password"
                label = "Password"
                rules = arrayOf(
                    jso<AggregationRule> {
                        required = true
                        message = "Please input your password!"
                    }
                )
                hasFeedback = true
            }
            password {}
        }
        formItem {
            attrs {
                name = "confirm"
                label = "Confirm Password"
                dependencies = arrayOf("password")
                hasFeedback = true
                rules = arrayOf(
                    jso<AggregationRule> {
                        required = true
                        message = "Please confirm your password!"
                    },
                    jso<ValidatorRule> {
                        validator = { _, value, _ ->
                            if (value !== null || formInstance.getFieldValue("password") === value) {
                                Promise.resolve(Unit)
                            }
                            Promise.reject(Error("The two passwords that you entered do not match!"))
                        }
                    }
                )
            }
            password {}
        }
        formItem {
            attrs {
                name = "nickname"
                label = buildElement {
                    span {
                        +"Nickname"
                        tooltip {
                            attrs.title = "What do you want others to call you?"
                            questionCircleOutlined {}
                        }
                    }
                }
                rules = arrayOf(
                    jso<AggregationRule> {
                        required = true
                        message = "Please input your nickname!"
                        whitespace = true
                    }
                )
            }
            input {}
        }
        formItem {
            attrs {
                name = "residence"
                label = "Habitual Residence"
                rules = arrayOf(
                    jso<AggregationRule> {
                        type = "array"
                        required = true
                        message = "Please select your habitual residence!"
                    }
                )
            }
            cascader {
                attrs.options = residences
            }
        }
        formItem {
            attrs {
                name = "phone"
                label = "Phone Number"
                rules = arrayOf(
                    jso<AggregationRule> {
                        required = true
                        message = "Please input your phone number!"
                    }
                )
            }
            input {
                attrs {
                    addonBefore = prefixSelector
                    style = js { width = "100%" }
                }
            }
        }
        formItem {
            attrs {
                name = "website"
                label = "Website"
                rules = arrayOf(
                    jso<AggregationRule> {
                        required = true
                        message = "Please input website!"
                    }
                )
            }
            autoComplete {
                attrs {
                    dataSource = websiteOptions
                    onChange = onWebsiteChange
                    placeholder = "website"
                }
                input {}
            }
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
                    formItem {
                        attrs {
                            name = "captcha"
                            noStyle = true
                            rules = arrayOf(
                                jso<AggregationRule> {
                                    required = true
                                    message = "Please input the captcha you got!"
                                }
                            )
                        }
                        input {}
                    }
                }
                col {
                    attrs.span = 12
                    button { +"Get captcha" }
                }
            }
        }
        formItem {
            attrs {
                name = "agreement"
                valuePropName = "checked"
                rules = arrayOf(
                    jso<ValidatorRule> {
                        validator = { _, value, _ ->
                            if (value !== null) {
                                Promise.resolve(Unit)
                            } else Promise.reject(Error("Should accept agreement"))
                        }
                    }
                )
                labelCol = tailFormItemLayout.labelCol
                wrapperCol = tailFormItemLayout.wrapperCol
            }
            checkbox {
                +"I have read the "
                a(href = "") { +"agreement" }
            }
        }
        formItem {
            attrs {
                labelCol = tailFormItemLayout.labelCol
                wrapperCol = tailFormItemLayout.wrapperCol
            }
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

fun RBuilder.registrationForm() = child(registrationForm) {}

fun RBuilder.register() {
    styledDiv {
        css { +FormStyles.register }
        registrationForm()
    }
}
