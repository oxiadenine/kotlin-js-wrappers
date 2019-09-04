package samples.form

import antd.MouseEventHandler
import antd.button.button
import antd.checkbox.CheckboxChangeEvent
import antd.checkbox.checkbox
import antd.form.*
import antd.input.input
import kotlinext.js.jsObject
import kotlinext.js.objectAssign
import kotlinx.html.id
import react.*
import react.dom.div

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

    private val handleChange = fun (e: CheckboxChangeEvent) {
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
                objectAssign(attrs, formItemLayout)
                attrs.label = "Name"
                childList.add(props.form.getFieldDecorator("username", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please input your name"
                    })})(buildElement {
                        input {
                            attrs.placeholder = "Please input your name"
                        }
                    }!!))
            }
            formItem {
                objectAssign(attrs, formItemLayout)
                attrs.label = "Nickname"
                childList.add(props.form.getFieldDecorator("nickname", jsObject {
                    rules = arrayOf(jsObject {
                        required = state.checkNick
                        message = "Please input your nickname"
                })})(buildElement {
                    input {
                        attrs.placeholder = "Please input your nickname"
                    }
                }!!))
            }
            formItem {
                objectAssign(attrs, formTailLayout)
                checkbox {
                    attrs {
                        checked = state.checkNick
                        onChange = handleChange
                    }
                    +"Nickname is required"
                }
            }
            formItem {
                objectAssign(attrs, formTailLayout)
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
    div("form-container") {
        attrs.id = "form-dynamic-rule"
        wrappedDynamicRuleApp {}
    }
}
