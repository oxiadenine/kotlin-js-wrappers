package samples.avatar

import antd.*
import antd.avatar.*
import antd.button.button
import kotlinext.js.*
import kotlinx.css.*
import kotlinx.css.properties.Transforms
import kotlinx.css.properties.scale
import kotlinx.css.properties.transform
import react.*
import react.dom.*
import styled.*

external interface ToggleDebugAppState : RState {
    var hide: Boolean
    var size: String
    var scale: Number
}

class ToggleDebugApp : RComponent<RProps, ToggleDebugAppState>() {
    private val toggle: MouseEventHandler<Any> = {
        setState {
            hide = !state.hide
        }
    }

    private val toggleSize: MouseEventHandler<Any> = {
        val sizes = arrayOf("small", "default", "large")
        var current = sizes.indexOf(state.size) + 1

        if (current > 2) {
            current = 0
        }

        setState {
            size = sizes[current]
        }
    }

    private val changeScale: MouseEventHandler<Any> = {
        setState {
            scale = if (state.scale == 1) 2 else 1
        }
    }

    override fun ToggleDebugAppState.init() {
        hide = true
        size = "large"
        scale = 1
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs.onClick = toggle
                +"Toggle Avatar visibility"
            }
            button {
                attrs.onClick = toggleSize
                +"Toggle Avatar size"
            }
            button {
                attrs.onClick = changeScale
                +"Toggle Avatar scale"
            }
            br {}
            br {}
            styledDiv {
                css {
                    textAlign = TextAlign.center
                    transform {
                        Transforms().scale(state.scale)
                    }
                    marginTop = 24.px
                }
                avatar {
                    attrs {
                        size = state.size
                        style = js {
                            background = "#7265e6"
                            display = if (state.hide) "none" else ""
                        }
                    }
                    +"Avatar"
                }
                avatar {
                    attrs {
                        size = state.size
                        src = "invalid"
                        style = js {
                            background = "#00a2ae"
                            display = if (state.hide) "none" else ""
                        }
                    }
                    +"Invalid"
                }
                styledDiv {
                    css { display = if (state.hide) Display.none else Display.inherit }
                    avatar {
                        attrs {
                            size = state.size
                            style = js { background = "#7265e6" }
                        }
                        +"Avatar"
                    }
                    avatar {
                        attrs {
                            size = state.size
                            src = "invalid"
                            style = js { background = "#00a2ae" }
                        }
                        +"Invalid"
                    }
                }
            }
        }
    }
}

fun RBuilder.toggleDebugApp() = child(ToggleDebugApp::class) {}

fun RBuilder.toggleDebug() {
    styledDiv {
        css { +AvatarStyles.toggleDebug }
        toggleDebugApp()
    }
}
