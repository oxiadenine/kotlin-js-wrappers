package antd.table

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

inline fun <T, reified TC : TableComponent<T>> RBuilder.table(noinline handler: RHandler<TableProps<T>>) = child(TC::class, handler)
fun <T> RBuilder.column(handler: RHandler<ColumnProps<T>>) = child(TableComponent.Column, jsObject {}, handler)
fun RBuilder.columnGroup(handler: RHandler<ColumnGroupProps>) = child(TableComponent.ColumnGroup, jsObject {}, handler)
