package samples.table

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object TableStyles : StyleSheet("table", isStatic = true) {
    val container by css {}
    val basic by css {}
    val jsx by css {}
    val rowSelection by css {}
    val rowSelectionAndOperation by css {}
    val rowSelectionCustom by css {}
    val head by css {}
    val resetFilter by css {
        descendants(".table-operations") {
            marginBottom = 16.px
            children("button") {
                marginRight = 8.px
            }
        }
    }
    val ajax by css {}
    val size by css {
        descendants("h4") {
            marginBottom = 16.px
        }
    }
    val bordered by css {
        descendants("th.column-money") {
            textAlign = TextAlign.right
        }
        descendants("td.column-money") {
            textAlign = TextAlign.right
        }
    }
    val expand by css {}
    val colspanRowspan by css {}
    val expandChildren by css {}
    val fixedHeader by css {}
    val fixedColumns by css {}
    val fixedColumnsHeader by css {}
    val groupingColumns by css {}
    val editRow by css {
        descendants(".editable-row") {
            descendants(".ant-form-explain") {
                position = Position.absolute
                marginTop = (-4).px
                fontSize = 12.px
            }
        }
    }
    val nestedTable by css {}
    val dynamicSettings by css {
        descendants(".components-table-demo-control-bar") {
            marginBottom = 10.px
            descendants(".ant-form-item") {
                marginRight = 16.px
                marginBottom = 8.px
            }
        }
    }
}

class TableApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Table" }
        styledDiv {
            css { +TableStyles.container }
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
