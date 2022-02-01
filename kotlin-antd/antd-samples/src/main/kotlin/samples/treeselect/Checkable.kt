package samples.treeselect

import antd.treeselect.DataNode
import antd.treeselect.TreeSelectComponent
import antd.treeselect.treeSelect
import kotlinext.js.js
import kotlinext.js.jso
import react.*
import styled.css
import styled.styledDiv

private val data: Array<DataNode> = arrayOf(
    jso {
        title = "Node1"
        value = "0-0"
        key = "0-0"
        children = arrayOf<DataNode>(
            jso {
                title = "Child Node1"
                value = "0-0-0"
                key = "0-0-0"
            }
        )
    },
    jso {
        title = "Node2"
        value = "0-1"
        key = "0-1"
        children = arrayOf<DataNode>(
            jso {
                title = "Child Node3"
                value = "0-1-0"
                key = "0-1-0"
            },
            jso {
                title = "Child Node4"
                value = "0-1-1"
                key = "0-1-1"
            },
            jso {
                title = "Child Node5"
                value = "0-1-2"
                key = "0-1-2"
            }
        )
    }
)

external interface CheckableDemoState : State {
    var value: Array<String>?
}

class CheckableDemo : RComponent<Props, CheckableDemoState>() {
    private val handleChange = fun(newValue: Array<String>, _: Any, _: Any) {
        console.log(newValue)

        setState {
            value = newValue
        }
    }

    override fun CheckableDemoState.init() {
        value = arrayOf("0-0-0")
    }

    override fun RBuilder.render() {
        treeSelect<Array<String>, TreeSelectComponent<Array<String>>> {
            attrs {
                treeData = data
                value = state.value
                onChange = handleChange
                treeCheckable = true
                showCheckedStrategy = TreeSelectComponent.SHOW_PARENT
                searchPlaceholder = "Please select"
                style = js { width = 300 }
            }
        }
    }
}

fun RBuilder.checkableDemo() = child(CheckableDemo::class) {}

fun RBuilder.checkable() {
    styledDiv {
        css { +TreeSelectStyles.checkable }
        checkableDemo()
    }
}
