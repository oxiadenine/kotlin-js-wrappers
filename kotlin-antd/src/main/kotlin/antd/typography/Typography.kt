@file:JsModule("antd/lib/typography")
@file:JsNonModule

package antd.typography

import org.w3c.dom.*
import react.*

@JsName("default")
external object TypographyComponent : Component<InternalTypographyProps, RState> {
    val Text: TextComponent
    val Title: TitleComponent
    val Paragraph: ParagraphComponent

    override fun render(): ReactElement?
}

external interface InternalTypographyProps : TypographyProps, RProps {
    var component: String?
    var setContentRef: ((node: HTMLElement) -> Unit)?
}

external interface TypographyProps {
    var id: String?
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var children: ReactElement?
    /* ["aria-label"]: String? */
}
