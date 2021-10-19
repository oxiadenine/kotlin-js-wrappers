package samples.select

import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.select.SelectComponent
import antd.select.SelectValue
import antd.select.option
import antd.select.select
import kotlinext.js.js
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private val children = (10..36).map { i ->
    buildElement {
        option {
            attrs.key = i.toString(36) + i
            +(i.toString(36) + i)
        }
    }
}.toTypedArray()

private val handleChange = { value: SelectValue, _: Any ->
    console.log("selected $value")
}

external interface SelectSizesDemoState : State {
    var size: String
}

class SelectSizesDemo : RComponent<Props, SelectSizesDemoState>() {
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
                    onChange = handleChange
                    style = js { width = 200 }
                }
                childList.add(children.unsafeCast<ReactNode>())
            }
            br {}
            select<Array<String>, SelectComponent<Array<String>>> {
                attrs {
                    mode = "multiple"
                    size = state.size
                    placeholder = "Please select"
                    defaultValue = arrayOf("a10", "c12")
                    onChange = handleChange
                    style = js { width = "100%" }
                }
                childList.add(children.unsafeCast<ReactNode>())
            }
            br {}
            select<Array<String>, SelectComponent<Array<String>>> {
                attrs {
                    mode = "tags"
                    size = state.size
                    placeholder = "Please select"
                    defaultValue = arrayOf("a10", "c12")
                    onChange = handleChange
                    style = js { width = "100%" }
                }
                childList.add(children.unsafeCast<ReactNode>())
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
