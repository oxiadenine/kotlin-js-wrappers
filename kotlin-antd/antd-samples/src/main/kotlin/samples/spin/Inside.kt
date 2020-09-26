package samples.spin

import antd.spin.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.inside() {
    styledDiv {
        css { +SpinStyles.inside }
        div {
            attrs.classes = setOf("example")
            spin {}
        }
    }
}
