package samples.form

import antd.FormEventHandler
import antd.MouseEventHandler
import antd.button.button
import antd.form.*
import antd.icon.icon
import antd.input.input
import kotlinext.js.Object
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinext.js.objectAssign
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div

private var uuid = 0

class DynamicFieldSet : RComponent<FormComponentProps<Any>, RState>() {
    private val remove = fun (k: String) {
        // can use data-binding to get
        val formKeys = props.form.getFieldValue("keys").unsafeCast<Array<String>>()

        // We need at least one passenger
        if (formKeys.size == 1) {
            return
        }

        // can use data-binding to set
        props.form.setFieldsValue(js {
            keys = formKeys.filter { key -> key != k }.toTypedArray()
        }.unsafeCast<Object>())
    }

    private val add: MouseEventHandler<Any> = {
        // can use data-binding to get
        val formKeys = props.form.getFieldValue("keys").unsafeCast<Array<String>>()
        val nextKeys = formKeys.plus(uuid)

        uuid++

        // can use data-binding to set
        // important! notify form to detect changes
        props.form.setFieldsValue(js {
            keys = nextKeys
        }.unsafeCast<Object>())
    }

    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, values ->
            if (err != null) {
                console.log("Received values of form: ", values)
            }
        }
    }

    override fun RBuilder.render() {
        val formItemLayout = jsObject<FormItemProps> {
            labelCol = jsObject {
                xs = jsObject { span = 24 }
                sm = jsObject { span = 4 }
            }
            wrapperCol = jsObject {
                xs = jsObject { span = 24 }
                sm = jsObject { span = 20 }
            }
        }

        val formItemLayoutWithOutLabel = jsObject<FormItemProps> {
            wrapperCol = jsObject {
                xs = jsObject {
                    span = 24
                    offset = 0
                }
                sm = jsObject {
                    span = 20
                    offset = 4
                }
            }
        }

        props.form.getFieldDecorator("keys", jsObject {
            initialValue = emptyArray<String>()
        })

        val keys = props.form.getFieldValue("keys").unsafeCast<Array<String>>()
        val formItems = keys.mapIndexed { index, k ->
            buildElement {
                formItem {
                    attrs {
                        if (index == 0) {
                            labelCol = formItemLayout.labelCol
                            wrapperCol = formItemLayout.wrapperCol
                            label = "Passengers"
                        } else {
                            wrapperCol = formItemLayoutWithOutLabel.wrapperCol
                            label = ""
                        }
                        key = k
                    }
                    childList.add(props.form.getFieldDecorator("names[$k]", jsObject {
                        validateTrigger = arrayOf("onChange", "onBlur")
                        rules = arrayOf(jsObject {
                            required = true
                            whitespace = true
                            message = "Please input passenger's name or delete this field."
                        })
                    })(buildElement {
                        input {
                            attrs {
                                placeholder = "passenger name"
                                style = js {
                                    width = "60%"
                                    marginRight = 8
                                }
                            }
                        }
                    }!!))
                    if (keys.size > 1) {
                        icon {
                            attrs {
                                className = "dynamic-delete-button"
                                type = "minus-circle-o"
                                onClick = { remove(k) }
                            }
                        }
                    }
                }
            }
        }.toTypedArray()

        form {
            attrs.onSubmit = handleSubmit
            childList.add(formItems)
            formItem {
                objectAssign(attrs, formItemLayoutWithOutLabel)
                button {
                    attrs {
                        type = "dashed"
                        onClick = add
                        style = js { width = "60%" }
                    }
                    icon {
                        attrs.type = "plus"
                    }
                    +" Add field"
                }
            }
            formItem {
                attrs.wrapperCol = formItemLayoutWithOutLabel.wrapperCol
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

private val wrappedDynamicFieldSet = FormComponent.create<FormComponentProps<Any>, RState>(
        jsObject { name = "dynamic_form_item" })(DynamicFieldSet::class.js)

fun RBuilder.wrappedDynamicFieldSet(handler: RHandler<FormComponentProps<Any>>) = child(wrappedDynamicFieldSet, jsObject {}, handler)

fun RBuilder.dynamicFormItem() {
    div("form-container") {
        attrs.id = "form-dynamic-form-item"
        wrappedDynamicFieldSet {}
    }
}
