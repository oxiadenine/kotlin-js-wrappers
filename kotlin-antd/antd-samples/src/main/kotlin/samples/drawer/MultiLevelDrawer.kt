package samples.drawer

import antd.MouseEventHandler
import antd.button.button
import antd.drawer.EventType
import antd.drawer.drawer
import kotlinext.js.js
import react.*
import react.dom.div
import react.dom.jsStyle
import styled.css
import styled.styledDiv

interface MultiLevelDrawerAppState : RState {
    var visible: Boolean
    var childrenDrawer: Boolean
}

class MultiLevelDrawerApp : RComponent<RProps, MultiLevelDrawerAppState>() {
    private val showDrawer: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val handleClose: (e: EventType) -> Unit = {
        setState {
            visible = false
        }
    }

    private val showChildrenDrawer: MouseEventHandler<Any> = {
        setState {
            childrenDrawer = true
        }
    }

    private val handleChildrenDrawerClose: (e: EventType) -> Unit = {
        setState {
            childrenDrawer = false
        }
    }

    override fun MultiLevelDrawerAppState.init() {
        visible = false
        childrenDrawer = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = showDrawer
                }
                +"Open drawer"
            }
            drawer {
                attrs {
                    title = "Multi-level Drawer"
                    width = 520
                    closable = false
                    onClose = handleClose
                    visible = state.visible
                }
                button {
                    attrs {
                        type = "primary"
                        onClick = showChildrenDrawer
                    }
                    +"Two-level drawer"
                }
                drawer {
                    attrs {
                        title = "Two-level Drawer"
                        width = 320
                        closable = false
                        onClose = handleChildrenDrawerClose
                        visible = state.childrenDrawer
                    }
                    +"This is two-level drawer"
                }
                div {
                    attrs.jsStyle = js {
                        position = "absolute"
                        bottom = 0
                        width = "100%"
                        borderTop = "1px solid #e8e8e8"
                        padding = "10px 16px"
                        textAlign = "right"
                        left = 0
                        background = "#fff"
                        borderRadius = "0 0 4px 4px"
                    }
                    button {
                        attrs {
                            style = js { marginRight = 8 }
                            onClick = handleClose
                        }
                        +"Cancel"
                    }
                    button {
                        attrs {
                            onClick = handleClose
                            type = "primary"
                        }
                        +"Submit"
                    }
                }
            }
        }
    }
}

fun RBuilder.multiLevelDrawerApp() = child(MultiLevelDrawerApp::class) {}

fun RBuilder.multiLevelDrawer() {
    styledDiv {
        css { +DrawerStyles.multiLevelDrawer }
        multiLevelDrawerApp()
    }
}
