package samples.list

import kotlinx.css.minHeight
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ListStyles : StyleSheet("list", isStatic = true) {
    val container by css {}
    val simple by css {}
    val basic by css {}
    val loadMore by css {
        descendants(".demo-loadmore-list") {
            minHeight = 350.px
        }
    }
    val vertical by css {}
    val grid by css {}
    val responsive by css {}
}

class ListApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"List" }
        styledDiv {
            css { +ListStyles.container }
            basic()
            loadMore()
            vertical()
            grid()
            responsive()
        }
    }
}

fun RBuilder.listApp() = child(ListApp::class) {}
