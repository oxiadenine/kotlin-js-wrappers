package samples.modal

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.modal.modal
import kotlinext.js.jsObject
import kotlinx.browser.window
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

external interface FooterAppState : State {
    var loading: Boolean
    var visible: Boolean
}

class FooterApp : RComponent<Props, FooterAppState>() {
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
                    footer = buildElement {
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
    styledDiv {
        css { +ModalStyles.footer }
        footerApp()
    }
}
