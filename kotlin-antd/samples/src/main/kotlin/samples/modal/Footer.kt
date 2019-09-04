package samples.modal

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.modal.modal
import kotlinext.js.jsObject
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*
import kotlin.browser.window

interface FooterAppState : RState {
    var loading: Boolean
    var visible: Boolean
}

class FooterApp : RComponent<RProps, FooterAppState>() {
    private val showModal: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val handleOk: (e: MouseEvent<HTMLElement>) -> Unit = {
        setState {
            loading = true
        }

        window.setTimeout({
            setState {
                loading = false
                visible = false
            }
        }, 3000)
    }

    private val handleCancel: (e: MouseEvent<HTMLElement>) -> Unit = {
        setState {
            visible = false
        }
    }

    override fun FooterAppState.init() {
        loading = false
        visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = showModal
                }
                +"Open Modal with customized footer"
            }
            modal {
                attrs {
                    visible = state.visible
                    title = "Title"
                    onOk = handleOk
                    onCancel = handleCancel
                    footer = buildElements {
                        button {
                            attrs {
                                key = "back"
                                onClick = { handleCancel(jsObject {}) }
                            }
                            +"Return"
                        }
                        button {
                            attrs {
                                key = "submit"
                                type = "primary"
                                loading = state.loading
                                onClick = { handleOk(jsObject {}) }
                            }
                            +"Submit"
                        }
                    }.unsafeCast<ReactElement>()
                }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
            }
        }
    }
}

fun RBuilder.footerApp() = child(FooterApp::class) {}

fun RBuilder.footer() {
    div("modal-container") {
        attrs.id = "modal-footer"
        footerApp()
    }
}
