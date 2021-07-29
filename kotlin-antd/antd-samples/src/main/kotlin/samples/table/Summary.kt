package samples.table

import antd.table.*
import antd.typography.typographyText
import kotlinext.js.jsObject
import react.RBuilder
import react.buildElement
import react.dom.br
import styled.css
import styled.styledDiv

private external interface SummaryDataItem {
    var key: String
    var name: String
    var borrow: Number
    var repayment: Number
}

private external interface SummaryFixedDataItem {
    var key: Number
    var name: String
    var description: String
}

private val tableColumns = arrayOf<ColumnType<SummaryDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
    },
    jsObject {
        title = "Borrow"
        dataIndex = "borrow"
    },
    jsObject {
        title = "Repayment"
        dataIndex = "repayment"
    }
)

private val tableData = arrayOf<SummaryDataItem>(
    jsObject {
        key = "1"
        name = "John Brown"
        borrow = 10
        repayment = 33
    },
    jsObject {
        key = "2"
        name = "Jim Green"
        borrow = 100
        repayment = 0
    },
    jsObject {
        key = "3"
        name = "Joe Black"
        borrow = 10
        repayment = 10
    },
    jsObject {
        key = "4"
        name = "Jim Red"
        borrow = 75
        repayment = 45
    }
)

private val fixedTableColumns = arrayOf<ColumnType<SummaryFixedDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        fixed = true
        width = 100
    },
    jsObject {
        title = "Description"
        dataIndex = "description"
    }
)

private val fixedTableData = (1..6).map { i ->
    jsObject<SummaryFixedDataItem> {
        key = i
        name = if (i % 2 == 0) "Light" else "Bamboo"
        description = "Everything that has a beginning, has an end."
    }
}.toTypedArray()

fun RBuilder.summary() {
    styledDiv {
        css { +TableStyles.summary }
        table<SummaryDataItem, TableComponent<SummaryDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<SummaryDataItem>>()
                dataSource = tableData
                pagination = false
                bordered = true
                summary = { pageData ->
                    buildElement {
                        var totalBorrow = 0
                        var totalRepayment = 0

                        pageData.forEach { dataItem ->
                            totalBorrow += dataItem.borrow.toInt()
                            totalRepayment += dataItem.repayment.toInt()
                        }

                        tableSummaryRow {
                            tableSummaryCell { +"Total" }
                            tableSummaryCell {
                                typographyText {
                                    attrs.type = "danger"
                                    +"$totalBorrow"
                                }
                            }
                            tableSummaryCell {
                                typographyText { +"$totalRepayment" }
                            }
                        }
                        tableSummaryRow {
                            tableSummaryCell { +"Balance" }
                            tableSummaryCell {
                                attrs.colSpan = 2
                                typographyText {
                                    attrs.type = "danger"
                                    +"${totalBorrow - totalRepayment}"
                                }
                            }
                        }
                    }
                }
            }
        }
        br {}
        table<SummaryFixedDataItem, TableComponent<SummaryFixedDataItem>> {
            attrs {
                columns = fixedTableColumns.unsafeCast<ColumnsType<SummaryFixedDataItem>>()
                dataSource = fixedTableData
                pagination = false
                scroll = jsObject { x = 2000 }
                bordered = true
                summary = {
                    buildElement {
                        tableSummaryRow {
                            tableSummaryCell {
                                attrs.index = 0
                                +"Summary"
                            }
                            tableSummaryCell {
                                attrs.index = 1
                                +"This is a summary content"
                            }
                        }
                    }
                }
            }
        }
    }
}
