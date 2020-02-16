package samples.grid

import react.*
import react.dom.*

class GridApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Grid" }
        div {
            basic()
            gutter()
            offset()
            sort()
            flex()
            flexAlign()
            flexOrder()
            responsive()
            responsiveMore()
            playground()
        }
    }
}

fun RBuilder.gridApp() = child(GridApp::class) {}
