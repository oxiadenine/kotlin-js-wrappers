package samples.drawer

import antd.MouseEventHandler
import antd.button.button
import antd.drawer.EventType
import antd.drawer.drawer
import antd.radio.RadioChangeEvent
import antd.radio.radio
import antd.radio.radioGroup
import kotlinext.js.js
import react.*
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

external interface PlacementAppState : State {
    var visible: Boolean
    var placement: String
}

class PlacementApp : RComponent<Props, PlacementAppState>() {
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

    private val handleChange: (RadioChangeEvent) -> Unit = { e ->
        setState {
            placement = e.target.value as String
        }
    }

    override fun PlacementAppState.init() {
        visible = false
        placement = "left"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    style = js { marginRight = 8 }
                    defaultValue = state.placement
                    onChange = handleChange
                }
                radio {
                    attrs.value = "top"
                    +"top"
                }
                radio {
                    attrs.value = "right"
                    +"right"
                }
                radio {
                    attrs.value = "bottom"
                    +"bottom"
                }
                radio {
                    attrs.value = "left"
                    +"left"
                }
            }
            button {
                attrs {
                    type = "primary"
                    onClick = showDrawer
                }
                +"Open"
            }
            drawer {
                attrs {
                    title = "Basic Drawer"
                    placement = state.placement
                    closable = false
                    onClose = handleClose
                    visible = state.visible
                }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
            }
        }
    }
}

fun RBuilder.placementApp() = child(PlacementApp::class) {}

fun RBuilder.placement() {
    styledDiv {
        css { +DrawerStyles.placement }
        placementApp()
    }
}
