package samples.list

import react.*
import react.dom.*

class ListApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"List" }
        div {
            basic()
            loadMore()
            vertical()
            grid()
            responsive()
        }
    }
}

fun RBuilder.listApp() = child(ListApp::class) {}
