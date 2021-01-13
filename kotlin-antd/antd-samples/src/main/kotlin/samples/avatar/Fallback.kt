package samples.avatar

import antd.avatar.avatar
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.fallback() {
    styledDiv {
        css { +AvatarStyles.fallback }
        avatar {
            attrs {
                shape = "circle"
                src = "http://abc.com/not-exist.jpg"
            }
            +"A"
        }
        avatar {
            attrs {
                shape = "circle"
                src = "http://abc.com/not-exist.jpg"
            }
            +"ABC"
        }
    }
}
