package samples.notification

import antd.*
import antd.button.button
import antd.notification.*
import antd.select.*
import antd.select.option
import kotlinext.js.*
import react.RBuilder
import react.dom.div
import styled.*

private val options = arrayOf("topLeft", "topRight", "bottomLeft", "bottomRight")

private val openNotification: MouseEventHandler<Any> = {
    notification.open(jsObject {
        message = "Notification Title"
        description = "This is the content of the notification. This is the content of the notification. This is the content of the notification."
    })
}

fun RBuilder.placement() {
    styledDiv {
        css { +NotificationStyles.placement }
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "topRight"
                    style = js {
                        width = 120
                        marginRight = 10
                    }
                    onChange = { value, _ ->
                        notification.config(jsObject {
                            placement = value
                        })
                    }
                }
                options.map {
                    option {
                        attrs {
                            key = it
                            value = it
                        }
                        +it
                    }
                }.toTypedArray()
            }
        }
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
