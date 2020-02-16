package samples.pagination

import react.*
import react.dom.*

class PaginationApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Pagination" }
        div {
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
