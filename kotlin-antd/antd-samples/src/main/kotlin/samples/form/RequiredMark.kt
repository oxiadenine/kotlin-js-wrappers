package samples.form

import antd.button.*
import antd.form.*
import antd.icon.*
import antd.input.*
import antd.radio.*
import kotlinext.js.*
import react.*
import styled.*

private val demo = functionalComponent<RProps> {
    val formComponent = FormComponent.useForm()[0]
    val (reqMark, setReqMarkType) = useState<Any /* Boolean | "optional" */>("optional")

    val onRequiredTypeChange = { requiredMark: Any, _: Any ->
        setReqMarkType(requiredMark.asDynamic().requiredMark as Any)
    }

    form {
        attrs {
            form = formComponent
            layout = "vertical"
            initialValues = js { requiredMark = reqMark }.unsafeCast<Store>()
            onValuesChange = onRequiredTypeChange
            requiredMark = reqMark
        }
        formItem {
            attrs {
                label = "Required Mark"
                name = "requiredMark"
            }
            radioGroup {
                radioButton {
                    attrs.value = "optional"
                    +"Optional"
                }
                radioButton {
                    attrs.value = true
                    +"Required"
                }
                radioButton {
                    attrs.value = false
                    +"Hidden"
                }
            }
        }
        formItem {
            attrs {
                label = "Field A"
                required = true
                tooltip = "This is a required field"
            }
            input {
                attrs.placeholder = "input placeholder"
            }
        }
        formItem {
            attrs {
                label = "Field B"
                tooltip = jsObject<WrapperTooltipProps> {
                    title = "Tooltip with customize icon"
                    icon = buildElement {
                        infoCircleOutlined {}
                    }
                }
            }
            input {
                attrs.placeholder = "input placeholder"
            }
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

fun RBuilder.requiredMarkDemo() = child(demo)

fun RBuilder.requiredMark() {
    styledDiv {
        css { +FormStyles.requiredMark }
        requiredMarkDemo()
    }
}
