package samples.upload

import antd.button.button
import antd.icon.uploadOutlined
import antd.message.message
import antd.upload.HttpRequestHeader
import antd.upload.UploadComponent
import antd.upload.upload
import kotlinext.js.js
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +UploadStyles.basic }
        upload<Any, UploadComponent<Any>> {
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
                uploadOutlined {}
                +"Click to upload"
            }
        }
    }
}
