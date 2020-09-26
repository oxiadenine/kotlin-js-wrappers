package antd.typography

import kotlinext.js.*
import react.*

fun RBuilder.typography(handler: RHandler<InternalTypographyProps>) = child(TypographyComponent::class, handler)
fun RBuilder.text(handler: RHandler<TextProps>) = child(TypographyComponent.Text, jsObject {}, handler)
fun RBuilder.title(handler: RHandler<TitleProps>) = child(TypographyComponent.Title, jsObject {}, handler)
fun RBuilder.paragraph(handler: RHandler<ParagraphProps>) = child(TypographyComponent.Paragraph, jsObject {}, handler)
