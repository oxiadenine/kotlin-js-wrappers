package samples.treeselect

import antd.treeselect.*
import kotlinext.js.*
import react.*
import styled.*

private val data: Array<DataNode> = arrayOf(
    jsObject {
        title = "Node1"
        value = "0-0"
        key = "0-0"
        children = arrayOf<DataNode>(
            jsObject {
                title = "Child Node1"
                value = "0-0-0"
                key = "0-0-0"
            }
        )
    },
    jsObject {
        title = "Node2"
        value = "0-1"
        key = "0-1"
        children = arrayOf<DataNode>(
            jsObject {
                title = "Child Node3"
                value = "0-1-0"
                key = "0-1-0"
            },
            jsObject {
                title = "Child Node4"
                value = "0-1-1"
                key = "0-1-1"
            },
            jsObject {
                title = "Child Node5"
                value = "0-1-2"
                key = "0-1-2"
            }
        )
    }
)

external interface CheckableDemoState : RState {
    var value: Array<String>?
}

class CheckableDemo : RComponent<RProps, CheckableDemoState>() {
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
