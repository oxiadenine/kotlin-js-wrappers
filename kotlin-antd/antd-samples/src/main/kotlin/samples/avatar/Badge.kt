package samples.avatar

import antd.avatar.*
import antd.badge.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.badge() {
    styledDiv {
        css { +AvatarStyles.badge }
        div {
            span {
                attrs.jsStyle = js { marginRight = 24 }
                badge {
                    attrs.count = 1
                    avatar {
                        attrs {
                            shape = "square"
                            icon = "user"
                        }
                    }
                }
            }
            span {
                badge {
                    attrs.dot = true
                    avatar {
                        attrs {
                            shape = "square"
                            icon = "user"
                        }
                    }
                }
            }
        }
    }
}
