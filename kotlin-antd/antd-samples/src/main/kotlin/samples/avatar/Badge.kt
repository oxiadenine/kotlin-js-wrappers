package samples.avatar

import antd.avatar.*
import antd.badge.*
import antd.icon.userOutlined
import kotlinx.css.marginRight
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

fun RBuilder.badge() {
    styledDiv {
        css { +AvatarStyles.badge }
        div {
            styledSpan {
                css { marginRight = 24.px }
                badge {
                    attrs.count = 1
                    avatar {
                        attrs {
                            shape = "square"
                            icon = buildElement {
                                userOutlined {}
                            }
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
                            icon = buildElement {
                                userOutlined {}
                            }
                        }
                    }
                }
            }
        }
    }
}
