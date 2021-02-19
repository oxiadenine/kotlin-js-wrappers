package samples.upload

import antd.button.*
import antd.icon.*
import antd.upload.*
import react.*
import styled.*

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
