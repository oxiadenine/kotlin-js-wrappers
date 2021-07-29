package samples.popconfirm

import antd.MouseEvent
import antd.button.button
import antd.message.message
import antd.popconfirm.popconfirm
import kotlinx.css.*
import kotlinx.html.classes
import org.w3c.dom.HTMLElement
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

private val text = "Are you sure to delete this task?"

private val confirm: (e: MouseEvent<HTMLElement>?) -> Unit = { _ ->
    message.info("Clicked on Yes.")
}

fun RBuilder.placement() {
    styledDiv {
        css { +PopconfirmStyles.placement }
        div {
            attrs.classes = setOf("demo")
            styledDiv {
                css {
                    marginLeft = 70.px
                    whiteSpace = WhiteSpace.nowrap
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
            styledDiv {
                css {
                    width = 70.px
                    float = Float.left
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
            styledDiv {
                css {
                    width = 70.px
                    marginLeft = 304.px
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
            styledDiv {
                css{
                    marginLeft = 70.px
                    clear = Clear.both
                    whiteSpace = WhiteSpace.nowrap
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
