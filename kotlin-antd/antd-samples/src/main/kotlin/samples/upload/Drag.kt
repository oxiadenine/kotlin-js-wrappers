package samples.upload

import antd.icon.*
import antd.message.*
import antd.upload.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.drag() {
    styledDiv {
        css { +UploadStyles.drag }
        uploadDragger {
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
                inboxOutlined {}
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
