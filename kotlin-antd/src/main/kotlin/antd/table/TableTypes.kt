package antd.table

import antd.HTMLAttributes
import antd.Key
import antd.MouseEvent
import antd.ReactNode
import kotlinext.js.Object
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event

typealias RowSelectionType = String /* "checkbox" | "radio" */
typealias SelectionItemSelectFn = (currentRowKeys: Array<Key>) -> Unit
typealias ExpandType = String /* "row" | "nest" */
typealias SortOrder = String /* "descend" | "ascend" */
typealias TableAction = String /* "paginate" | "sort" | "filter" */
typealias CompareFn<T> = (a: T, b: T, sortOrder: SortOrder?) -> Number
typealias ColumnTitle<RecordType> = Any /* String | ReactElement | (props: ColumnTitleProps<RecordType>) -> ReactNode */
typealias ColumnsType<RecordType> = Array<Any /* ColumnGroupType<RecordType> | ColumnType<RecordType> */>
typealias SelectionSelectFn<T> = (record: T, selected: Boolean, selectedRows: Array<Object>, nativeEvent: Event) -> Unit
typealias TransformColumns<RecordType> = (columns: ColumnsType<RecordType>) -> ColumnsType<RecordType>
typealias GetPopupContainer = (triggerNode: HTMLElement) -> HTMLElement
typealias TablePaginationPosition = String /* "topLeft" | "topCenter" | "topRight" | "bottomLeft" | "bottomCenter" | "bottomRight" */


typealias FixedType = Any /* "left" | "right" | String | Boolean */
typealias TableLayout = String /* "auto" | "fixed" */
typealias RowClassName<RecordType> = (record: RecordType, index: Number, indent: Number) -> String
typealias GetRowKey<RecordType> = (record: RecordType, index: Number?) -> dynamic
typealias DataIndex = Any /* String | Number | Array<Any /* String | Number */> */
typealias AlignType = String /* "left" | "center" | "right" */
typealias GetComponentProps<DataType> = (data: DataType, index: Number) -> HTMLAttributes<HTMLElement>
typealias Component<P> = Any /* RClass<P> | FunctionalComponent<P> */
typealias CustomizeComponent = Component<Any>
typealias ExpandedRowRender<ValueType> = (record: ValueType, index: Number, indent: Number, expanded: Boolean) -> ReactNode
typealias RenderExpandIcon<RecordType> = (props: RenderExpandIconProps<RecordType>) -> ReactNode
typealias PanelRender<RecordType> = (data: Array<RecordType>) -> ReactNode
typealias TriggerEventHandler<RecordType> = (record: RecordType, event: MouseEvent<HTMLElement>) -> Unit
