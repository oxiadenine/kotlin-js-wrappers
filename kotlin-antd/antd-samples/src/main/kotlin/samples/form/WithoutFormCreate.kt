package samples.form

import antd.ChangeEventHandler
import antd.form.*
import antd.inputnumber.inputNumber
import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.html.id
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.div

private fun validatePrimeNumber(number: Number): RawFormValidation {
    if (number == 11) {
        return jsObject {
            validateStatus = "success"
            errorMsg = null
        }
    }

    return jsObject {
        validateStatus = "error"
        errorMsg = "The prime between 8 and 12 is 11!"
    }
}

interface RawFormValidation {
    var validateStatus: String
    var errorMsg: String?
    var value: Number
}

interface RawFormState : RState {
    var number: RawFormValidation
}

class RawForm : RComponent<FormComponentProps<Any>, RawFormState>() {
    private val handleNumberChange: ChangeEventHandler<HTMLInputElement> = { inputValue ->
        val validation = validatePrimeNumber(inputValue.unsafeCast<Number>())

        setState {
            number = jsObject {
                validateStatus = validation.validateStatus
                errorMsg = validation.errorMsg
                value = inputValue.unsafeCast<Number>()
            }
        }
    }

    override fun RawFormState.init() {
        number = jsObject {
            value = 11
        }
    }

    override fun RBuilder.render() {
        val formItemLayout = jsObject<FormItemProps> {
            labelCol = jsObject { span = 7 }
            wrapperCol = jsObject { span = 12 }
        }

        val tips = "A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself."

        form {
            formItem {
                Object.assign(attrs, formItemLayout)
                attrs {
                    label = "Prime between 8 & 12"
                    validateStatus = state.number.validateStatus
                    help = state.number.errorMsg ?: tips
                }
                inputNumber {
                    attrs {
                        min = 8
                        max = 12
                        value = state.number.value
                        onChange = handleNumberChange
                    }
                }
            }
        }
    }
}

fun RBuilder.rawForm() = child(RawForm::class) {}

fun RBuilder.withoutFormCreate() {
    div("form-container") {
        attrs.id = "form-without-form-create"
        rawForm()
    }
}
