package antd.transfer

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

external class TransferListComponent<RecordType : KeyWiseTransferItem> : PureComponent<TransferListProps<RecordType>, TransferListState> {
    override fun render(): ReactElement?
}

external interface TransferListProps<RecordType> : TransferLocale, Props {
    var prefixCls: String
    var titleText: String
    var dataSource: Array<RecordType>
    var filterOption: ((filterText: String, item: RecordType) -> Boolean)?
    var style: dynamic
    var checkedKeys: Array<String>
    var handleFilter: (e: ChangeEvent<HTMLInputElement>) -> Unit
    var onItemSelect: (key: String, check: Boolean) -> Unit
    var onItemSelectAll: (dataSource: Array<String>, checkAll: Boolean) -> Unit
    var onItemRemove: ((keys: Array<String>) -> Unit)?
    var handleClear: () -> Unit
    var render: ((item: RecordType) -> RenderResult)?
    var showSearch: Boolean?
    override var searchPlaceholder: String
    override var itemUnit: String
    override var itemsUnit: String
    var renderList: RenderListFunction<RecordType>?
    var footer: ((props: TransferListProps<RecordType>) -> ReactNode)?
    var onScroll: ((e: UIEvent<HTMLUListElement>) -> Unit)?
    var disabled: Boolean?
    var direction: TransferDirection
    var showSelectAll: Boolean?
    var selectAllLabel: SelectAllLabel?
    var showRemove: Boolean?
    var pagination: Any? /* Boolean | PaginationType */
}

external interface TransferListState : State {
    var filterValue: String
}

external interface RenderedItem<RecordType> {
    var renderedText: String
    var renvderedEl: ReactNode
    var item: RecordType
}
