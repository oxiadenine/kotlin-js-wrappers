package samples.tree

import antd.tree.*
import kotlinext.js.*
import kotlinx.browser.*
import react.*
import styled.*
import kotlin.js.Promise

interface DynamicDemoState : RState {
    var treeData: Array<TreeNodeNormal>
}

class DynamicDemo : RComponent<RProps, DynamicDemoState>() {
    private val onLoadData = fun(treeNode: TreeNodeComponent): Promise<Unit> {
        return Promise { resolve, _ ->
            if (treeNode.props.children != null) {
                resolve(Unit)

                return@Promise
            }

            window.setTimeout({
                treeNode.props.asDynamic().dataRef.children = arrayOf<TreeNodeNormal>(
                    jsObject {
                        title = "Child Node"
                        key = "${treeNode.props.eventKey}-0"
                    },
                    jsObject {
                        title = "Child Node"
                        key = "${treeNode.props.eventKey}-1"
                    }
                )

                setState {
                    treeData = state.treeData
                }

                resolve(Unit)
            }, 1000)
        }
    }

    private fun renderTreeNodes(data: Array<TreeNodeNormal>): Array<ReactElement> {
        return data.map { item ->
            if (item.children != null) {
                return@map buildElement {
                    treeNode {
                        attrs {
                            title = item.title
                            key = item.key
                        }
                        attrs.asDynamic()["dataRef"] = item
                        childList.add(renderTreeNodes(item.children!!))
                    }
                }
            }

            return@map buildElement {
                treeNode {
                    Object.assign(attrs, item)
                    attrs.asDynamic()["dataRef"] = item
                }
            }
        }.toTypedArray()
    }

    override fun DynamicDemoState.init() {
        treeData = arrayOf(
            jsObject {
                title = "Expand to load"
                key = "0"
            },
            jsObject {
                title = "Expand to load"
                key = "1"
            },
            jsObject {
                title = "Tree Node"
                key = "2"
                isLeaf = true
            }
        )
    }

    override fun RBuilder.render() {
        tree {
            attrs.loadData = onLoadData
            childList.add(renderTreeNodes(state.treeData))
        }
    }
}

fun RBuilder.dynamicDemo() = child(DynamicDemo::class) {}

fun RBuilder.dynamic() {
    styledDiv {
        css { +TreeStyles.dynamic }
        dynamicDemo()
    }
}
