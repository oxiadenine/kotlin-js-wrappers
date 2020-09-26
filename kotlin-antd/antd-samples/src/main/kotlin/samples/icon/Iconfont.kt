package samples.icon

import antd.icon.IconComponent
import antd.icon.IconProps
import kotlinext.js.jsObject
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val iconFontComponent = IconComponent.createFromIconfontCN(jsObject {
    scriptUrl = "//at.alicdn.com/t/font_8d5l8fzk5b87iudi.js"
})

fun RBuilder.iconFont(handler: RHandler<IconProps>) = child(iconFontComponent, jsObject {}, handler)

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
