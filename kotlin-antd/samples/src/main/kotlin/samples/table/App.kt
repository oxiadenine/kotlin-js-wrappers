package samples.table

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
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

fun RBuilder.app() = child(App::class) {}
