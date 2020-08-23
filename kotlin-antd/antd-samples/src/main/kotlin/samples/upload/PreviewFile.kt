package samples.upload

import antd.button.button
import antd.icon.icon
import antd.upload.UploadProps
import antd.upload.upload
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*
import kotlinx.browser.window

private val props = jsObject<UploadProps> {
    action = "//jsonplaceholder.typicode.com/posts/"
    listType = "picture"
    previewFile = { file ->
        console.log("Your upload file:", file)

        window.fetch("https://next.json-generator.com/api/json/get/4ytyBoLK8", jsObject {
            method = "POST"
            body = file
        }).then { res -> res.json() }.then { res -> res.asDynamic().thumbail as String }
    }
}

fun RBuilder.previewFile() {
    div("upload-container") {
        attrs.id = "upload-preview-file"
        div {
            upload {
                attrs {
                    action = props.action
                    listType = props.listType
                    previewFile = props.previewFile
                }
                button {
                    icon {
                        attrs.type = "upload"
                    }
                    +"Upload"
                }
            }
        }
    }
}
