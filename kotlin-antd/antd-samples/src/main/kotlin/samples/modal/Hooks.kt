package samples.modal

import antd.button.button
import antd.modal.ModalComponent
import antd.modal.ModalFuncProps
import antd.modal.ModalStaticFunctions
import antd.space.space
import kotlinext.js.jsObject
import react.*
import react.dom.div
import styled.*

private val reachableContext = createContext<String>()
private val unreachableContext = createContext<String>()

private val config = jsObject<ModalFuncProps> {
    title = "Use Hook!"
    content = buildElement {
        reachableContext.Consumer { name ->
            +"Reachable: $name!"
        }
        unreachableContext.Consumer { name ->
            +"Unreachable: $name!"
        }
    }
}

private val app = functionalComponent<RProps> {
    val useModal = ModalComponent.useModal()

    val modal = useModal[0].unsafeCast<ModalStaticFunctions>()
    val contextHolder = useModal[1].unsafeCast<ReactElement>()

    reachableContext.Provider {
        attrs.value = "Light"
        space {
            button {
                attrs.onClick = {
                    modal.confirm(config)
                }
                +"Confirm"
            }
            button {
                attrs.onClick = {
                    modal.warning(config)
                }
                +"Warning"
            }
            button {
                attrs.onClick = {
                    modal.info(config)
                }
                +"Info"
            }
            button {
                attrs.onClick = {
                    modal.error(config)
                }
                +"Error"
            }
        }
        childList += contextHolder
        unreachableContext.Provider {
            attrs.value = "Bamboo"
        }
    }
}

private fun RBuilder.app() = child(app)

fun RBuilder.hooks() {
    styledDiv {
        css { +ModalStyles.hooks }
        app()
    }
}
