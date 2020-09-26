package samples.select

import antd.radio.*
import antd.select.*
import antd.select.option
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val children = (10..36).map { i ->
    buildElement {
        option {
            attrs.key = i.toString(36) + i
            +(i.toString(36) + i)
        }
    }
}.toTypedArray()

private fun handleChange(value: SelectValue, option: Any) {
    console.log("selected $value")
}

interface SelectSizesDemoState : RState {
    var size: String
}

class SelectSizesDemo : RComponent<RProps, SelectSizesDemoState>() {
    private val handleSizeChange = fun(event: RadioChangeEvent) {
        setState {
            size = event.target.value as String
        }
    }

    override fun SelectSizesDemoState.init() {
        size = "default"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    value = state.size
                    onChange = handleSizeChange
                }
                radioButton {
                    attrs.value = "large"
                    +"Large"
                }
                radioButton {
                    attrs.value = "default"
                    +"Default"
                }
                radioButton {
                    attrs.value = "small"
                    +"Small"
                }
            }
            br {}
            br {}
            select<String, SelectComponent<String>> {
                attrs {
                    size = state.size
                    defaultValue = "1010"
                    onChange = ::handleChange
                    style = js { width = 200 }
                }
                childList.add(children)
            }
            br {}
            select<Array<String>, SelectComponent<Array<String>>> {
                attrs {
                    mode = "multiple"
                    size = state.size
                    placeholder = "Please select"
                    defaultValue = arrayOf("a10", "c12")
                    onChange = ::handleChange
                    style = js { width = "100%" }
                }
                childList.add(children)
            }
            br {}
            select<Array<String>, SelectComponent<Array<String>>> {
                attrs {
                    mode = "tags"
                    size = state.size
                    placeholder = "Please select"
                    defaultValue = arrayOf("a10", "c12")
                    onChange = ::handleChange
                    style = js { width = "100%" }
                }
                childList.add(children)
            }
        }
    }
}

fun RBuilder.selectSizesDemo() = child(SelectSizesDemo::class) {}

fun RBuilder.size() {
    styledDiv {
        css { +SelectStyles.size }
        selectSizesDemo()
    }
}
