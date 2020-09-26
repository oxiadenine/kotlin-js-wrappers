package samples.upload

import antd.button.*
import antd.icon.*
import antd.upload.*
import react.*
import styled.*

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
