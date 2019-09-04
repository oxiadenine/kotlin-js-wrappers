package samples.upload

import antd.button.button
import antd.icon.icon
import antd.message.message
import antd.upload.HttpRequestHeader
import antd.upload.upload
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("upload-container") {
        attrs.id = "upload-basic"
        upload {
            attrs {
                name = "file"
                action = "//jsonplaceholder.typicode.com/posts/"
                headers = js {
                    authorization = "authorization-text"
                }.unsafeCast<HttpRequestHeader>()
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
            button {
                icon {
                    attrs.type = "upload"
                }
                +"Click to upload"
            }
        }
    }
}
