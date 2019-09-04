package antd.table

import kotlinext.js.Object
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.ReactElement

typealias TableSize = String /* "default" | "middle" | "small" */
typealias TableSelectWay = String /* "onSelect" | "onSelectMultiple" | "onSelectAll" | "onSelectInvert" */
typealias RowSelectionType = String /* "checkbox" | "radio" */
typealias SortOrder = String /* "descend" | "ascend" */

typealias RowKeyFn<T> = (record: T, index: Number) -> String
typealias CompareFn<T> = (a: T, b: T, sortOrder: SortOrder?) -> Number
typealias GetPopupContainer = (triggerNode: HTMLElement?) -> HTMLElement
typealias PrepareParamsArgumentsReturn<T> = Array<T /* Array<String> | Object | PrepareParamsArgumentsItem<T> */>

typealias SelectionSelectFn<T> = (record: T, selected: Boolean, selectedRows: Array<Object>, nativeEvent: Event) -> Unit
typealias SelectionItemSelectFn = (key: Array<String>) -> Unit

typealias ColumnPropsAlign = String /* "left" | "right" | "center" */
typealias ColumnPropsFixed = String /* "left" | "right" */

typealias ColumnTitleFn = (options: ColumnFilterOptions) -> Any /* String | ReactElement */
typealias ColumnFilterDropdownFn = (props: FilterDropdownProps) -> ReactElement
typealias ColumnFilterIconFn = (filtered: Boolean) -> ReactElement
