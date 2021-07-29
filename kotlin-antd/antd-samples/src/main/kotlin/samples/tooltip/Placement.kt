package samples.tooltip

import antd.button.button
import antd.tooltip.tooltip
import kotlinx.css.*
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.span
import styled.css
import styled.styledDiv

private val text = buildElement {
    span { +"prompt text" }
}

private val buttonWidth = 70.px

fun RBuilder.placement() {
    styledDiv {
        css { +TooltipStyles.placement }
        div("demo") {
            styledDiv {
                css {
                    marginLeft = buttonWidth
                    whiteSpace = WhiteSpace.nowrap
                }
                tooltip {
                    attrs {
                        placement = "topLeft"
                        title = text
                    }
                    button { +"TL" }
                }
                tooltip {
                    attrs {
                        placement = "top"
                        title = text
                    }
                    button { +"Top" }
                }
                tooltip {
                    attrs {
                        placement = "topRight"
                        title = text
                    }
                    button { +"TR" }
                }
            }
            styledDiv {
                css {
                    width = buttonWidth
                    float = Float.left
                }
                tooltip {
                    attrs {
                        placement = "leftTop"
                        title = text
                    }
                    button { +"LT" }
                }
                tooltip {
                    attrs {
                        placement = "left"
                        title = text
                    }
                    button { +"Left" }
                }
                tooltip {
                    attrs {
                        placement = "leftBottom"
                        title = text
                    }
                    button { +"LB" }
                }
            }
            styledDiv {
                css {
                    width = buttonWidth
                    marginLeft = (buttonWidth * 4) + 24.px
                }
                tooltip {
                    attrs {
                        placement = "rightTop"
                        title = text
                    }
                    button { +"RT" }
                }
                tooltip {
                    attrs {
                        placement = "right"
                        title = text
                    }
                    button { +"Right" }
                }
                tooltip {
                    attrs {
                        placement = "rightBottom"
                        title = text
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
                tooltip {
                    attrs {
                        placement = "bottomLeft"
                        title = text
                    }
                    button { +"BL" }
                }
                tooltip {
                    attrs {
                        placement = "bottom"
                        title = text
                    }
                    button { +"Bottom" }
                }
                tooltip {
                    attrs {
                        placement = "bottomRight"
                        title = text
                    }
                    button { +"BR" }
                }
            }
        }
    }
}
