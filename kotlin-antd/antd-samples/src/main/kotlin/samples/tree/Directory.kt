package samples.tree

import antd.Key
import antd.tree.OnExpandInfo
import antd.tree.OnSelectInfo
import antd.tree.directoryTree
import antd.tree.treeNode
import react.*
import styled.css
import styled.styledDiv

class DirectoryDemo : RComponent<RProps, State>() {
    private val handleSelect = fun(selectedKeys: Array<Key>, info: OnSelectInfo) {
        console.log("selected", selectedKeys, info)
    }

    private val handleExpand: (expandedKey: Array<Key>, info: OnExpandInfo) -> Unit = { _, _ ->
        console.log("Trigger Expand")
    }

    override fun RBuilder.render() {
        directoryTree {
            attrs {
                multiple = true
                defaultExpandAll = true
                onSelect = handleSelect
                onExpand = handleExpand
            }
            treeNode {
                attrs {
                    title = "parent 0"
                    key = "0-0"
                }
                treeNode {
                    attrs {
                        title = "leaf 0-0"
                        key = "0-0-0"
                        isLeaf = true
                    }
                }
                treeNode {
                    attrs {
                        title = "leaf 0-1"
                        key = "0-0-1"
                        isLeaf = true
                    }
                }
            }
            treeNode {
                attrs {
                    title = "parent 1"
                    key = "0-1"
                }
                treeNode {
                    attrs {
                        title = "leaf 1-0"
                        key = "0-1-0"
                        isLeaf = true
                    }
                }
                treeNode {
                    attrs {
                        title = "leaf 1-1"
                        key = "0-1-1"
                        isLeaf = true
                    }
                }
            }
        }
    }
}

fun RBuilder.directoryDemo() = child(DirectoryDemo::class) {}

fun RBuilder.directory() {
    styledDiv {
        css { +TreeStyles.directory }
        directoryDemo()
    }
}
