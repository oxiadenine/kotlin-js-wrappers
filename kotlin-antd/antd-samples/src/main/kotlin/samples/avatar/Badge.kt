package samples.avatar

import antd.avatar.avatar
import antd.badge.badge
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.badge() {
    div("avatar-container") {
        attrs.id = "avatar-badge"
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
