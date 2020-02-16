package samples.upload

import antd.button.button
import antd.icon.icon
import antd.upload.upload
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.defaultFileList() {
    div("upload-container") {
        attrs.id = "upload-default-file-list"
        upload {
            attrs {
                action = "//jsonplaceholder.typicode.com/posts/"
                onChange = { info ->
                    val file = info.file
                    val fileList = info.fileList

                    if (file.status != "uploading") {
                        console.log(file, fileList)
                    }
                }
                defaultFileList = arrayOf(
                        jsObject {
                            uid = "1"
                            name = "xxx.png"
                            status = "done"
                            response = "Server Error 500" // custom error message to show
                            url = "http://www.baidu.com/xxx.png"
                        },
                        jsObject {
                            uid = "2"
                            name = "yyy.png"
                            status = "done"
                            url = "http://www.baidu.com/yyy.png"
                        },
                        jsObject {
                            uid = "3"
                            name = "zzz.png"
                            status = "error"
                            response = "Server Error 500" // custom error message to show
                            url = "http://www.baidu.com/zzz.png"
                        }
                )
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
