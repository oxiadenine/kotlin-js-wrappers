package samples.table

import react.*
import react.dom.*

class TableApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Table" }
        div {
            basic()
            jsx()
            rowSelection()
            rowSelectionAndOperation()
            rowSelectionCustom()
            head()
            resetFilter()
            ajax()
            size()
            bordered()
            expand()
            colspanRowspan()
            expandChildren()
            fixedHeader()
            fixedColumns()
            fixedColumnsHeader()
            groupingColumns()
            editRow()
            nestedTable()
            dynamicSettings()
        }
    }
}

fun RBuilder.tableApp() = child(TableApp::class) {}
