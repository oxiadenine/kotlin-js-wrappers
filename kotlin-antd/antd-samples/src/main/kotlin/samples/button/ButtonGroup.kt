package samples.button

import antd.button.button
import antd.button.buttonGroup
import antd.icon.icon
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.buttonGroup() {
    styledDiv {
        css { +ButtonStyles.buttonGroup }
        div {
            h4 { +"Basic" }
            buttonGroup {
                button { +"Cancel" }
                button { +"Ok" }
            }
            buttonGroup {
                button {
                    attrs.disabled = true
                    +"L"
                }
                button {
                    attrs.disabled = true
                    +"M"
                }
                button {
                    attrs.disabled = true
                    +"R"
                }
            }
            buttonGroup {
                button { +"L" }
                button { +"M" }
                button { +"R" }
            }
            h4 { +"With Icon" }
            buttonGroup {
                button {
                    attrs.type = "primary"
                    icon {
                        attrs.type = "left"
                    }
                    +"Go back"
                }
                button {
                    attrs.type = "primary"
                    +"Go forward"
                    icon {
                        attrs.type = "right"
                    }
                }
            }
            buttonGroup {
                button {
                    attrs {
                        type = "primary"
                        icon = "cloud"
                    }
                }
                button {
                    attrs {
                        type = "primary"
                        icon = "cloud-download"
                    }
                }
            }
        }
    }
}
