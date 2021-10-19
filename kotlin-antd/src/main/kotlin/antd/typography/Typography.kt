@file:JsModule("antd/lib/typography")
@file:JsNonModule

package antd.typography

import react.*

@JsName("default")
external object TypographyComponent : Component<TypographyProps, State> {
    val Text: TextComponent
    val Link: LinkComponent
    val Title: TitleComponent
    val Paragraph: ParagraphComponent

    override fun render(): ReactElement?
}

external interface TypographyProps : Props {
    var id: String?
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var children: Any?
}
