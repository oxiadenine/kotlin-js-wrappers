package samples.upload

import antd.button.button
import antd.icon.icon
import antd.upload.upload
import react.*
import styled.css
import styled.styledDiv

fun RBuilder.directory() {
    styledDiv {
        css { +UploadStyles.directory }
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
