package samples.mention

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            async()
            avatar()
            controlled()
            popupContainer()
            multipleTrigger()
            placemenet()
            customTag()
            controlledSimple()
            multilines()
            readonly()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
