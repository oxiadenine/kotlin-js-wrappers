package samples.treeselect

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            treeData()
            multiple()
            checkable()
            suffix()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
