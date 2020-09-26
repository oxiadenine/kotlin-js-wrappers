package antd.card

import kotlinext.js.*
import react.*

fun RBuilder.card(handler: RHandler<CardProps>) = child(CardComponent::class, handler)
fun RBuilder.cardGrid(handler: RHandler<CardGridProps>) = child(CardComponent.Grid, jsObject {}, handler)
fun RBuilder.cardMeta(handler: RHandler<CardMetaProps>) = child(CardComponent.Meta, jsObject {}, handler)
