package samples.breadcrumb

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object BreadcrumbStyles : StyleSheet("breadcrumb", isStatic = true) {
    val container by css {}
    val basic by css {}
    val overlay by css {}
    val separator by css {}
    val withIcon by css {}
    val separatorIndepent by css {}
}

class BreadcrumbApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Breadcrumb" }
        styledDiv {
            css { +BreadcrumbStyles.container }
            basic()
            separator()
            withIcon()
            separatorIndepent()
        }
    }
}

fun RBuilder.breadcrumbApp() = child(BreadcrumbApp::class) {}
