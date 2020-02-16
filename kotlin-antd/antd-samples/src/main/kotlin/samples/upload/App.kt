package samples.upload

import react.*
import react.dom.*

class UploadApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Upload" }
        div {
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

fun RBuilder.uploadApp() = child(UploadApp::class) {}
