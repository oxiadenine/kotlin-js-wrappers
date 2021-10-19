package samples.pagination

import kotlinx.css.marginBottom
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object PaginationStyles : StyleSheet("pagination", isStatic = true) {
    val container by css {}
    val basic by css {}
    val more by css {}
    val changer by css {}
    val jump by css {}
    val mini by css {
        descendants(".ant-pagination") {
            not(":last-child") {
                marginBottom = 24.px
            }
        }
    }
    val simple by css {}
    val controlled by css {}
    val total by css {}
    val itemRender by css {}
}

class PaginationApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Pagination" }
        styledDiv {
            css { +PaginationStyles.container }
            basic()
            more()
            changer()
            jump()
            mini()
            simple()
            controlled()
            total()
            itemRender()
        }
    }
}

fun RBuilder.paginationApp() = child(PaginationApp::class) {}
