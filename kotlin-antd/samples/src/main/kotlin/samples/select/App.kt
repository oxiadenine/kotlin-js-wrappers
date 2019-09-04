package samples.select

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            multiple()
            optionLabelProp()
            optGroup()
            automaticTokenization()
            customDropdownMenu()
            search()
            size()
            tags()
            coordinate()
            labelInValue()
            selectUsers()
            hideSelected()
            suffix()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
