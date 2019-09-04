package antd.table

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.table(handler: RHandler<TableProps<Any>>) = child(TableComponent::class, handler)
fun RBuilder.column(handler: RHandler<ColumnProps<Any>>) = child(TableComponent.Column, jsObject {}, handler)
fun RBuilder.columnGroup(handler: RHandler<ColumnGroupProps>) = child(TableComponent.ColumnGroup, jsObject {}, handler)
