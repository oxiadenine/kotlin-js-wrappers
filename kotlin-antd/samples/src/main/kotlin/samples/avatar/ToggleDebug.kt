package samples.avatar

import antd.MouseEventHandler
import antd.avatar.avatar
import antd.button.button
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

interface ToggleDebugAppState : RState {
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
            div {
                attrs.jsStyle = js {
                    textAlign = "center"
                    transform = "scale(${state.scale})"
                    marginTop = 24
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
                div {
                    attrs.jsStyle = js { display = if (state.hide) "none" else "" }
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
    div("avatar-container") {
        attrs.id = "avatar-toggle-debug"
        toggleDebugApp()
    }
}
