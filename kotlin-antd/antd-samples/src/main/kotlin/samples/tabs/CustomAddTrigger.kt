package samples.tabs

import antd.button.button
import antd.tabs.*
import kotlinext.js.*
import react.*
import react.dom.div
import react.dom.jsStyle
import styled.*

interface CustomAddTriggerDemoState : RState {
    var activeKey: String
    var panes: Array<Any>
}

class CustomAddTriggerDemo : RComponent<RProps, CustomAddTriggerDemoState>() {
    private var newTabIndex = 0

    private val handleChange: (String) -> Unit = { key ->
        setState {
            activeKey = key
        }
    }

    private val handleEdit: (Any, String) -> Unit = { targetKey, action ->
        when (action) {
            "remove" -> remove(targetKey.unsafeCast<String>())
        }
    }

    private val add: () -> Unit = {
        val newKey = "newTab${newTabIndex++}"

        val tabPanes = state.panes.plus(js {
            title = "New Tab"
            content = "New Tab Pane"
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


    override fun CustomAddTriggerDemoState.init() {
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
            }
        ).unsafeCast<Array<Any>>()
        activeKey = panes[0].asDynamic().key.unsafeCast<String>()
    }

    override fun RBuilder.render() {
        div {
            div {
                attrs.jsStyle = js { marginBottom = 16 }
                button {
                    attrs.onClick = { add() }
                    +"ADD"
                }
            }
            tabs {
                attrs {
                    hideAdd = true
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
}

fun RBuilder.customAddTriggerDemo() = child(CustomAddTriggerDemo::class) {}

fun RBuilder.customAddTrigger() {
    styledDiv {
        css { +TabsStyles.customAddTrigger }
        customAddTriggerDemo()
    }
}
