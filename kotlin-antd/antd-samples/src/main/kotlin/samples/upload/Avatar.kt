package samples.upload

import antd.icon.*
import antd.message.*
import antd.upload.*
import kotlinx.html.*
import org.w3c.files.*
import react.*
import react.dom.*
import styled.*

private fun getBase64(img: File, callback: (imgUrl: String) -> Unit) {
    val reader = FileReader()

    reader.addEventListener("load", { callback(reader.result.unsafeCast<String>()) })
    reader.readAsDataURL(img)
}

private fun beforeUpload(file: RcFile, FileList: Array<RcFile>): Boolean {
    val isJPG = file.type == "image/jpeg"

    if (!isJPG) {
        message.error("You can only upload JPG file!")
    }

    val isLt2M = (file.size.toDouble() / 1024 / 1024) < 2

    if (!isLt2M) {
        message.error("Image must smaller than 2MB!")
    }

    return isJPG && isLt2M
}


interface AvatarAppState : RState {
    var imageUrl: String?
    var loading: Boolean
}

class AvatarApp : RComponent<RProps, AvatarAppState>() {
    private val handleChange = fun(info: UploadChangeParam<UploadFile>) {
        if (info.file.status == "uploading") {
            setState {
                loading = true
            }

            return
        }

        if (info.file.status == "done") {
            // Get this url from response in real world.
            getBase64(info.file.originFileObj!!) { imgUrl ->
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

        upload {
            attrs {
                name = "avatar"
                listType = "picture-card"
                className = "avatar-uploader"
                showUploadList = false
                action = "//jsonplaceholder.typicode.com/posts/"
                beforeUpload = ::beforeUpload
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
