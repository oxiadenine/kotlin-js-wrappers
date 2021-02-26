@file:JsModule("antd/lib/typography")
@file:JsNonModule

package antd.typography

import antd.ReactNode
import react.*

@JsName("default")
external object TypographyComponent : Component<TypographyProps, RState> {
    val Text: TextComponent
    val Link: LinkComponent
    val Title: TitleComponent
    val Paragraph: ParagraphComponent

    override fun render(): ReactElement?
}

external interface TypographyProps : RProps {
    var id: String?
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var children: ReactNode?
}
