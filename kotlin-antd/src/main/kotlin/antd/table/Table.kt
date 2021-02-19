@file:JsModule("antd/lib/table")
@file:JsNonModule

package antd.table

import antd.*
import antd.checkbox.CheckboxProps
import antd.configprovider.SizeType
import antd.pagination.*
import org.w3c.dom.*
import react.*
import react.Component

@JsName("default")
external class TableComponent<RecordType> : Component<TableProps<RecordType>, RState> {
    companion object {
        val Column: ColumnComponent<*>
        val ColumnGroup: ColumnGroupComponent<*>
        val Summary: Summary
    }

    override fun render(): ReactElement?
}

external interface TableProps<RecordType> : RcTableProps<RecordType>, RProps {
    var dropdownPrefixCls: String?
    var dataSource: Array<RecordType>?
    override var columns: ColumnsType<RecordType>?
    var pagination: Any? /* Boolean | TablePaginationConfig */
    var loading: Any? /* Boolean | SpinProps */
    var size: SizeType?
    var bordered: Boolean?
    var locale: TableLocale?
    var onChange: ((pagination: TablePaginationConfig, filters: Map<String, Array<String?>>, sorter: Any /* SorterResult<RecordType> | Array<SorterResult<RecordType>> */, extra: TableCurrentDataSource<RecordType>) -> Unit)?
    var rowSelection: TableRowSelection<RecordType>?
    var getPopupContainer: GetPopupContainer?
    override var scroll: TablePropsScroll?
    var sortDirections: Array<SortOrder>?
    var showSorterTooltip: Boolean?
}

external interface TablePropsScroll : RcTablePropsScroll {
    var scrollToFirstRowOnChange: Boolean?
}

external interface ColumnGroupType<RecordType> : ColumnType<RecordType> {
    var children: ColumnsType<RecordType>
}

external interface ColumnType<RecordType> : RcColumnType<RecordType> {
    override var title: ColumnTitle<RecordType>?
    var sorter: Any? /* Boolean | CompareFn<RecordType> | ColumnTypeSorter<RecordType> */
    var sortOrder: SortOrder?
    var defaultSortOrder: SortOrder?
    var sortDirections: Array<SortOrder>?
    var showSorterTooltip: Boolean?
    var filtered: Boolean?
    var filters: Array<ColumnFilterItem>?
    var filterDropdown: Any? /* String | ReactElement | (props: FilterDropdownProps) -> Any /* String | ReactElement */ */
    var filterMultiple: Boolean?
    var filteredValue: Array<Key>?
    var defaultFilteredValue: Array<Key>?
    var filterIcon: Any? /* String | ReactElement | (filtered: Boolean) -> Any /* String | ReactElement */ */
    var onFilter: ((value: Any /* String | Number | Boolean */, record: RecordType) -> Boolean)?
    var filterDropdownVisible: Boolean?
    var onFilterDropdownVisibleChange: ((visible: Boolean) -> Unit)?
    var responsive: Array<Breakpoint>?
}

external interface ColumnTypeSorter<RecordType> {
    var compare: CompareFn<RecordType>?
    var multiple: Number?
}

external interface SelectionItem {
    var key: String
    var text: Any /* String | ReactElement */
    var onSelect: SelectionItemSelectFn?
}

external interface TableLocale {
    var filterTitle: String?
    var filterConfirm: Any? /* String | ReactElement */
    var filterReset: Any? /* String | ReactElement */
    var filterEmptyText: Any? /* String | ReactElement */
    var emptyText: Any? /* String | ReactElement | () -> Any /* String | ReactElement */ */
    var selectAll: Any? /* String | ReactElement */
    var selectInvert: Any? /* String | ReactElement */
    var selectionAll: Any? /* String | ReactElement */
    var sortTitle: String?
    var expand: String?
    var collapse: String?
    var triggerDesc: String?
    var triggerAsc: String?
    var cancelSort: String?
}

external interface ColumnFilterItem {
    var text: Any /* String | ReactElement */
    var value: Any /* String | Number | Boolean */
    var children: Array<ColumnFilterItem>?
}

external interface ColumnTitleProps<RecordType> {
    var sortOrder: SortOrder?
    var sortColumn: ColumnType<RecordType>?
    var sortColumns: Array<ColumnTitlePropsSortColumn<RecordType>>?
    var filters: Map<String, Array<String>>?
}

external interface ColumnTitlePropsSortColumn<RecordType> {
    var column: ColumnType<RecordType>
    var order: SortOrder
}

external interface FilterDropdownProps {
    var prefixCls: String
    var setSelectedKeys: (selectedKeys: Array<Key>) -> Unit
    var selectedKeys: Array<Key>
    var confirm: () -> Unit
    var clearFilters: (() -> Unit)?
    var filters: Array<ColumnFilterItem>?
    var visible: Boolean
}

external interface TableCurrentDataSource<RecordType> {
    var currentDataSource: Array<RecordType>
    var action: TableAction
}

external interface SorterResult<RecordType> {
    var column: ColumnType<RecordType>?
    var order: SortOrder?
    var field: Any? /* Key | Array<Key> */
    var columnKey: Key?
}

external interface TableRowSelection<T> {
    var preserveSelectedRowKeys: Boolean?
    var type: RowSelectionType?
    var selectedRowKeys: Array<Key>?
    var onChange: ((selectedRowKeys: Array<Key>, selectedRows: Array<T>) -> Unit)?
    var getCheckboxProps: ((record: T) -> CheckboxProps)?
    var onSelect: SelectionSelectFn<T>?
    var onSelectMultiple: ((selected: Boolean, selectedRows: Array<T>, changeRows: Array<T>) -> Unit)?
    var onSelectAll: ((selected: Boolean, selectedRows: Array<T>, changeRows: Array<T>) -> Unit)?
    var onSelectInvert: ((selectedRowKeys: Array<Key>) -> Unit)?
    var selections: Any? /* Array<INTERNAL_SELECTION_ITEM> | Boolean */
    var hideSelectAll: Boolean?
    var fixed: Boolean?
    var columnWidth: Any? /* String | Number */
    var columnTitle: Any? /* String | ReactElement */
    var checkStrictly: Boolean?
    var renderCell: ((value: Boolean, record: T, index: Number, originNode: Any /* String | ReactElement */) -> Any /* String | ReactElement  | RcRenderedCell<T> */)?
}

external interface TablePaginationConfig : PaginationProps {
    var position: Array<TablePaginationPosition>?
}


external interface RcTableProps<RecordType> : LegacyExpandableProps<RecordType> {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var children: Any? /* String | ReactElement */
    var data: Array<RecordType>
    var columns: ColumnsType<RecordType>?
    var rowKey: Any /* String | GetRowKey<RecordType> */
    var tableLayout: TableLayout?
    var scroll: TablePropsScroll?
    var expandable: ExpandableConfig<RecordType>?
    override var indentSize: Number?
    var rowClassName: Any? /* String | RowClassName<RecordType> */
    var title: PanelRender<RecordType>?
    var footer: PanelRender<RecordType>?
    var summary: ((data: Array<RecordType>) -> Any /* String | ReactElement */)?
    var id: String?
    var showHeader: Boolean?
    var components: TableComponents<RecordType>?
    var onRow: GetComponentProps<RecordType>?
    var onHeaderRow: GetComponentProps<Array<ColumnType<RecordType>>>?
    var emptyText: Any? /* String | ReactElement | () -> Any /* String | ReactElement */ */
    var direction: String? /* "ltr" | "rtl" */
    var internalHooks: String?
    var transformColumns: ((columns: ColumnsType<RecordType>) -> ColumnsType<RecordType>)?
    var internalRefs: RcTablePropsInternalRefs?
    var sticky: Any? /* Boolean | TableSticky */
}

external interface RcTablePropsScroll {
    var x: Any? /* Number | Boolean | String */
    var y: Any? /* Number | String */
}

external interface RcTablePropsInternalRefs {
    var body: RMutableRef<HTMLDivElement>
}

external interface RenderedCell<RecordType> {
    var props: CellType<RecordType>?
    var children: Any? /* String | ReactElement */
}

external interface CellType<RecordType> {
    var key: Key?
    var className: String?
    var style: dynamic
    var children: Any? /* String | ReactElement */
    var column: ColumnsType<RecordType>?
    var colSpan: Number?
    var rowSpan: Number?
    var hasSubColumns: Boolean?
    var colStart: Number?
    var colEnd: Number?
}

external interface TableComponents<RecordType> {
    var table: CustomizeComponent?
    var header: TableComponentsHeader?
    var body: Any /* CustomizeScrollBody<RecordType> | TableComponentsBody */
}

external interface TableComponentsHeader {
    var wrapper: CustomizeComponent?
    var row: CustomizeComponent?
    var cell: CustomizeComponent?
}

external interface TableComponentsBody {
    var wrapper: CustomizeComponent?
    var row: CustomizeComponent?
    var cell: CustomizeComponent?
}

external interface LegacyExpandableProps<RecordType> {
    var expandedRowKeys: Array<Key>?
    var defaultExpandedRowKeys: Array<Key>?
    var expandedRowRender: ExpandedRowRender<RecordType>?
    var expandRowByClick: Boolean?
    var expandIcon: RenderExpandIcon<RecordType>?
    var onExpand: ((expanded: Boolean, record: RecordType) -> Unit)?
    var onExpandedRowsChange: ((expandedKeys: Array<dynamic>) -> Unit)?
    var defaultExpandAllRows: Boolean?
    var indentSize: Number?
    var expandIconColumnIndex: Number?
    var expandedRowClassName: RowClassName<RecordType>?
    var childrenColumnName: String?
}

external interface RcColumnType<RecordType> : ColumnSharedType<RecordType> {
    var colSpan: Number?
    var dataIndex: DataIndex?
    var render: ((value: Any, record: RecordType, index: Number) -> Any /* String | ReactElement | RenderedCell<RecordType> */)?
    var shouldCellUpdate: ((record: RecordType, prevRecord: RecordType) -> Boolean)?
    var rowSpan: Number?
    var width: Any /* Number | String */
    var onCell: GetComponentProps<RecordType>?
    var onCellClick: ((record: RecordType, e: MouseEvent<HTMLElement>) -> Unit)?
}

external interface RcColumnGroupType<RecordType> : ColumnSharedType<RecordType> {
    var children: ColumnsType<RecordType>
}

external interface ColumnSharedType<RecordType> {
    var title: Any? /* String | ReactElement */
    var key: Key?
    var className: String?
    var fixed: FixedType?
    var onHeaderCell: GetComponentProps<ColumnsType<RecordType>>?
    var ellipsis: Any /* CellEllipsisType | Boolean */
    var align: AlignType?
}

external interface CellEllipsisType {
    var showTitle: Boolean?
}

external interface RenderExpandIconProps<RecordType> {
    var prefixCls: String
    var expanded: Boolean
    var record: RecordType
    var expandable: Boolean
    var onExpand: TriggerEventHandler<RecordType>
}

external interface ExpandableConfig<RecordType> {
    var expandedRowKeys: Array<Key>?
    var defaultExpandedRowKeys: Array<Key>?
    var expandedRowRender: ExpandedRowRender<RecordType>?
    var expandRowByClick: Boolean?
    var expandIcon: RenderExpandIcon<RecordType>?
    var onExpand: ((expanded: Boolean, record: RecordType) -> Unit)?
    var onExpandedRowsChange: ((expandedKeys: Array<Key>) -> Unit)?
    var defaultExpandAllRows: Boolean?
    var indentSize: Number?
    var expandIconColumnIndex: Number?
    var expandedRowClassName: RowClassName<RecordType>?
    var childrenColumnName: String?
    var rowExpandable: ((record: RecordType) -> Boolean)?
}
