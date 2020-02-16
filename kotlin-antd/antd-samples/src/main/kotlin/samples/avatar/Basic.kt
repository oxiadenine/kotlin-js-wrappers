package samples.avatar

import antd.avatar.avatar
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("avatar-container") {
        attrs.id = "avatar-basic"
        div {
            div {
                avatar {
                    attrs {
                        size = 64
                        icon = "user"
                    }
                }
                avatar {
                    attrs {
                        size = "large"
                        icon = "user"
                    }
                }
                avatar {
                    attrs.icon = "user"
                }
                avatar {
                    attrs {
                        size = "small"
                        icon = "user"
                    }
                }
            }
            div {
                avatar {
                    attrs {
                        shape = "square"
                        size = 64
                        icon = "user"
                    }
                }
                avatar {
                    attrs {
                        shape = "square"
                        size = "large"
                        icon = "user"
                    }
                }
                avatar {
                    attrs {
                        shape = "square"
                        icon = "user"
                    }
                }
                avatar {
                    attrs {
                        shape = "square"
                        size = "small"
                        icon = "user"
                    }
                }
            }
        }
    }
}
