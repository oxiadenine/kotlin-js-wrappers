@file:JsModule("antd/lib/transfer")
@file:JsNonModule

package antd.transfer

import antd.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import react.*

@JsName("default")
external class TransferComponent<RecordType : TransferItem> : Component<TransferProps<RecordType>, TransferState> {
    companion object {
        val List: TransferListComponent<TransferItem>
        val Operation: TransferOperationComponent
        val Search: TransferSearchComponent
    }

    override fun render(): ReactElement?
}

external interface TransferProps<RecordType> : RProps {
    var prefixCls: String?
    var className: String?
    var disabled: Boolean?
    var dataSource: Array<RecordType>?
    var targetKeys: Array<String>?
    var selectedKeys: Array<String>?
    var render: TransferRender<RecordType>?
    var onChange: ((targetKeys: Array<String>, direction: TransferDirection, moveKeys: Array<String>) -> Unit)?
    var onSelectChange: ((sourceSelectedKeys: Array<String>, targetSelectedKeys: Array<String>) -> Unit)?
    var style: dynamic
    var listStyle: Any /* (style: ListStyle) -> dynamic | Object */
    var operationStyle: dynamic
    var titles: Array<String>?
    var operations: Array<String>?
    var showSearch: Boolean?
    var filterOption: ((inputValue: String, item: RecordType) -> Boolean)?
    var locale: TransferLocale?
    var footer: ((props: TransferListProps<RecordType>) -> ReactNode)?
    var rowKey: ((record: RecordType) -> String)?
    var onSearch: ((direction: TransferDirection, value: String) -> Unit)?
    var onScroll: ((direction: TransferDirection, e: SyntheticEvent<HTMLUListElement, Event>) -> Unit)?
    var children: ((props: TransferListBodyProps<RecordType>) -> ReactNode)?
    var showSelectAll: Boolean?
    var selectAllLabels: Array<SelectAllLabel>?
    var oneWay: Boolean?
    var pagination: PaginationType?
}

external interface TransferState : RState {
    var sourceSelectedKeys: Array<String>
    var targetSelectedKeys: Array<String>
}

external interface TransferItem {
    var key: String?
    var title: String?
    var description: String?
    var disabled: Boolean?
}

external interface RenderResultObject {
    var label: ReactNode
    var value: String
}

external interface KeyWise<T> {
    var key: String
}

external interface ListStyle {
    var direction: TransferDirection
}

external interface TransferLocale {
    var titles: Array<String>
    var notFoundContent: ReactNode
    var searchPlaceholder: String
    var itemUnit: String
    var itemsUnit: String
    var remove: String
    var selectAll: String
    var selectCurrent: String
    var selectInvert: String
    var removeAll: String
    var removeCurrent: String
}

external interface PaginationType {
    var pageSize: Number?
}

external interface SelectAllLabelInfo {
    var selectedCount: Number
    var totalCount: Number
}
