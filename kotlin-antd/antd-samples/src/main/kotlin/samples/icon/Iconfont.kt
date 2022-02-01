package samples.icon

import antd.icon.*
import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

private val iconFontComponent = createFromIconfontCN(jso {
    scriptUrl = "//at.alicdn.com/t/font_8d5l8fzk5b87iudi.js"
})

private fun RBuilder.iconFont(handler: RHandler<IconFontProps>) = child(iconFontComponent, jso {}, handler)

fun RBuilder.iconfont() {
    styledDiv {
        css { +IconStyles.iconfont }
        div {
            attrs.classes = setOf("icons-list")
            iconFont {
                attrs.type = "icon-tuichu"
            }
            iconFont {
                attrs.type = "icon-facebook"
            }
            iconFont {
                attrs.type = "icon-twitter"
            }
        }
    }
}
