package samples.tabs

import antd.tabs.tabPane
import antd.tabs.tabs
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

external interface EditableCardDemoState : State {
    var activeKey: String
    var panes: Array<Any>
}

class EditableCardDemo : RComponent<Props, EditableCardDemoState>() {
    private var newTabIndex = 0

    private val handleChange: (String) -> Unit = { key ->
        setState {
            activeKey = key
        }
    }

    private val handleEdit: (Any, String) -> Unit = { targetKey, action ->
        when (action) {
            "add" -> add()
            "remove" -> remove(targetKey.unsafeCast<String>())
        }
    }

    private val add: () -> Unit = {
        val newKey = "newTab${newTabIndex++}"

        val tabPanes = state.panes.plus(js {
            title = "New Tab"
            content = "Content of new Tab"
            key = newKey
        }.unsafeCast<Any>())

        setState {
            panes = tabPanes
            activeKey = newKey
        }
    }

    private val remove: (String) -> Unit = { targetKey ->
        var key = state.activeKey
        var lastIndex = 0

        state.panes.forEachIndexed { i, pane ->
            if (pane.asDynamic().key.unsafeCast<String>() == targetKey) {
                lastIndex = i + 1
            }
        }

        val tabPanes = state.panes.filter { pane ->
            pane.asDynamic().key.unsafeCast<String>() != targetKey
        }.toTypedArray()

        if (tabPanes.isNotEmpty() && key == targetKey) {
            key = if (lastIndex == 0) {
                tabPanes[lastIndex].asDynamic().key.unsafeCast<String>()
            } else {
                tabPanes[0].asDynamic().key.unsafeCast<String>()
            }
        }

        setState {
            panes = tabPanes
            activeKey = key
        }
    }

    override fun EditableCardDemoState.init() {
        panes = arrayOf(
            js {
                title = "Tab 1"
                content = "Content of Tab 1"
                key = "1"
            },
            js {
                title = "Tab 2"
                content = "Content of Tab 2"
                key = "2"
            },
            js {
                title = "Tab 3"
                content = "Content of Tab 3"
                key = "3"
                closable = false
            }
        ).unsafeCast<Array<Any>>()
        activeKey = panes[0].asDynamic().key.unsafeCast<String>()
    }

    override fun RBuilder.render() {
        tabs {
            attrs {
                onChange = handleChange
                activeKey = state.activeKey
                type = "editable-card"
                onEdit = handleEdit
            }
            state.panes.map { pane ->
                tabPane {
                    attrs {
                        tab = pane.asDynamic().title.unsafeCast<String>()
                        key = pane.asDynamic().key.unsafeCast<String>()
                        closable = pane.asDynamic().closable.unsafeCast<Boolean>()
                    }
                    +pane.asDynamic().content.unsafeCast<String>()
                }
            }.toTypedArray()
        }
    }
}

fun RBuilder.editableCardDemo() = child(EditableCardDemo::class) {}

fun RBuilder.editableCard() {
    styledDiv {
        css { +TabsStyles.editableCard }
        editableCardDemo()
    }
}
