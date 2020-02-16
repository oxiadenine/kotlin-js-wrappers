package samples.upload

import antd.button.button
import antd.icon.icon
import antd.upload.upload
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.directory() {
    div("upload-container") {
        attrs.id = "upload-directory"
        upload {
            attrs {
                action = "//jsonplaceholder.typicode.com/posts/"
                directory = true
            }
            button {
                icon {
                    attrs.type = "upload"
                }
                +"Upload Directory"
            }
        }
    }
}
