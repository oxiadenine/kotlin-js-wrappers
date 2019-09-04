@file:JsModule("antd/lib/table")

package antd.table

import antd.MouseEventHandler
import antd.SyntheticEvent
import antd.pagination.PaginationConfig
import kotlinext.js.Object
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object TableComponent : Component<TableProps<Any>, TableState<Any>> {
    val Column: ColumnComponent
    val ColumnGroup: ColumnGroupComponent

    override fun render(): ReactElement?
}

external interface TableProps<T> : RProps {
    var prefixCls: String?
    var dropdownPrefixCls: String?
    var rowSelection: TableRowSelection<T>?
    var pagination: Any /* PaginationConfig | Boolean */
    var size: TableSize?
    var dataSource: Array<T>?
    var components: TableComponents?
    var columns: Array<ColumnProps<T>>?
    var rowKey: Any /* String | RowKeyFn<T> */
    var rowClassName: ((record: T, index: Number) -> String)?
    var expandedRowRender: ((record: T, index: Number, indent: Number, expanded: Boolean) -> Any)? /* String | ReactElement */
    var defaultExpandAllRows: Boolean?
    var defaultExpandedRowKeys: Any? /*  Array<String> | Array<Number> */
    var expandedRowKeys: Any? /*  Array<String> | Array<Number> */
    var expandIcon: ((props: ExpandIconProps<T>) -> ReactElement)?
    var expandIconAsCell: Boolean?
    var expandIconColumnIndex: Number?
    var expandRowByClick: Boolean?
    var onExpandedRowsChange: ((expandedRowKeys: Any /*  Array<String> | Array<Number> */) -> Unit)?
    var onExpand: ((expanded: Boolean, record: T) -> Unit)?
    var onChange: ((pagination: PaginationConfig, filters: Any, sorter: SorterResult<T>, extra: TableCurrentDataSource<T>) -> Unit)?
    var loading: Any? /* Boolean | SpinProps */
    var locale: TableLocale?
    var indentSize: Number?
    var onRowClick: ((record: T, index: Number, event: Event) -> Unit)?
    var onRow: ((record: T, index: Number) -> TableEventListeners)?
    var onHeaderRow: ((columns: Array<ColumnProps<T>>) -> TableEventListeners)?
    var useFixedHeader: Boolean?
    var bordered: Boolean?
    var showHeader: Boolean?
    var footer: ((currentPageData: Array<Object>) -> Any /* String | ReactElement */)?
    var title: ((currentPageData: Array<Object>) -> Any /* String | ReactElement */)?
    var scroll: TableScroll?
    var childrenColumnName: String?
    var bodyStyle: dynamic
    var className: String?
    var style: dynamic
    var children: ReactElement?
    var sortDirections: Array<SortOrder>?
}

external interface TableState<T> : RState {
    var pagination: PaginationConfig
    var filters: TableStateFilters
    var sortColumn: ColumnProps<T>?
    var sortOrder: SortOrder?
    var pivot: Number?
}

external interface ExpandIconProps<T> {
    var prefixCls: String
    var expanded: Boolean
    var record: T
    var needIndentSpaced: Boolean
    var expandable: Boolean
    var onExpand: (record: T, event: MouseEvent) -> Unit
}

external interface TableScroll {
    var x: Any? /* Boolean | Number | String */
    var y: Any? /* Boolean | Number | String */
}

external interface TableCurrentDataSource<T> {
    var currentDataSource: Array<T>
}

external interface SorterResult<T> {
    var column: ColumnProps<T>
    var order: SortOrder
    var field: String
    var columnKey: String
}

external interface TableRowSelection<T> {
    var type: RowSelectionType?
    var selectedRowKeys: Any? /* Array<String> | Array<Number> */
    var onChange: ((selectedRowKeys: Array<Any/* String | Number */>?, selectedRows: Array<T>) -> Unit)?
    var getCheckboxProps: ((record: T) -> Object)?
    var onSelect: SelectionSelectFn<T>?
    var onSelectMultiple: ((selected: Boolean, selectedRows: Array<T>, changeRows: Array<T>) -> Unit)?
    var onSelectAll: ((selected: Boolean, selectedRows: Array<T>, changeRows: Array<T>) -> Unit)?
    var onSelectInvert: ((selectedRowKeys: Any? /* Array<String> | Array<Number> */) -> Unit)?
    var selections: Any? /* Array<SelectionItem> | Boolean */
    var hideDefaultSelections: Boolean?
    var fixed: Boolean?
    var columnWidth: Any? /* String | Number */
    var selectWay: TableSelectWay?
    var columnTitle: Any? /* String | ReactElement */
}

external interface TableEventListeners {
    var onClick: ((arg: SyntheticEvent<Any, Event>) -> Unit)?
    var onDoubleClick: ((arg: SyntheticEvent<Any, Event>) -> Unit)?
    var onContextMenu: ((arg: SyntheticEvent<Any, Event>) -> Unit)?
    var onMouseEnter: ((arg: SyntheticEvent<Any, Event>) -> Unit)?
    var onMouseLeave: ((arg: SyntheticEvent<Any, Event>) -> Unit)?
    /* [name: String]: Any */
}

external interface TableComponents {
    var table: Any?
    var header: TableComponentsHeader?
    var body: TableComponentsBody?
}

external interface TableComponentsHeader {
    var wrapper: Any?
    var row: Any?
    var cell: Any?
}

external interface TableComponentsBody {
    var wrapper: Any?
    var row: Any?
    var cell: Any?
}

external interface TableStateFilters {
    /* [key: String]: Array<String>? */
}

external interface AdditionalCellProps {
    var onClick: MouseEventHandler<HTMLElement>?
    /* [name: String]: Any */
}

external interface PrepareParamsArgumentsItem<T> {
    var currentDataSource: Array<T>
}

external interface TableLocale {
    var filterTitle: String?
    var filterConfirm: Any? /* String | ReactElement */
    var filterReset: Any? /* String | ReactElement */
    var emptyText: Any? /* String | ReactElement | (() => String | ReactElement) */
    var selectAll: Any? /* String | ReactElement */
    var selectInvert: Any? /* String | ReactElement */
    var sortTitle: String?
}

external fun flatArray(data:Array<Any> = definedExternally, childrenName: String = definedExternally): Array<Any>
external fun <Node> treeMap(tree: Array<Node>, mapper: (node: Node, index: Number) -> Any, childrenName: String = definedExternally): Any
external fun flatFilter(tree: Array<Any>, callback: Function<Any>): Any
external fun normalizeColumns(elements: Any /* Array<Any> | Array<ReactElement> */): Array<Any>
external fun generateValueMaps(items: Array<ColumnFilterItem>? = definedExternally, maps: Any /* { [name: String]: Any } */): Any
