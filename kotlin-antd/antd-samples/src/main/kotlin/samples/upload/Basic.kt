package samples.upload

import antd.button.*
import antd.icon.*
import antd.message.*
import antd.upload.*
import kotlinext.js.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +UploadStyles.basic }
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
                uploadOutlined {}
                +"Click to upload"
            }
        }
    }
}
