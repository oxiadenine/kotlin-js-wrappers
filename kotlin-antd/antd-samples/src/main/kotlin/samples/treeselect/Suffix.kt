package samples.treeselect

import antd.icon.smileOutlined
import antd.treeselect.TreeSelectComponent
import antd.treeselect.treeNode
import antd.treeselect.treeSelect
import kotlinext.js.js
import kotlinx.css.Color
import kotlinx.css.color
import react.*
import styled.css
import styled.styledB
import styled.styledDiv

private val icon = buildElement {
    smileOutlined {}
}

external interface SuffixDemoState : State {
    var value: String?
}

class SuffixDemo : RComponent<Props, SuffixDemoState>() {
    private val handleChange = fun(newValue: String, _: Any, _: Any) {
        console.log(newValue)

        setState {
            value = newValue
        }
    }

    override fun SuffixDemoState.init() {
        value = null
    }

    override fun RBuilder.render() {
        treeSelect<String, TreeSelectComponent<String>> {
            attrs {
                showSearch = true
                suffixIcon = suffixIcon
                style = js { width = 300 }
                value = state.value
                dropdownStyle = js {
                    maxHeight = 400
                    overflow = "auto"
                }
                placeholder = "Please select"
                allowClear = true
                treeDefaultExpandAll = true
                onChange = handleChange
            }
            treeNode {
                attrs {
                    value = "parent 1"
                    title = "parent 1"
                    key = "0-1"
                }
                treeNode {
                    attrs {
                        value = "parent 1-0"
                        title = "parent 1-0"
                        key = "0-1-1"
                    }
                    treeNode {
                        attrs {
                            value = "leaf1"
                            title = "my leaf"
                            key = "random"
                        }
                    }
                    treeNode {
                        attrs {
                            value = "leaf2"
                            title = "your leaf"
                            key = "random1"
                        }
                    }
                }
                treeNode {
                    attrs {
                        value = "parent 1-1"
                        title = "parent 1-1"
                        key = "random2"
                    }
                    treeNode {
                        attrs {
                            value = "sss"
                            title = buildElement {
                                styledB {
                                    css { color = Color("#08c") }
                                    +"sss"
                                }
                            }
                            key = "random3"
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.suffixMultipleDemo() = child(SuffixDemo::class) {}

fun RBuilder.suffix() {
    styledDiv {
        css { +TreeSelectStyles.suffix }
        suffixMultipleDemo()
    }
}
