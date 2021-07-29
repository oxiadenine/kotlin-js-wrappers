package samples.avatar

import antd.avatar.avatar
import antd.avatar.avatarGroup
import antd.divider.divider
import antd.icon.antDesignOutlined
import antd.icon.userOutlined
import antd.tooltip.tooltip
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

class GroupDemo : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        avatarGroup {
            avatar {
                attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            }
            avatar {
                attrs.style = js { backgroundColor = "#f56a00" }
                +"K"
            }
            tooltip {
                attrs {
                    title = "Ant User"
                    placement = "top"
                }
                avatar {
                    attrs {
                        style = js { backgroundColor = "#87d068" }
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
            }
            avatar {
                attrs {
                    style = js { backgroundColor = "#1890ff" }
                    icon = buildElement {
                        antDesignOutlined {}
                    }
                }
            }
        }
        divider {}
        avatarGroup {
            attrs {
                maxCount = 2
                maxStyle = js {
                    color = "#f56a00"
                    backgroundColor = "#fde3cf"
                }
            }
            avatar {
                attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            }
            avatar {
                attrs.style = js { backgroundColor = "#f56a00" }
                +"K"
            }
            tooltip {
                attrs {
                    title = "Ant User"
                    placement = "top"
                }
                avatar {
                    attrs {
                        style = js { backgroundColor = "#87d068" }
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
            }
            avatar {
                attrs {
                    style = js { backgroundColor = "#1890ff" }
                    icon = buildElement {
                        antDesignOutlined {}
                    }
                }
            }
        }
        divider {}
        avatarGroup {
            attrs {
                maxCount = 2
                size = "large"
                maxStyle = js {
                    color = "#f56a00"
                    backgroundColor = "#fde3cf"
                }
            }
            avatar {
                attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            }
            avatar {
                attrs.style = js { backgroundColor = "#f56a00" }
                +"K"
            }
            tooltip {
                attrs {
                    title = "Ant User"
                    placement = "top"
                }
                avatar {
                    attrs {
                        style = js { backgroundColor = "#87d068" }
                        icon = buildElement {
                            userOutlined {}
                        }
                    }
                }
            }
            avatar {
                attrs {
                    style = js { backgroundColor = "#1890ff" }
                    icon = buildElement {
                        antDesignOutlined {}
                    }
                }
            }
        }
    }
}

fun RBuilder.groupDemo() = child(GroupDemo::class) {}

fun RBuilder.group() {
    styledDiv {
        css { +AvatarStyles.group }
        groupDemo()
    }
}
