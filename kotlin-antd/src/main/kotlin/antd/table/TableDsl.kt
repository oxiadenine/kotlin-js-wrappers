package antd.table

import kotlinext.js.*
import react.*

inline fun <T, reified TC : TableComponent<T>> RBuilder.table(noinline handler: RHandler<TableProps<T>>) = child(TC::class, handler)
fun <T> RBuilder.tableColumn(handler: RHandler<ColumnProps<T>>) = child(TableComponent.Column, jso {}, handler)
fun <T> RBuilder.tableColumnGroup(handler: RHandler<ColumnGroupProps<T>>) = child(TableComponent.ColumnGroup, jso {}, handler)
fun RBuilder.tableSummaryCell(handler: RHandler<SummaryCellProps>) = child(TableComponent.Summary.Cell, jso {}, handler)
fun RBuilder.tableSummaryRow(handler: RHandler<SummaryRowProps>) = child(TableComponent.Summary.Row, jso {}, handler)
