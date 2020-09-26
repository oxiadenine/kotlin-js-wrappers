package samples.upload

import kotlinx.css.Color
import kotlinx.css.Float
import kotlinx.css.color
import kotlinx.css.float
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.marginRight
import kotlinx.css.marginTop
import kotlinx.css.properties.animation
import kotlinx.css.px
import kotlinx.css.width
import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object UploadStyles : StyleSheet("upload", isStatic = true) {
    val container by css {}
    val basic by css {}
    val defaultFileList by css {}
    val fileList by css {}
    val directory by css {}
    val pictureStyle by css {
        descendants(".upload-list-inline") {
            descendants(".ant-upload-list-item") {
                float = Float.left
                width = 200.px
                marginRight = 8.px
            }
            descendants(".ant-upload-animate-enter") {
                animation("uploadAnimateInlineIn")
            }
            descendants(".ant-upload-animate-leave") {
                animation("uploadAnimateInlineOut")
            }
        }
    }
    val avatar by css {
        descendants(".avatar-uploader") {
            children(".ant-upload") {
                width = 128.px
                height = 128.px
            }
        }
    }
    val pictureCard by css {
        descendants(".ant-upload-select-picture-card") {
            descendants("i") {
                color = Color("#999")
                fontSize = 32.px
            }
            descendants(".ant-upload-text") {
                marginTop = 8.px
                color = Color("#666")
            }
        }
    }
    val drag by css {}
    val previewFile by css {}
}

class UploadApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Upload" }
        styledDiv {
            css { +UploadStyles.container }
            basic()
            defaultFileList()
            fileList()
            directory()
            pictureStyle()
            avatar()
            pictureCard()
            drag()
            previewFile()
        }
    }
}

fun RBuilder.uploadApp() = child(UploadApp::class) {}
