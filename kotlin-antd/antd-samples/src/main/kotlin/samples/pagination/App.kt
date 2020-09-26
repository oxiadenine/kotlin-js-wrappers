package samples.pagination

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

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

class PaginationApp : RComponent<RProps, RState>() {
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
