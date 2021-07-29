package samples.avatar

import antd.avatar.avatar
import antd.icon.userOutlined
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.type() {
    styledDiv {
        css { +AvatarStyles.type }
        div {
            avatar {
                attrs.icon = buildElement {
                    userOutlined {}
                }
            }
            avatar { +"U" }
            avatar { +"USER" }
            avatar {
                attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            }
            avatar {
                attrs.style = js {
                    color = "#f56a00"
                    backgroundColor = "#fde3cf"
                }
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
    }
}
