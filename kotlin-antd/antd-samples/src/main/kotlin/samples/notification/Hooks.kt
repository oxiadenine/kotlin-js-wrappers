package samples.notification

import antd.button.button
import antd.divider.divider
import antd.icon.radiusBottomleftOutlined
import antd.icon.radiusBottomrightOutlined
import antd.icon.radiusUpleftOutlined
import antd.icon.radiusUprightOutlined
import antd.notification.NotificationInstance
import antd.notification.NotificationPlacement
import antd.notification.notification
import kotlinext.js.js
import kotlinext.js.jsObject
import react.RBuilder
import react.RProps
import react.ReactElement
import react.buildElement
import react.child
import react.createContext
import react.dom.div
import react.functionalComponent
import styled.css
import styled.styledDiv

private val context = createContext(js { name = "Default" })

private val demo = functionalComponent<RProps> {
    val useNotification = notification.useNotification()

    val api = useNotification[0].unsafeCast<NotificationInstance>()
    val contextHolder = useNotification[1].unsafeCast<ReactElement>()

    val openNotification = { notPlacement: NotificationPlacement ->
        api.info(jsObject {
            message = "Notification $notPlacement"
            description = buildElement {
                context.Consumer { name ->
                    +"Hello, $name"
                }
            }
            placement = notPlacement
        })
    }

    context.Provider {
        attrs.value = "Ant Design"
        childList += contextHolder
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = {
                        openNotification("topLeft")
                    }
                }
                radiusUpleftOutlined {}
                +"topLeft"
            }
            button {
                attrs {
                    type = "primary"
                    onClick = {
                        openNotification("topRight")
                    }
                }
                radiusUprightOutlined {}
                +"topRight"
            }
        }
        divider {}
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = {
                        openNotification("bottomLeft")
                    }
                }
                radiusBottomleftOutlined {}
                +"bottomLeft"
            }
            button {
                attrs {
                    type = "primary"
                    onClick = {
                        openNotification("bottomRight")
                    }
                }
                radiusBottomrightOutlined {}
                +"bottomRight"
            }
        }
    }
}

private fun RBuilder.demo() = child(demo)

fun RBuilder.hooks() {
    styledDiv {
        css { +NotificationStyles.hooks }
        demo()
    }
}
