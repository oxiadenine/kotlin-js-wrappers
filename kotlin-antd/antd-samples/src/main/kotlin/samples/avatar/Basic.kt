package samples.avatar

import antd.avatar.avatar
import antd.icon.userOutlined
import react.RBuilder
import react.buildElement
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +AvatarStyles.basic }
        div {
            div {
                avatar {
                    attrs {
                        size = 64
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
                avatar {
                    attrs {
                        size = "large"
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
                avatar {
                    attrs.icon = buildElement {
                        userOutlined {}
                    }
                }
                avatar {
                    attrs {
                        size = "small"
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
            }
            div {
                avatar {
                    attrs {
                        shape = "square"
                        size = 64
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
                avatar {
                    attrs {
                        shape = "square"
                        size = "large"
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
                avatar {
                    attrs {
                        shape = "square"
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
                avatar {
                    attrs {
                        shape = "square"
                        size = "small"
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
            }
        }
    }
}
