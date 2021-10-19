package samples.drawer

import antd.MouseEventHandler
import antd.button.button
import antd.drawer.EventType
import antd.drawer.drawer
import kotlinext.js.js
import kotlinx.css.*
import kotlinx.css.properties.borderTop
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface MultiLevelDrawerAppState : State {
    var visible: Boolean
    var childrenDrawer: Boolean
}

class MultiLevelDrawerApp : RComponent<Props, MultiLevelDrawerAppState>() {
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
                styledDiv {
                    css {
                        position = Position.absolute
                        bottom = 0.px
                        width = LinearDimension("100%")
                        borderTop(1.px, BorderStyle.solid, Color("#e8e8e8"))
                        padding(10.px, 16.px)
                        textAlign = TextAlign.right
                        left = 0.px
                        background = "#fff"
                        borderRadius = LinearDimension("0px 0px 4px 4px")
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
