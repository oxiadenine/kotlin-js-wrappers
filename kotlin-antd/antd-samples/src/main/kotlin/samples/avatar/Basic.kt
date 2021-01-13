package samples.avatar

import antd.avatar.*
import antd.icon.userOutlined
import react.*
import react.dom.*
import styled.*

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
