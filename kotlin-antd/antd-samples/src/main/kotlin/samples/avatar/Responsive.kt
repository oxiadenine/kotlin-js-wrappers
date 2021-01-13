package samples.avatar

import antd.avatar.avatar
import antd.icon.antDesignOutlined
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

fun RBuilder.responsive() {
    styledDiv {
        css { +AvatarStyles.responsive }
        avatar {
            attrs {
                size = js {
                    xs = 24
                    sm = 32
                    md = 40
                    lg = 64
                    xl = 80
                    xxl = 100
                }.unsafeCast<Any>()
                icon = buildElement {
                    antDesignOutlined {}
                }
            }
        }
    }
}
