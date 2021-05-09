package samples.popover

import antd.button.button
import antd.popover.*
import kotlinx.css.*
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

private val buttonWidth = 70.px

fun RBuilder.placement() {
    styledDiv {
        css { +PopoverStyles.placement }
        div("demo") {
            styledDiv {
                css {
                    marginLeft = buttonWidth
                    whiteSpace = WhiteSpace.nowrap
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
            styledDiv {
                css {
                    width = buttonWidth
                    float = Float.left
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
            styledDiv {
                css {
                    width = buttonWidth
                    marginLeft = (buttonWidth * 4) + 24.px
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
            styledDiv {
                css {
                    marginLeft = buttonWidth
                    clear = Clear.both
                    whiteSpace = WhiteSpace.nowrap
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
