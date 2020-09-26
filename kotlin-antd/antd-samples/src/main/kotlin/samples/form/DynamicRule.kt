package samples.form

import antd.*
import antd.button.button
import antd.checkbox.*
import antd.form.*
import antd.input.input
import kotlinext.js.*
import react.*
import react.dom.div
import styled.*

private val formItemLayout = jsObject<FormItemProps> {
    labelCol = jsObject { span = 4 }
    wrapperCol = jsObject { span = 8 }
}

private val formTailLayout = jsObject<FormItemProps> {
    labelCol = jsObject { span = 4 }
    wrapperCol = jsObject {
        span = 8
        offset = 4
    }
}

interface DynamicRuleAppState : RState {
    var checkNick: Boolean
}

class DynamicRuleApp : RComponent<FormComponentProps<Any>, DynamicRuleAppState>() {
    private val check: MouseEventHandler<Any> = {
        props.form.validateFields { err, _ ->
            if (err != null) {
                console.info("success")
            }
        }
    }

    private val handleChange = fun(e: CheckboxChangeEvent) {
        setState(jsObject<DynamicRuleAppState> {
            checkNick = e.target.checked!!
        }) {
            props.form.validateFields(arrayOf("nickname"), jsObject<ValidateFieldsOptions> { force = true })
        }
    }

    override fun DynamicRuleAppState.init() {
        checkNick = false
    }

    override fun RBuilder.render() {
        div {
            formItem {
                Object.assign(attrs, formItemLayout)
                attrs.label = "Name"
                childList.add(props.form.getFieldDecorator("username", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please input your name"
                    })
                })(buildElement {
                    input {
                        attrs.placeholder = "Please input your name"
                    }
                }))
            }
            formItem {
                Object.assign(attrs, formItemLayout)
                attrs.label = "Nickname"
                childList.add(props.form.getFieldDecorator("nickname", jsObject {
                    rules = arrayOf(jsObject {
                        required = state.checkNick
                        message = "Please input your nickname"
                    })
                })(buildElement {
                    input {
                        attrs.placeholder = "Please input your nickname"
                    }
                }))
            }
            formItem {
                Object.assign(attrs, formTailLayout)
                checkbox {
                    attrs {
                        checked = state.checkNick
                        onChange = handleChange
                    }
                    +"Nickname is required"
                }
            }
            formItem {
                Object.assign(attrs, formTailLayout)
                button {
                    attrs {
                        type = "primary"
                        onClick = check
                    }
                    +"Submit"
                }
            }
        }
    }
}

private val wrappedDynamicRuleApp = FormComponent.create<FormComponentProps<Any>, DynamicRuleAppState>(
    jsObject { name = "dynamic_rule" })(DynamicRuleApp::class.js)

fun RBuilder.wrappedDynamicRuleApp(handler: RHandler<FormComponentProps<Any>>) = child(wrappedDynamicRuleApp, jsObject {}, handler)

fun RBuilder.dynamicRule() {
    styledDiv {
        css { +FormStyles.dynamicRule }
        wrappedDynamicRuleApp {}
    }
}
