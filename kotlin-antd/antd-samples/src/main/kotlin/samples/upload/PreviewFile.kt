package samples.upload

import antd.button.button
import antd.icon.uploadOutlined
import antd.upload.UploadComponent
import antd.upload.UploadProps
import antd.upload.upload
import kotlinext.js.jsObject
import kotlinx.browser.window
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

private val props = jsObject<UploadProps<Any>> {
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
    styledDiv {
        css { +UploadStyles.previewFile }
        div {
            upload<Any, UploadComponent<Any>> {
                attrs {
                    action = props.action
                    listType = props.listType
                    previewFile = props.previewFile
                }
                button {
                    uploadOutlined {}
                    +"Upload"
                }
            }
        }
    }
}
