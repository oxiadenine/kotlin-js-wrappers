package samples.upload

import antd.icon.icon
import antd.message.message
import antd.upload.dragger
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.drag() {
    div("upload-container") {
        attrs.id = "upload-drag"
        dragger {
            attrs {
                name = "file"
                multiple = true
                action = "//jsonplaceholder.typicode.com/posts/"
                onChange = { info ->
                    if (info.file.status != "uploading") {
                        console.log(info.file, info.fileList)
                    }
                    if (info.file.status == "done") {
                        message.success("${info.file.name} file uploaded successfully")
                    } else if (info.file.status == "error") {
                        message.error("${info.file.name} file upload failed.")
                    }
                }
            }
            p {
                attrs.classes = setOf("ant-upload-drag-icon")
                icon {
                    attrs.type = "inbox"
                }
            }
            p {
                attrs.classes = setOf("ant-upload-text")
                +"Click or drag file to this area to upload"
            }
            p {
                attrs.classes = setOf("ant-upload-hint")
                +"Support for a single or bulk upload. Strictly prohibit from uploading company data or other band files"
            }
        }
    }
}
