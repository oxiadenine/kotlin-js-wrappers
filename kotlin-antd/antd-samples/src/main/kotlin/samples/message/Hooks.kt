package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.MessageInstance
import antd.message.message
import kotlinext.js.js
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

private val context = createContext(js { name = "Default" })

private val demo = fc<RProps> {
    val useMessage = message.useMessage()

    val messageApi = useMessage[0].unsafeCast<MessageInstance>()
    val contextHolder = useMessage[1].unsafeCast<ReactElement>()

    val info: MouseEventHandler<Any> = {
        messageApi.open(jsObject {
            type = "info"
            content = buildElement {
                context.Consumer { name ->
                    +"Hello, $name"
                }
            }
            duration = 1
        })
    }

    context.Provider {
        attrs.value = "Ant Design"
        childList += contextHolder
        button {
            attrs {
                type = "primary"
                onClick = info
            }
            +"Display normal message"
        }

    }
}

private fun RBuilder.demo() = child(demo)

fun RBuilder.hooks() {
    styledDiv {
        css { +MessageStyles.hooks }
        demo()
    }
}
