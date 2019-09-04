package antd.transfer

import antd.ChangeEvent
import org.w3c.dom.HTMLInputElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TransferListComponent : Component<TransferListProps, TransferListState> {
    override fun render(): ReactElement?
}

external interface TransferListProps : RProps {
    var prefixCls: String
    var titleText: String
    var dataSource: Array<TransferItem>
    var filterOption: ((filterText: String, item: TransferItem) -> Boolean)?
    var style: dynamic
    var checkedKeys: Array<String>
    var handleFilter: (e: ChangeEvent<HTMLInputElement>) -> Unit
    var handleSelect: (selectedItem: TransferItem, checked: Boolean) -> Unit
    var handleSelectAll: (dataSource: Array<TransferItem>, checkAll: Boolean) -> Unit
    var onItemSelect: (key: String, check: Boolean) -> Unit
    var onItemSelectAll: (dataSource: Array<String>, checkAll: Boolean) -> Unit
    var handleClear: () -> Unit
    var render: ((item: TransferItem) -> RenderResult)?
    var showSearch: Boolean?
    var searchPlaceholder: String
    var notFoundContent: Any /* String | ReactElement */
    var itemUnit: String
    var itemsUnit: String
    var body: ((props: TransferListProps) -> ReactElement)?
    var renderList: RenderListFunction?
    var footer: ((props: TransferListProps) -> ReactElement)?
    var lazy: Any? /* Boolean | Object */
    var onScroll: Function<Any>
    var disabled: Boolean?
    var direction: TransferDirection
    var showSelectAll: Boolean?
}

external interface TransferListState : RState {
    var filterValue: String
}

external interface TransferListBodyProps : TransferListProps {
    var filteredItems: Array<TransferItem>
    var filteredRenderItems: Array<RenderedItem>
    var selectedKeys: Array<String>
}

external interface RenderedItem {
    var renderedText: String
    var renvderedEl: Any /* String | ReactElement */
    var item: TransferItem
}
