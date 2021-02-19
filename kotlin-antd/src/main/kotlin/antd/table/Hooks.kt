package antd.table

@JsModule("antd/lib/table/hooks/useSorter")
@JsNonModule
@JsName("getSortData")
external fun <RecordType> getSortData(data: Array<RecordType>, sortStates: Array<SortState<RecordType>>, childrenColumnName: String): Array<RecordType>

@JsModule("antd/lib/table/hooks/useSorter")
@JsNonModule
@JsName("default")
external fun <RecordType> useFilterSorter(config: SorterConfig<RecordType>): Array<Any /* TransformColumns<RecordType> | Array<SortState<RecordType>> | ColumnTitleProps<RecordType> | () -> Any /* SorterResult<RecordType> | Array<SorterResult<RecordType>> */ */>

@JsModule("antd/lib/table/hooks/useTitleColumns")
@JsNonModule
@JsName("default")
external fun <RecordType> useTitleColumns(columnTitleProps: ColumnTitleProps<RecordType>): Array<TransformColumns<RecordType>>

@JsModule("antd/lib/table/hooks/useSelection")
@JsNonModule
@JsName("default")
external fun <RecordType> useSelection(rowSelection: TableRowSelection<RecordType>? = definedExternally, config: UseSelectionConfig<RecordType>): Array<Any /* TransformColumns<RecordType> | Set<Key> */>

@JsModule("antd/lib/table/hooks/usePagination")
@JsNonModule
@JsName("getPaginationParam")
external fun getPaginationParam(pagination: Any? /* TablePaginationConfig | Boolean */ = definedExternally, mergedPagination: TablePaginationConfig): Any

@JsModule("antd/lib/table/hooks/usePagination")
@JsNonModule
@JsName("default")
external fun usePagination(total: Number, pagination: Any? /* TablePaginationConfig | Boolean */ = definedExternally, onChange: (current: Number, pageSize: Number) -> Unit): Array<Any /* TablePaginationConfig | () -> Unit */>

@JsModule("antd/lib/table/hooks/useLazyKVMap")
@JsNonModule
@JsName("default")
external fun <RecordType> useLazyKVMap(data: Array<RecordType>, childrenColumnName: String, getRowKey: GetRowKey<RecordType>): Array<(key: Key) -> RecordType>

external interface SortState<RecordType> {
    var column: ColumnType<RecordType>
    var key: Key
    var sortOrder: SortOrder?
    var multiplePriority: Any /* Number | Boolean */
}

external interface SorterConfig<RecordType> {
    var prefixCls: String
    var mergedColumns: ColumnsType<RecordType>
    var onSorterChange: (sorterResult: Any /* SorterResult<RecordType> | Array<SorterResult<RecordType>> */, sortStates: Array<SortState<RecordType>>) -> Unit
    var sortDirections: Array<SortOrder>
    var tableLocale: TableLocale?
    var showSorterTooltip: Boolean?
}

external interface UseSelectionConfig<RecordType> {
    var prefixCls: String
    var pageData: Array<RecordType>
    var data: Array<RecordType>
    var getRowKey: GetRowKey<RecordType>
    var getRecordByKey: (key: Key) -> RecordType
    var expandType: ExpandType
    var childrenColumnName: String
    var expandIconColumnIndex: Number?
    var locale: TableLocale
    var getPopupContainer: GetPopupContainer?
}

typealias INTERNAL_SELECTION_ITEM = Any /* SelectionItem | "SELECT_ALL" | "SELECT_INVERT" */
