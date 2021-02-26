package samples.tree

import antd.Key
import antd.tree.*
import kotlinext.js.*
import kotlinx.browser.*
import react.*
import styled.*
import kotlin.js.*

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

// It's just a simple demo. You can use tree map to optimize update perf.
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

private val demo = functionalComponent<RProps> {
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
