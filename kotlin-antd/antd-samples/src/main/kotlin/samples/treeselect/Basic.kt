package samples.treeselect

import antd.treeselect.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

interface BasicDemoState : RState {
    var value: String?
}

class BasicDemo : RComponent<RProps, BasicDemoState>() {
    private val handleChange = fun(newValue: String, _: Any, _: Any) {
        console.log(newValue)

        setState {
            value = newValue
        }
    }

    override fun BasicDemoState.init() {
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
                        key = "random2"
                        value = "parent 1-1"
                        title = "parent 1-1"
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

fun RBuilder.basicDemo() = child(BasicDemo::class) {}

fun RBuilder.basic() {
    styledDiv {
        css { +TreeSelectStyles.basic }
        basicDemo()
    }
}
