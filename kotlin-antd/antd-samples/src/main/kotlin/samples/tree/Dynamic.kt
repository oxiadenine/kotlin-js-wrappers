package samples.tree

import antd.Key
import antd.tree.DataNode
import antd.tree.EventDataNode
import antd.tree.tree
import kotlinext.js.jsObject
import kotlinx.browser.window
import react.*
import styled.css
import styled.styledDiv
import kotlin.js.Promise

private val initTreeData = arrayOf<DataNode>(
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

private fun updateTreeData(list: Array<DataNode>, nodeKey: Key, nodeChildren: Array<DataNode>): Array<DataNode> {
    return list.map { node ->
        if (node.key == nodeKey) {
            return@map jsObject {
                title = node.title
                key = node.key
                isLeaf = node.isLeaf
                children = nodeChildren
            }
        } else if (node.children != null) {
            return@map jsObject {
                title = node.title
                key = node.key
                isLeaf = node.isLeaf
                children = updateTreeData(node.children!!, key, nodeChildren)
            }
        }
        node
    }.toTypedArray()
}

private val demo = fc<Props> {
    val (trData, setTreeData) = useState(initTreeData)

    fun onLoadData(node: EventDataNode): Promise<Unit> {
        return Promise { resolve, _ ->
            if (node.children != null) {
                resolve(Unit)
            }

            window.setTimeout({
                setTreeData(
                    updateTreeData(node.children!!, node.key, arrayOf(
                        jsObject {
                            title = "Child Node"
                            key = "${node.key}-0"
                        },
                        jsObject {
                            title = "Child Node"
                            key = "${node.key}-1"
                        })
                    )
                )

                resolve(Unit)
            }, 1000)
        }
    }

    tree {
        attrs {
            loadData = ::onLoadData
            treeData = trData
        }
    }
}

fun RBuilder.dynamicDemo() = child(demo) {}

fun RBuilder.dynamic() {
    styledDiv {
        css { +TreeStyles.dynamic }
        dynamicDemo()
    }
}
