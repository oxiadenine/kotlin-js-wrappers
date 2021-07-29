package samples.button

import antd.button.button
import antd.icon.searchOutlined
import react.RBuilder
import react.buildElement
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.icon() {
    styledDiv {
        css { +ButtonStyles.icon }
        div {
            button {
                attrs {
                    type = "primary"
                    shape = "circle"
                    icon = buildElement {
                        searchOutlined {}
                    }
                }
            }
            button {
                attrs {
                    type = "primary"
                    icon = buildElement {
                        searchOutlined {}
                    }
                }
                +"Search"
            }
            button {
                attrs {
                    shape = "circle"
                    icon = buildElement {
                        searchOutlined {}
                    }
                }
            }
            button {
                attrs.icon = buildElement {
                    searchOutlined {}
                }
                +"Search"
            }
            br {}
            button {
                attrs {
                    shape = "circle"
                    icon = buildElement {
                        searchOutlined {}
                    }
                }
            }
            button {
                attrs.icon = buildElement {
                    searchOutlined {}
                }
                +"Search"
            }
            button {
                attrs {
                    type = "dashed"
                    shape = "circle"
                    icon = buildElement {
                        searchOutlined {}
                    }
                }
            }
            button {
                attrs {
                    type = "dashed"
                    icon = buildElement {
                        searchOutlined {}
                    }
                }
                +"Search"
            }
        }
    }
}
