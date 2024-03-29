package samples.button

import antd.MouseEventHandler
import antd.button.button
import antd.icon.poweroffOutlined
import react.*
import react.dom.br
import react.dom.span
import styled.css
import styled.styledDiv

external interface LoadingAppState : State {
    var loading: Boolean
    var iconLoading: Boolean
}

class LoadingApp : RComponent<Props, LoadingAppState>() {
    private val enterLoading: MouseEventHandler<Any> = {
        setState {
            loading = true
        }
    }

    private val enterIconLoading: MouseEventHandler<Any> = {
        setState {
            iconLoading = true
        }
    }

    override fun LoadingAppState.init() {
        loading = false
        iconLoading = false
    }

    override fun RBuilder.render() {
        span {
            button {
                attrs {
                    type = "primary"
                    loading = true
                }
                +"Loading"
            }
            button {
                attrs {
                    type = "primary"
                    size = "small"
                    loading = true
                }
                +"Loading"
            }
            br {}
            button {
                attrs {
                    type = "primary"
                    loading = state.loading
                    onClick = enterLoading
                }
                +"Click me!"
            }
            button {
                attrs {
                    type = "primary"
                    icon = buildElement {
                        poweroffOutlined {}
                    }
                    loading = state.iconLoading
                    onClick = enterIconLoading
                }
                +"Click me!"
            }
            br {}
            button {
                attrs {
                    shape = "circle"
                    loading = true
                }
            }
            button {
                attrs {
                    type = "primary"
                    shape = "circle"
                    loading = true
                }
            }
        }
    }
}

fun RBuilder.loadingApp() = child(LoadingApp::class) {}

fun RBuilder.loading() {
    styledDiv {
        css { +ButtonStyles.loading }
        loadingApp()
    }
}
