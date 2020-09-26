package samples.tree

import antd.tree.TreeNodeCheckedEvent
import antd.tree.TreeNodeSelectedEvent
import antd.tree.tree
import antd.tree.treeNode
import kotlinext.js.js
import react.*
import react.dom.jsStyle
import react.dom.span
import styled.css
import styled.styledDiv

class BasicDemo : RComponent<RProps, RState>() {
    private val handleSelect = fun (selectedKeys: Array<String>, info: TreeNodeSelectedEvent) {
        console.log("selected", selectedKeys, info)
    }

    private val handleCheck = fun (checkedKeys: Any, info: TreeNodeCheckedEvent) {
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
                                span {
                                    attrs.jsStyle = js { color = "#1890f" }
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
