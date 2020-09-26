package samples.avatar

import antd.MouseEventHandler
import antd.avatar.avatar
import antd.button.button
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

private val userList = arrayOf("U", "Lucy", "Tom", "Edward")
private val colorList = arrayOf("#f56a00", "#7265e6", "#ffbf00", "#00a2ae")

interface AutosetState : RState {
    var user: String
    var color: String
}

class Autoset : RComponent<RProps, AutosetState>() {
    private val changeUser: MouseEventHandler<Any> = {
        val index = userList.indexOf(state.user)

        setState {
            user = if (index < userList.size - 1) userList[index + 1] else userList[0]
            color = if (index < colorList.size - 1)  colorList[index + 1] else colorList[0]
        }
    }

    override fun AutosetState.init() {
        user = userList[0]
        color = colorList[0]
    }

    override fun RBuilder.render() {
        avatar {
            attrs {
                style = js {
                    backgroundColor = state.color
                    verticalAlign = "middle"
                }
                size = "large"
            }
            +state.user
        }
        button {
            attrs {
                size = "small"
                onClick = changeUser
                style = js {
                    marginLeft = 16
                    verticalAlign = "middle"
                }
            }
            +"Change"
        }
    }
}

fun RBuilder.autoset() = child(Autoset::class) {}

fun RBuilder.dynamic() {
    styledDiv {
        css { +AvatarStyles.dynamic }
        autoset()
    }
}
