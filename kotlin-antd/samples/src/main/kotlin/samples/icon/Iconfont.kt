package samples.icon

import antd.icon.IconComponent
import antd.icon.IconProps
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

private val iconFontComponent = IconComponent.createFromIconfontCN(jsObject {
    scriptUrl = "//at.alicdn.com/t/font_8d5l8fzk5b87iudi.js"
})

fun RBuilder.iconFont(handler: RHandler<IconProps>) = child(iconFontComponent, jsObject {}, handler)

fun RBuilder.iconfont() {
    div("icon-container") {
        attrs.id = "icon-iconfont"
        div("icons-list") {
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
