package samples.backtop

import antd.backtop.backTop
import kotlinx.css.color
import kotlinx.css.rgba
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledStrong

fun RBuilder.basic() {
    styledDiv {
        css { +BackTopStyles.basic }
        div {
            backTop {}
            +"Scroll down to see the bottom-right"
            styledStrong {
                css { color = rgba(64, 64, 64, 0.6) }
                +" gray "
            }
            +"button."
        }
    }
}
