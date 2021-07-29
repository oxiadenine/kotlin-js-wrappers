package samples.descriptions

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object DescriptionsStyles : StyleSheet("descriptions", isStatic = true) {
    val container by css {}
    val basic by css {}
    val border by css {}
    val size by css {}
    val responsive by css {}
    val vertical by css {}
    val verticalBorder by css {}
}

class DescriptionsApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Descriptions" }
        styledDiv {
            css { +DescriptionsStyles.container }
            basic()
            border()
            size()
            responsive()
            vertical()
            verticalBorder()
        }
    }
}

fun RBuilder.descriptionsApp() = child(DescriptionsApp::class) {}
