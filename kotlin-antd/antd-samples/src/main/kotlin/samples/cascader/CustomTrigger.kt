package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.CascaderValueType
import antd.cascader.cascader
import kotlinext.js.jso
import react.*
import react.dom.a
import react.dom.span
import styled.css
import styled.styledDiv

private val cascaderOptions = arrayOf<CascaderOptionType>(
    jso {
        value = "zhejiang"
        label = "Zhejiang"
        children = arrayOf(
            jso {
                value = "hangzhou"
                label = "Hangzhou"
            }
        )
    },
    jso {
        value = "jiangsu"
        label = "Jiangsu"
        children = arrayOf(
            jso {
                value = "nanjing"
                label = "Nanjing"
            }
        )
    }
)

external interface CustomTriggerCitySwitcherState : State {
    var text: String
}

class CustomTriggerCitySwitcher : RComponent<Props, CustomTriggerCitySwitcherState>() {
    private val handleChange = fun(_: CascaderValueType, selectedOptions: Array<CascaderOptionType>?) {
        setState {
            text = selectedOptions!!.joinToString(", ") { selectedOption ->
                selectedOption.label!!.unsafeCast<String>()
            }
        }
    }

    override fun CustomTriggerCitySwitcherState.init() {
        text = "Unselect"
    }

    override fun RBuilder.render() {
        span {
            +state.text
            +" "
            cascader {
                attrs {
                    options = cascaderOptions
                    onChange = handleChange
                }
                a {
                    attrs.href = "#"
                    +"Change city"
                }
            }
        }
    }
}

fun RBuilder.customTriggerCitySwitcher() = child(CustomTriggerCitySwitcher::class) {}

fun RBuilder.customTrigger() {
    styledDiv {
        css { +CascaderStyles.customTrigger }
        customTriggerCitySwitcher()
    }
}
