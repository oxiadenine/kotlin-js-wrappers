package samples.icon

import antd.icon.*
import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

private val iconFontComponent = createFromIconfontCN(jsObject {
    scriptUrl = arrayOf(
        "//at.alicdn.com/t/font_1788044_0dwu4guekcwr.js", // icon-javascript, icon-java, icon-shoppingcart (overrided)
        "//at.alicdn.com/t/font_1788592_a5xf2bdic3u.js", // icon-shoppingcart, icon-python
    )
})

private fun RBuilder.iconFont(handler: RHandler<IconFontProps>) = child(iconFontComponent, jsObject {}, handler)

fun RBuilder.scriptUrl() {
    styledDiv {
        css { +IconStyles.scriptUrl }
        div {
            attrs.classes = setOf("icons-list")
            iconFont {
                attrs.type = "icon-javascript"
            }
            iconFont {
                attrs.type = "icon-java"
            }
            iconFont {
                attrs.type = "icon-shoppingcart"
            }
            iconFont {
                attrs.type = "icon-python"
            }
        }
    }
}
