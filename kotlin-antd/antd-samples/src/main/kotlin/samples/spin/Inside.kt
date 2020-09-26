package samples.spin

import antd.spin.spin
import kotlinx.html.classes
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.inside() {
    styledDiv {
        css { +SpinStyles.inside }
        div {
            attrs.classes = setOf("example")
            spin {}
        }
    }
}
