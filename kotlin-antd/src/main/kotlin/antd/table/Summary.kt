package antd.table

import react.*

external interface Summary {
    val Cell: SummaryCellComponent
    val Row: SummaryRowComponent
}

external interface SummaryCellComponent : ComponentType<SummaryCellProps>

external interface SummaryRowComponent : ComponentType<SummaryRowProps>

external interface SummaryCellProps : RProps {
    var className: String?
    var children: ReactNode?
    var index: Number
    var colSpan: Number?
    var rowSpan: Number?
    var align: AlignType?
}

external interface SummaryRowProps : RProps {
    var children: ReactNode?
    var className: String?
    var style: dynamic
}
