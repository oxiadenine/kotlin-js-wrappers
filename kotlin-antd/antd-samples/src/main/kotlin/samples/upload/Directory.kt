package samples.upload

import antd.button.button
import antd.icon.uploadOutlined
import antd.upload.UploadComponent
import antd.upload.upload
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.directory() {
    styledDiv {
        css { +UploadStyles.directory }
        upload<Any, UploadComponent<Any>> {
            attrs {
                action = "//jsonplaceholder.typicode.com/posts/"
                directory = true
            }
            button {
                uploadOutlined {}
                +"Upload Directory"
            }
        }
    }
}
