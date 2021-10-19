package samples.inputnumber

import kotlinx.css.marginRight
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object InputNumberStyles : StyleSheet("input-number", isStatic = true) {
    val container by css {}
    val basic by css {}
    val disabled by css {}
    val formatter by css {}
    val size by css {
        descendants(".ant-input-number") {
            marginRight = 10.px
        }
    }
    val digit by css {}
}

class InputNumberApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"InputNumber" }
        styledDiv {
            css { +InputNumberStyles.container }
            basic()
            disabled()
            formatter()
            size()
            digit()
        }
    }
}

fun RBuilder.inputNumberApp() = child(InputNumberApp::class) {}
