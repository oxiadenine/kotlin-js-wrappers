package samples.card

import antd.avatar.*
import antd.card.*
import antd.icon.*
import antd.skeleton.*
import antd.switch.*
import kotlinext.js.*
import org.w3c.dom.events.*
import react.*
import react.dom.*
import styled.*

interface LoadingAppState : RState {
    var loading: Boolean
}

class LoadingApp : RComponent<RProps, LoadingAppState>() {
    private val handleChange = fun(checked: Boolean, _: MouseEvent) {
        setState {
            loading = !checked
        }
    }

    override fun LoadingAppState.init() {
        loading = true
    }

    override fun RBuilder.render() {
        div {
            switch {
                attrs {
                    checked = !state.loading
                    onChange = handleChange
                }
            }
            card {
                attrs {
                    style = js {
                        width = 300
                        marginTop = 16
                    }
                    loading = state.loading
                }
                cardMeta {
                    attrs {
                        avatar = buildElement {
                            avatar {
                                attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
                            }
                        }
                        title = "Card title"
                        description = "This is the description"
                    }
                }
            }
            card {
                attrs {
                    style = js {
                        width = 300
                        marginTop = 16
                    }
                    actions = arrayOf(
                        buildElement {
                            settingOutlined {}
                        },
                        buildElement {
                            editOutlined {}
                        },
                        buildElement {
                            ellipsisOutlined {}
                        }
                    )
                }
                skeleton {
                    attrs {
                        loading = state.loading
                        avatar = true
                        active = true
                    }
                    cardMeta {
                        attrs {
                            avatar = buildElement {
                                avatar {
                                    attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
                                }
                            }
                            title = "Card title"
                            description = "This is the description"
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.loadingApp() = child(LoadingApp::class) {}

fun RBuilder.loading() {
    styledDiv {
        css { +CardStyles.loading }
        loadingApp()
    }
}
