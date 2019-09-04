package samples.form

import antd.ChangeEventHandler
import antd.FormEventHandler
import antd.button.button
import antd.form.*
import antd.input.input
import antd.select.SelectValue
import antd.select.option
import antd.select.select
import kotlinext.js.Object
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinext.js.objectAssign
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.div
import react.dom.span

interface PriceInputProps : FormComponentProps<Any> {
    var value: Any?
    var size: String?
    var onChange: ((value: PriceInputState) -> Unit)?
}

interface PriceInputState : RState {
    var number: Number
    var currency: String
}

class PriceInput : RComponent<PriceInputProps, PriceInputState>() {
    private var handleNumberChange: ChangeEventHandler<HTMLInputElement> = { e ->
        val value = e.target.asDynamic().value.unsafeCast<String>()
        val numberValue = if (value.isEmpty()) 0.0 else {
            try {
                value.toInt(10).toDouble()
            } catch (ex: NumberFormatException) {
                Double.NaN
            }
        }

        if (!numberValue.isNaN()) {
            if (!Object.keys(props).contains("value")) {
                 setState {
                     number = numberValue.unsafeCast<Number>()
                 }
            }

            triggerChange(js { number = numberValue }.unsafeCast<Any>())
        }
    }

    private val handleCurrencyChange = fun (value: SelectValue, _: Any) {
        if (!Object.keys(props).contains("value")) {
            setState {
                currency = value.unsafeCast<String>()
            }
        }

        triggerChange(js { currency = value }.unsafeCast<Any>())
    }

    private val triggerChange = fun (changedValue: Any) {
        // Should provide an event to pass value to Form.
        val onChange = props.onChange

        if (onChange != null) {
            val obj = objectAssign(state, changedValue)

            onChange(obj)
        }
    }

    override fun PriceInputState.init() {
        val value = props.asDynamic()?.value ?: js {}

        number = value.number?.unsafeCast<Number>() ?: 0
        currency = value.currency?.unsafeCast<String>() ?: "rmb"

        PriceInput::class.js.asDynamic().getDerivedStateFromProps = fun (nextProps: PriceInputProps): Any? {
            // Should be a controlled component.
            if (Object.keys(nextProps).contains("value")) {
                return if (nextProps.value != null) nextProps else js {}.unsafeCast<Any>()
            }

            return null
        }
    }

    override fun RBuilder.render() {
        span {
            input {
                attrs {
                    type = "text"
                    size = props.size
                    value = state.number
                    onChange = handleNumberChange
                    style = js {
                        width = "65%"
                        marginRight = "3%"
                    }
                }
            }
            select {
                attrs {
                    value = state.currency
                    size = props.size
                    style = js { width = "32%" }
                    onChange = handleCurrencyChange
                }
                option {
                    attrs.value = "rmb"
                    +"RMB"
                }
                option {
                    attrs.value = "dollar"
                    +"Dollar"
                }
            }
        }
    }
}

fun RBuilder.priceInput() = child(PriceInput::class) {}

class CustomizedFormControlsDemo : RComponent<FormComponentProps<Any>, RState>() {
    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, values ->
            if (err != null) {
                console.log("Received values of form: ", values)
            }
        }
    }

    private val checkPrice = fun (_: Any, value: Any?, callback: Any, _: Any?, _: Any?) {
        if (value != null && value.asDynamic().number.unsafeCast<Number>().toInt() > 0) {
            callback.asDynamic()()

            return
        }

        callback.asDynamic()("Price must greater than zero!")
    }

    override fun RBuilder.render() {
        form {
            attrs {
                layout = "inline"
                onSubmit = handleSubmit
            }
            formItem {
                attrs.label = "Price"
                childList.add(props.form.getFieldDecorator("price", jsObject {
                    initialValue = js {
                        number = 0
                        currency ="rmb"
                    }.unsafeCast<Object>()
                    rules = arrayOf(jsObject { validator = checkPrice })
                })(buildElement {
                    priceInput()
                }!!))
            }
            formItem {
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

private val wrappedCustomizedFormControlsDemo = FormComponent.create<FormComponentProps<Any>, RState>(
        jsObject { name = "customized_form_controls" })(CustomizedFormControlsDemo::class.js)

fun RBuilder.wrappedCustomizedFormControlsDemo(handler: RHandler<FormComponentProps<Any>>) = child(wrappedCustomizedFormControlsDemo, jsObject {}, handler)

fun RBuilder.customizedFormControls() {
    div("form-container") {
        attrs.id = "form-customized-form-controls"
        wrappedCustomizedFormControlsDemo {}
    }
}
