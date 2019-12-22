package antd.table

import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external class ColumnComponent<T> : Component<ColumnProps<T>, RState> {
    override fun render(): ReactElement?
}

external interface ColumnProps<T> : RProps {
    var title: Any? /* String | ReactElement | ColumnTitleFn */
    var key: String?
    var dataIndex: String?
    var render: ((text: Any, record: T, index: Number) -> Any)? /* String | ReactElement */
    var align: ColumnPropsAlign?
    var filters: Array<ColumnFilterItem>?
    var onFilter: ((value: Any, record: T) -> Boolean)?
    var filterMultiple: Boolean?
    var filterDropdown: Any? /* ReactElement | ColumnFilterDropdownFn */
    var filterDropdownVisible: Boolean?
    var onFilterDropdownVisibleChange: ((visible: Boolean) -> Unit)?
    var sorter: Any? /* Boolean | CompareFn<T> */
    var defaultSortOrder: SortOrder?
    var colSpan: Number?
    var width: Any? /* String | Number */
    var className: String?
    var fixed: Any? /* Boolean | ColumnPropsFixed */
    var filterIcon: Any? /* ReactElement | ColumnFilterIconFn */
    var filteredValue: Array<Any>?
    var sortOrder: Any? /* SortOrder | Boolean */
    var children: Array<ColumnProps<T>>?
    var onCellClick: ((record: T, event: Event) -> Unit)?
    var onCell: ((record: T, rowIndex: Number) -> TableEventListeners)?
    var onHeaderCell: ((props: ColumnProps<T>) -> TableEventListeners)?
    var sortDirections: Array<SortOrder>?
}

external interface ColumnFilterOptions {
    var filters: TableStateFilters
    var sorvtOrder: SortOrder?
}

external interface ColumnFilterItem {
    var text: Any /* String | ReactElement */
    var value: String
    var children: Array<ColumnFilterItem>?
}

external interface FilterDropdownProps {
    var prefixCls: String?
    var setSelectedKeys: ((selectedKeys: Array<String>) -> Unit)?
    var selectedKeys: Array<String>?
    var confirm: (() -> Unit)?
    var clearFilters: ((selectedKeys: Array<String>) -> Unit)?
    var filters: Array<ColumnFilterItem>?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
}
