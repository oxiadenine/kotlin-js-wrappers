package samples.popover

import antd.button.button
import antd.popover.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val text = buildElement {
    span { +"Title" }
}

private val contentElement = buildElement {
    div {
        p { +"Content" }
        p { +"Content" }
    }
}

private val buttonWidth = 70

fun RBuilder.placement() {
    styledDiv {
        css { +PopoverStyles.placement }
        div("demo") {
            div {
                attrs.jsStyle = js {
                    marginLeft = buttonWidth
                    whiteSpace = "nowrap"
                }
                popover {
                    attrs {
                        placement = "topLeft"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"TL" }
                }
                popover {
                    attrs {
                        placement = "top"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"Top" }
                }
                popover {
                    attrs {
                        placement = "topRight"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"TR" }
                }
            }
            div {
                attrs.jsStyle = js {
                    width = buttonWidth
                    float = "left"
                }
                popover {
                    attrs {
                        placement = "leftTop"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"LT" }
                }
                popover {
                    attrs {
                        placement = "left"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"Left" }
                }
                popover {
                    attrs {
                        placement = "leftBottom"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"LB" }
                }
            }
            div {
                attrs.jsStyle = js {
                    width = buttonWidth
                    marginLeft = (buttonWidth * 4) + 24
                }
                popover {
                    attrs {
                        placement = "rightTop"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"RT" }
                }
                popover {
                    attrs {
                        placement = "right"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"Right" }
                }
                popover {
                    attrs {
                        placement = "rightBottom"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"RB" }
                }
            }
            div {
                attrs.jsStyle = js {
                    marginLeft = buttonWidth
                    clear = "both"
                    whiteSpace = "nowrap"
                }
                popover {
                    attrs {
                        placement = "bottomLeft"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"BL" }
                }
                popover {
                    attrs {
                        placement = "bottom"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"Bottom" }
                }
                popover {
                    attrs {
                        placement = "bottomRight"
                        title = text
                        content = contentElement
                        trigger = "click"
                    }
                    button { +"BR" }
                }
            }
        }
    }
}
