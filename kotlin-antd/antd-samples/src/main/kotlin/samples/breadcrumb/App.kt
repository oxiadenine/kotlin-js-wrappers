package samples.breadcrumb

import react.*
import react.dom.*
import styled.*

object BreadcrumbStyles : StyleSheet("breadcrumb", isStatic = true) {
    val container by css {}
    val basic by css {}
    val overlay by css {}
    val separator by css {}
    val withIcon by css {}
}

class BreadcrumbApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Breadcrumb" }
        styledDiv {
            css { +BreadcrumbStyles.container }
            basic()
            separator()
            withIcon()
        }
    }
}

fun RBuilder.breadcrumbApp() = child(BreadcrumbApp::class) {}
