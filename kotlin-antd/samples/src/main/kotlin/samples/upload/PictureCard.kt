package samples.upload

import antd.MouseEvent
import antd.icon.icon
import antd.modal.modal
import antd.upload.UploadChangeParam
import antd.upload.UploadFile
import antd.upload.upload
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.classes
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*

interface PicturesWallState : RState {
    var previewVisible: Boolean
    var previewImage: String
    var fileList: Array<UploadFile>
}

class PicturesWall : RComponent<RProps, PicturesWallState>() {
    private val handleCancel = fun (_: MouseEvent<HTMLElement>) {
        setState {
            previewVisible = false
        }
    }

    private val handlePreview = fun (file: UploadFile) {
        setState {
            previewImage = file.url ?: file.thumbUrl ?: ""
            previewVisible = true
        }
    }

    private val handleChange = fun (info: UploadChangeParam<UploadFile>) {
        val nefFileList = info.fileList

        setState {
            fileList = nefFileList
        }
    }

    override fun PicturesWallState.init() {
        previewVisible = false
        previewImage = ""
        fileList = arrayOf(jsObject {
            uid = "-1"
            name = "xxx.png"
            status = "done"
            url = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
        })
    }

    override fun RBuilder.render() {
        val uploadButton = buildElement {
            div {
                icon {
                    attrs.type = "plus"
                }
                div {
                    attrs.classes = setOf("ant-upload-text")
                    +"Upload"
                }
            }
        }!!

        div {
            attrs.classes = setOf("clearfix")
            upload {
                attrs {
                    action = "//jsonplaceholder.typicode.com/posts/"
                    listType = "picture-card"
                    fileList = state.fileList
                    onPreview = handlePreview
                    onChange = handleChange
                }
                if (state.fileList.size < 3) {
                    childList.add(uploadButton)
                }
            }
            modal {
                attrs {
                    visible = state.previewVisible
                    footer = null
                    onCancel = handleCancel
                }
                img {
                    attrs {
                        alt = "example"
                        jsStyle = js { width = "100%" }
                        src = state.previewImage
                    }
                }
            }
        }
    }
}

fun RBuilder.picturesWall() = child(PicturesWall::class) {}

fun RBuilder.pictureCard() {
    div("upload-container") {
        attrs.id = "upload-picture-card"
        picturesWall()
    }
}
