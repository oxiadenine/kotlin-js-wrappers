package samples.upload

import antd.*
import antd.icon.*
import antd.modal.*
import antd.upload.*
import kotlinext.js.*
import kotlinx.html.*
import org.w3c.dom.*
import react.*
import react.dom.*
import styled.*

interface PicturesWallState : RState {
    var previewVisible: Boolean
    var previewImage: String
    var fileList: Array<UploadFile<Any>>
}

class PicturesWall : RComponent<RProps, PicturesWallState>() {
    private val handleCancel = fun(_: MouseEvent<HTMLElement>) {
        setState {
            previewVisible = false
        }
    }

    private val handlePreview = fun(file: UploadFile<Any>) {
        setState {
            previewImage = file.url ?: file.thumbUrl ?: ""
            previewVisible = true
        }
    }

    private val handleChange = fun(info: UploadChangeParam<UploadFile<Any>>) {
        val nefFileList = info.fileList

        setState {
            fileList = nefFileList
        }
    }

    override fun PicturesWallState.init() {
        previewVisible = false
        previewImage = ""
        fileList = arrayOf(jsObject<UploadFile<Any>> {
            uid = "-1"
            name = "xxx.png"
            status = "done"
            url = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
        })
    }

    override fun RBuilder.render() {
        val uploadButton = buildElement {
            div {
                plusOutlined {}
                div {
                    attrs.classes = setOf("ant-upload-text")
                    +"Upload"
                }
            }
        }

        div {
            attrs.classes = setOf("clearfix")
            upload<Any, UploadComponent<Any>> {
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
    styledDiv {
        css { +UploadStyles.pictureCard }
        picturesWall()
    }
}
