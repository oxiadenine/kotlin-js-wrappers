package samples.treeselect

import antd.treeselect.*
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

private val data: Array<TreeNodeNormal> = arrayOf(
        jsObject {
            title = "Node1"
            value = "0-0"
            key = "0-0"
            children = arrayOf(
                    jsObject {
                        title = "Child Node1"
                        value = "0-0-1"
                        key = "0-0-1"
                    },
                    jsObject {
                        title = "Child Node1"
                        value = "0-0-2"
                        key = "0-0-2"
                    }
            )
        },
        jsObject {
            title = "Node2"
            value = "0-1"
            key = "0-1"
        }
)

interface TreeDataDemoState : RState {
    var value: String?
}

class TreeDataDemo : RComponent<RProps, TreeDataDemoState>() {
    private val handleChange = fun (newValue: String, _: Any, _: Any) {
        console.log(newValue)

        setState {
            value = newValue
        }
    }

    override fun TreeDataDemoState.init() {
        value = null
    }

    override fun RBuilder.render() {
        treeSelect<String, TreeSelectComponent<String>> {
            attrs {
                style = js { width = 300 }
                value = state.value
                dropdownStyle = js {
                    maxHeight = 400
                    overflow = "auto"
                }
                treeData = data.unsafeCast<Array<TreeNode>>()
                placeholder = "Please select"
                treeDefaultExpandAll = true
                onChange = handleChange
            }
        }
    }
}

fun RBuilder.treeDataDemo() = child(TreeDataDemo::class) {}

fun RBuilder.treeData() {
    div("tree-select-container") {
        attrs.id = "tree-select-tree-data"
        treeDataDemo()
    }
}
