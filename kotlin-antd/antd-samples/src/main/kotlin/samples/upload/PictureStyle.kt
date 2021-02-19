package samples.upload

import antd.button.button
import antd.icon.*
import antd.upload.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val fileList = arrayOf<UploadFile<Any>>(
    jsObject {
        uid = "-1"
        name = "xxx.png"
        status = "done"
        url = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
        thumbUrl = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
    },
    jsObject {
        uid = "-2"
        name = "yyy.png"
        status = "done"
        url = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
        thumbUrl = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
    }
)

fun RBuilder.pictureStyle() {
    styledDiv {
        css { +UploadStyles.pictureStyle }
        div {
            upload<Any, UploadComponent<Any>> {
                attrs {
                    action = "//jsonplaceholder.typicode.com/posts/"
                    listType = "picture"
                    defaultFileList = fileList
                }
                button {
                    uploadOutlined {}
                    +"Upload"
                }
            }
            br {}
            br {}
            upload<Any, UploadComponent<Any>> {
                attrs {
                    action = "//jsonplaceholder.typicode.com/posts/"
                    listType = "picture"
                    defaultFileList = fileList
                    className = "upload-list-inline"
                }
                button {
                    uploadOutlined {}
                    +"Upload"
                }
            }
        }
    }
}
