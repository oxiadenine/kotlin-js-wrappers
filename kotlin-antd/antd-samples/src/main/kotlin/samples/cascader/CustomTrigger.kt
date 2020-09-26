package samples.cascader

import antd.cascader.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val cascaderOptions = arrayOf<CascaderOptionType>(
    jsObject {
        value = "zhejiang"
        label = "Zhejiang"
        children = arrayOf(
            jsObject {
                value = "hangzhou"
                label = "Hangzhou"
            }
        )
    },
    jsObject {
        value = "jiangsu"
        label = "Jiangsu"
        children = arrayOf(
            jsObject {
                value = "nanjing"
                label = "Nanjing"
            }
        )
    }
)

interface CustomTriggerCitySwitcherState : RState {
    var text: String
}

class CustomTriggerCitySwitcher : RComponent<RProps, CustomTriggerCitySwitcherState>() {
    private val handleChange = fun(_: Array<String>, selectedOptions: Array<CascaderOptionType>?) {
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
