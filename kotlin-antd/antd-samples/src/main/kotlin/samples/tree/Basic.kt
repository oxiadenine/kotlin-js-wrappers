package samples.tree

import antd.Key
import antd.tree.*
import kotlinx.css.Color
import kotlinx.css.color
import react.*
import styled.*

class BasicDemo : RComponent<RProps, RState>() {
    private val handleSelect = fun(selectedKeys: Array<Key>, info: OnSelectInfo) {
        console.log("selected", selectedKeys, info)
    }

    private val handleCheck = fun(checkedKeys: Any, info: CheckInfo) {
        console.log("onCheck", checkedKeys, info)
    }

    override fun RBuilder.render() {
        tree {
            attrs {
                checkable = true
                defaultExpandedKeys = arrayOf("0-0-0", "0-0-1")
                defaultSelectedKeys = arrayOf("0-0-0", "0-0-1")
                defaultCheckedKeys = arrayOf("0-0-0", "0-0-1")
                onSelect = handleSelect
                onCheck = handleCheck
            }
            treeNode {
                attrs {
                    title = "parent 1"
                    key = "0-0"
                }
                treeNode {
                    attrs {
                        title = "parent 1-0"
                        key = "0-0-0"
                        disabled = true
                    }
                    treeNode {
                        attrs {
                            title = "leaf"
                            key = "0-0-0-0"
                            disableCheckbox = true
                        }
                    }
                    treeNode {
                        attrs {
                            title = "leaf"
                            key = "0-0-0-1"
                        }
                    }
                }
                treeNode {
                    attrs {
                        title = "parent 1-1"
                        key = "0-0-1"
                    }
                    treeNode {
                        attrs {
                            title = buildElement {
                                styledSpan {
                                    css { color = Color("#1890f") }
                                    +"sss"
                                }
                            }
                            key = "0-0-1-0"
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
        css { +TreeStyles.basic }
        basicDemo()
    }
}
