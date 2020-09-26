package samples.popconfirm

import antd.*
import antd.button.button
import antd.message.*
import antd.popconfirm.*
import kotlinext.js.*
import kotlinx.html.*
import org.w3c.dom.*
import react.*
import react.dom.div
import react.dom.jsStyle
import styled.*

private val text = "Are you sure to delete this task?"

private val confirm: (e: MouseEvent<HTMLElement>) -> Unit = { _ ->
    message.info("Clicked on Yes.")
}

fun RBuilder.placement() {
    styledDiv {
        css { +PopconfirmStyles.placement }
        div {
            attrs.classes = setOf("demo")
            div {
                attrs.jsStyle = js {
                    marginLeft = 70
                    whiteSpace = "nowrap"
                }
                popconfirm {
                    attrs {
                        placement = "topLeft"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"TL" }
                }
                popconfirm {
                    attrs {
                        placement = "top"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"Top" }
                }
                popconfirm {
                    attrs {
                        placement = "topRight"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"TR" }
                }
            }
            div {
                attrs.jsStyle = js {
                    width = 70
                    float = "left"
                }
                popconfirm {
                    attrs {
                        placement = "leftTop"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"LT" }
                }
                popconfirm {
                    attrs {
                        placement = "left"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"Left" }
                }
                popconfirm {
                    attrs {
                        placement = "leftBottom"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"LB" }
                }
            }
            div {
                attrs.jsStyle = js {
                    width = 70
                    marginLeft = 304
                }
                popconfirm {
                    attrs {
                        placement = "rightTop"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"RT" }
                }
                popconfirm {
                    attrs {
                        placement = "right"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"Right" }
                }
                popconfirm {
                    attrs {
                        placement = "rightBottom"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"RB" }
                }
            }
            div {
                attrs.jsStyle = js {
                    marginLeft = 70
                    clear = "both"
                    whiteSpace = "nowrap"
                }
                popconfirm {
                    attrs {
                        placement = "bottomLeft"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"BL" }
                }
                popconfirm {
                    attrs {
                        placement = "bottom"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"Bottom" }
                }
                popconfirm {
                    attrs {
                        placement = "bottomRight"
                        title = text
                        onConfirm = confirm
                        okText = "Yes"
                        cancelText = "No"
                    }
                    button { +"BR" }
                }
            }
        }
    }
}
