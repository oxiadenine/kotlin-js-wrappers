package samples.breadcrumb

import react.*
import react.dom.*

class BreadcrumbApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Breadcrumb" }
        div {
            basic()
            separator()
            withIcon()
        }
    }
}

fun RBuilder.breadcrumbApp() = child(BreadcrumbApp::class) {}
