package samples.upload

import antd.MouseEvent
import antd.icon.plusOutlined
import antd.modal.modal
import antd.upload.UploadChangeParam
import antd.upload.UploadComponent
import antd.upload.UploadFile
import antd.upload.upload
import kotlinext.js.jso
import kotlinx.css.LinearDimension
import kotlinx.css.width
import kotlinx.html.classes
import org.w3c.dom.HTMLElement
import react.*
import react.dom.attrs
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledImg

external interface PicturesWallState : State {
    var previewVisible: Boolean
    var previewImage: String
    var fileList: Array<UploadFile<Any>>
}

class PicturesWall : RComponent<Props, PicturesWallState>() {
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
        fileList = arrayOf(jso<UploadFile<Any>> {
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
                styledImg {
                    css { width = LinearDimension("100%") }
                    attrs {
                        alt = "example"
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
