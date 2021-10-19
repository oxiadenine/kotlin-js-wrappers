package samples.treeselect

import antd.treeselect.DataNode
import antd.treeselect.TreeSelectComponent
import antd.treeselect.treeSelect
import kotlinext.js.js
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

private val data: Array<DataNode> = arrayOf(
    jsObject {
        title = "Node1"
        value = "0-0"
        key = "0-0"
        children = arrayOf<DataNode>(
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

external interface TreeDataDemoState : State {
    var value: String?
}

class TreeDataDemo : RComponent<Props, TreeDataDemoState>() {
    private val handleChange = fun(newValue: String, _: Any, _: Any) {
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
                treeData = data
                placeholder = "Please select"
                treeDefaultExpandAll = true
                onChange = handleChange
            }
        }
    }
}

fun RBuilder.treeDataDemo() = child(TreeDataDemo::class) {}

fun RBuilder.treeData() {
    styledDiv {
        css { +TreeSelectStyles.treeData }
        treeDataDemo()
    }
}
