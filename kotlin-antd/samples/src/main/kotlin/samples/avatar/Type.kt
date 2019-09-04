package samples.avatar

import antd.avatar.avatar
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.type() {
    div("avatar-container") {
        attrs.id = "avatar-type"
        div {
            avatar {
                attrs.icon = "user"
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
                    icon = "user"
                }
            }
        }
    }
}
