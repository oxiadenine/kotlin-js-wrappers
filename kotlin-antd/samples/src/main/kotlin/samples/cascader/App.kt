package samples.cascader

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            customTrigger()
            disabledOption()
            size()
            search()
            fieldNames()
            defaultValue()
            hover()
            changeOnSelect()
            customRender()
            lazy()
            suffix()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
