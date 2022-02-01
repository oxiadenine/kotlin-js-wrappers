package antd.typography

import kotlinext.js.*
import react.*

fun RBuilder.typography(handler: RHandler<TypographyProps>) = child(TypographyComponent::class, handler)
fun RBuilder.typographyText(handler: RHandler<TextProps>) = child(TypographyComponent.Text, jso {}, handler)
fun RBuilder.typographyLink(handler: RHandler<LinkProps>) = child(TypographyComponent.Link, jso {}, handler)
fun RBuilder.typographyTitle(handler: RHandler<TitleProps>) = child(TypographyComponent.Title, jso {}, handler)
fun RBuilder.typographyParagraph(handler: RHandler<ParagraphProps>) = child(TypographyComponent.Paragraph, jso {}, handler)
