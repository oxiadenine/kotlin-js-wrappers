package samples.upload

import antd.icon.loadingOutlined
import antd.icon.plusOutlined
import antd.message.message
import antd.upload.*
import kotlinx.html.classes
import org.w3c.files.File
import org.w3c.files.FileReader
import react.*
import react.dom.attrs
import react.dom.div
import react.dom.img
import styled.css
import styled.styledDiv

private fun getBase64(img: File, callback: (imgUrl: String) -> Unit) {
    val reader = FileReader()

    reader.addEventListener("load", { callback(reader.result.unsafeCast<String>()) })
    reader.readAsDataURL(img)
}

private val beforeUpload = { file: RcFile, _: Array<RcFile> ->
    val isJPG = file.type == "image/jpeg"

    if (!isJPG) {
        message.error("You can only upload JPG file!")
    }

    val isLt2M = (file.size.toDouble() / 1024 / 1024) < 2

    if (!isLt2M) {
        message.error("Image must smaller than 2MB!")
    }

    isJPG && isLt2M
}


external interface AvatarAppState : State {
    var imageUrl: String?
    var loading: Boolean
}

class AvatarApp : RComponent<Props, AvatarAppState>() {
    private val handleChange = fun(info: UploadChangeParam<UploadFile<Any>>) {
        if (info.file.status == "uploading") {
            setState {
                loading = true
            }

            return
        }

        if (info.file.status == "done") {
            // Get this url from response in real world.
            getBase64(info.file.originFileObj!!.unsafeCast<File>()) { imgUrl ->
                setState {
                    imageUrl = imgUrl
                    loading = false
                }
            }
        }
    }

    override fun AvatarAppState.init() {
        loading = false
    }

    override fun RBuilder.render() {
        val uploadButton = buildElement {
            div {
                if (state.loading) {
                    loadingOutlined {}
                } else plusOutlined {}
                div {
                    attrs.classes = setOf("ant-upload-text")
                    +"Upload"
                }
            }
        }

        upload<Any, UploadComponent<Any>> {
            attrs {
                name = "avatar"
                listType = "picture-card"
                className = "avatar-uploader"
                showUploadList = false
                action = "//jsonplaceholder.typicode.com/posts/"
                beforeUpload = beforeUpload
                onChange = handleChange
            }
            if (!state.imageUrl.isNullOrEmpty()) {
                img {
                    attrs {
                        src = state.imageUrl!!
                        alt = "avatar"
                    }
                }
            } else childList.add(uploadButton)
        }
    }
}

fun RBuilder.avatarApp() = child(AvatarApp::class) {}

fun RBuilder.avatar() {
    styledDiv {
        css { +UploadStyles.avatar }
        avatarApp()
    }
}
