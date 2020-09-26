package samples.tooltip

import antd.button.button
import antd.tooltip.tooltip
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val text = buildElement {
    span { +"prompt text" }
}

private val buttonWidth = 70

fun RBuilder.placement() {
    styledDiv {
        css { +TooltipStyles.placement }
        div("demo") {
            div {
                attrs.jsStyle = js {
                    marginLeft = buttonWidth
                    whiteSpace = "nowrap"
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
            div {
                attrs.jsStyle = js {
                    width = buttonWidth
                    float = "left"
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
            div {
                attrs.jsStyle = js {
                    width = buttonWidth
                    marginLeft = (buttonWidth * 4) + 24
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
            div {
                attrs.jsStyle = js {
                    marginLeft = buttonWidth
                    clear = "both"
                    whiteSpace = "nowrap"
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
