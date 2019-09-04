package samples.upload

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            defaultFileList()
            fileList()
            directory()
            pictureStyle()
            avatar()
            pictureCard()
            drag()
            previewFile()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
