package samples.pageheader

import react.*
import react.dom.*

class PageHeaderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"PageHeader" }
        div {
            basic()
            content()
            actions()
            breadcrumb()
        }
    }
}

fun RBuilder.pageHeaderApp() = child(PageHeaderApp::class) {}
