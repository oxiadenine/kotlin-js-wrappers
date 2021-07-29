package samples.avatar

import antd.avatar.avatar
import antd.badge.badge
import antd.icon.userOutlined
import kotlinx.css.marginRight
import kotlinx.css.px
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.span
import styled.css
import styled.styledDiv
import styled.styledSpan

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
