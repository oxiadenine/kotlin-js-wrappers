package samples.datepicker

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            size()
            disabled()
            startEnd()
            extraFooter()
            dateRender()
            format()
            time()
            disabledDate()
            presettedRanges()
            mode()
            suffix()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
