package samples.treeselect

import antd.treeselect.TreeSelectComponent
import antd.treeselect.treeNode
import antd.treeselect.treeSelect
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

interface MultipleDemoState : RState {
    var value: String?
}

class MultipleDemo : RComponent<RProps, MultipleDemoState>() {
    private val handleChange = fun (newValue: String, _: Any, _: Any) {
        console.log(newValue)

        setState {
            value = newValue
        }
    }

    override fun MultipleDemoState.init() {
        value = null
    }

    override fun RBuilder.render() {
        treeSelect<String, TreeSelectComponent<String>> {
            attrs {
                showSearch = true
                style = js { width = 300 }
                value = state.value
                dropdownStyle = js {
                    maxHeight = 400
                    overflow = "auto"
                }
                placeholder = "Please select"
                allowClear = true
                multiple = true
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
                                b {
                                    attrs.jsStyle = js { color = "#08c" }
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

fun RBuilder.multipleDemo() = child(MultipleDemo::class) {}

fun RBuilder.multiple() {
    div("tree-select-container") {
        attrs.id = "tree-select-multiple"
        multipleDemo()
    }
}
