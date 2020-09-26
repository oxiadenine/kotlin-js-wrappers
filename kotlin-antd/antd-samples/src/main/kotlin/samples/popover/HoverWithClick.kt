package samples.popover

import antd.button.button
import antd.popover.popover
import kotlinext.js.js
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

interface HoverWithClickAppState : RState {
    var clicked: Boolean
    var hovered: Boolean
}

class HoverWithClickApp : RComponent<RProps, HoverWithClickAppState>() {
    private val hide = fun (_: Event) {
        setState {
            clicked = false
            hovered = false
        }
    }

    private val handleHoverChange = fun (visible: Boolean) {
        setState {
            hovered = visible
            clicked = false
        }
    }

    private val handleClickChange = fun (visible: Boolean) {
        setState {
            clicked =visible
            hovered = false
        }
    }

    override fun HoverWithClickAppState.init() {
        clicked = false
        hovered = false
    }

    override fun RBuilder.render() {
        val hoverContent = buildElement {
            div { +"This is hover content." }
        }

        val clickContent = buildElement {
            div { +"This is click content." }
        }

        popover {
            attrs {
                style = js { width = 500 }
                content = hoverContent
                title = "Hover title"
                trigger = "hover"
                visible = state.hovered
                onVisibleChange = handleHoverChange
            }
            popover {
                attrs {
                    content = buildElement {
                        div {
                            childList.add(clickContent.unsafeCast<Any>())
                            a {
                                attrs.onClickFunction = hide
                                +"Close"
                            }
                        }
                    }
                    title = "Click title"
                    trigger = "click"
                    visible = state.clicked
                    onVisibleChange = handleClickChange
                }
                button { +"Hover and click / 悬停并单击" }
            }
        }
    }
}

fun RBuilder.hoverWithClickApp() = child(HoverWithClickApp::class) {}

fun RBuilder.hoverWithClick() {
    styledDiv {
        css { +PopoverStyles.hoverWithClick }
        hoverWithClickApp()
    }
}
