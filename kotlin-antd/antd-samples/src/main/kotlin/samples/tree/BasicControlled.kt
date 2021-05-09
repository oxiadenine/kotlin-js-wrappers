package samples.tree

import antd.Key
import antd.tree.*
import kotlinext.js.*
import react.*
import styled.*

private val treeData = arrayOf<TreeNodeNormal>(
    jsObject {
        title = "0-0"
        key = "0-0"
        children = arrayOf(
            jsObject {
                title = "0-0-0"
                key = "0-0-0"
                children = arrayOf(
                    jsObject {
                        title = "0-0-0-0"
                        key = "0-0-0-0"
                    },
                    jsObject {
                        title = "0-0-0-1"
                        key = "0-0-0-1"
                    },
                    jsObject {
                        title = "0-0-0-2"
                        key = "0-0-0-2"
                    }
                )
            },
            jsObject {
                title = "0-0-1"
                key = "0-0-1"
                children = arrayOf(
                    jsObject {
                        title = "0-0-1-0"
                        key = "0-0-1-0"
                    },
                    jsObject {
                        title = "0-0-1-1"
                        key = "0-0-1-1"
                    },
                    jsObject {
                        title = "0-0-1-"
                        key = "0-0-1-2"
                    }
                )
            },
            jsObject {
                title = "0-0-2"
                key = "0-0-2"
            }
        )
    },
    jsObject {
        title = "0-1"
        key = "0-1"
        children = arrayOf(
            jsObject {
                title = "0-1-0-0"
                key = "0-1-0-0"
            },
            jsObject {
                title = "0-1-0-1"
                key = "0-1-0-1"
            },
            jsObject {
                title = "0-1-0-2"
                key = "0-1-0-2"
            }
        )
    },
    jsObject {
        title = "0-2"
        key = "0-2"
    }
)

external interface BasicControlledDemoState : RState {
    var expandedKeys: Array<Key>
    var autoExpandParent: Boolean
    var checkedKeys: Array<Key>
    var selectedKeys: Array<Key>
}

class BasicControlledDemo : RComponent<RProps, BasicControlledDemoState>() {
    private val handleExpand = fun(expandKeys: Array<Key>, _: OnExpandInfo) {
        console.log("onExpand", expandKeys)

        // if not set autoExpandParent to false, if children expanded, parent can not collapse.
        // or, you can remove all expanded children keys.
        setState {
            expandedKeys = expandKeys
            autoExpandParent = false
        }
    }

    private val handleCheck = fun(checkKeys: Any, _: CheckInfo) {
        console.log("onCheck", checkKeys)

        setState {
            checkedKeys = checkKeys.unsafeCast<Array<Key>>()
        }
    }

    private val handleSelect = fun(selectKeys: Array<Key>, _: OnSelectInfo) {
        console.log("selected", selectKeys)

        setState {
            selectedKeys = selectKeys
        }
    }

    private fun renderTreeNodes(data: Array<TreeNodeNormal>): Array<ReactElement> {
        return data.map { item ->
            if (item.children != null) {
                return@map buildElement {
                    treeNode {
                        attrs {
                            title = item.title as Any
                            key = item.key as String
                        }
                        attrs.asDynamic()["dataRef"] = item
                        childList.add(renderTreeNodes(item.children!!))
                    }
                }
            }

            return@map buildElement {
                treeNode {
                    Object.assign(attrs, item)
                }
            }
        }.toTypedArray()
    }

    override fun BasicControlledDemoState.init() {
        expandedKeys = arrayOf("0-0-0", "0-0-1")
        autoExpandParent = true
        checkedKeys = arrayOf("0-0-0")
        selectedKeys = emptyArray()
    }

    override fun RBuilder.render() {
        tree {
            attrs {
                checkable = true
                defaultExpandedKeys = state.expandedKeys
                autoExpandParent = state.autoExpandParent
                onCheck = handleCheck
                defaultCheckedKeys = state.checkedKeys
                onSelect = handleSelect
                defaultSelectedKeys = state.selectedKeys
            }
            childList.add(renderTreeNodes(treeData))
        }
    }
}

fun RBuilder.basicControlledDemo() = child(BasicControlledDemo::class) {}

fun RBuilder.basicControlled() {
    styledDiv {
        css { +TreeStyles.basicControlled }
        basicControlledDemo()
    }
}
