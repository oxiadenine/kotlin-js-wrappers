package antd.table

import react.*

external interface Summary {
    val Cell: SummaryCellComponent
    val Row: SummaryRowComponent
}

external interface SummaryCellComponent : ComponentClass<SummaryCellProps>

external interface SummaryRowComponent : ComponentClass<SummaryRowProps>

external interface SummaryCellProps : Props {
    var className: String?
    var children: ReactNode?
    var index: Number
    var colSpan: Number?
    var rowSpan: Number?
    var align: AlignType?
}

external interface SummaryRowProps : Props {
    var children: ReactNode?
    var className: String?
    var style: dynamic
}
