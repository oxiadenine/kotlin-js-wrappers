package samples.button

import antd.button.*
import antd.button.button
import antd.icon.*
import react.*
import react.dom.*
import styled.*

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
                    leftOutlined {}
                    +"Go back"
                }
                button {
                    attrs.type = "primary"
                    +"Go forward"
                    rightOutlined {}
                }
            }
            buttonGroup {
                button {
                    attrs {
                        type = "primary"
                        icon = buildElement {
                            cloudOutlined {}
                        }
                    }
                }
                button {
                    attrs {
                        type = "primary"
                        icon = buildElement {
                            cloudDownloadOutlined {}
                        }
                    }
                }
            }
        }
    }
}
