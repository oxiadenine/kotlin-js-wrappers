package samples.button

import antd.button.button
import antd.icon.*
import react.*
import react.dom.*
import styled.*

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
