package samples.select

import react.*
import react.dom.*

class SelectApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Select" }
        div {
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

fun RBuilder.selectApp() = child(SelectApp::class) {}
