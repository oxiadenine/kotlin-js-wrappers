package samples

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("app-container") {
            h1 { +"Examples" }
            formatDate()
            relativeTime()
            calendarTime()
            multipleLocale()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
