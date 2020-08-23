@file:JsModule("antd/lib/transfer")
@file:JsNonModule

package antd.transfer

import antd.ChangeEventHandler
import antd.SyntheticEvent
import kotlinext.js.Object
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object TransferComponent : Component<TransferProps, RState> {
    val List: TransferListComponent
    val Operation: TransferOperationComponent
    val Search: TransferSearchComponent

    override fun render(): ReactElement?
}

external interface TransferProps : RProps {
    var prefixCls: String?
    var className: String?
    var disabled: Boolean?
    var dataSource: Array<TransferItem>?
    var targetKeys: Array<String>?
    var selectedKeys: Array<String>?
    var render: TransferRender?
    var onChange: ((targetKeys: Array<String>, direction: String, moveKeys: Array<String>) -> Unit)?
    var onSelectChange: ((sourceSelectedKeys: Array<String>, targetSelectedKeys: Array<String>) -> Unit)?
    var style: dynamic
    var listStyle: dynamic
    var operationStyle: dynamic
    var titles: Array<String>?
    var operations: Array<String>?
    var showSearch:  Boolean?
    var filterOption: ((inputValue: String, item: TransferItem) -> Boolean)?
    var searchPlaceholder: String?
    var notFoundContent: Any? /* String | ReactElement */
    var locale: Object?
    var footer: ((props: TransferListProps) -> Any /* String | ReactElement */)?
    var body: ((props: TransferListProps) -> Any /* String | ReactElement */)?
    var rowKey: ((record: TransferItem) -> String)?
    var onSearchChange: ((direction: TransferDirection, e: ChangeEventHandler<HTMLInputElement>) -> Unit)?
    var onSearch: ((direction: TransferDirection, value: String) -> Unit)?
    var lazy: Any? /* Object | Boolean */
    var onScroll: ((direction: TransferDirection, e: SyntheticEvent<HTMLDivElement, Event>) -> Unit)?
    var children: ((props: TransferListBodyProps) -> ReactElement)?
    var showSelectAll: Boolean?
}

external interface TransferItem {
    var key: String
    var title: String
    var description: String?
    var disabled: Boolean?
    /* [name: String]: Any */
}

external interface RenderResultObject {
    var label: Any /* String | ReactElement */
    var value: String
}

external interface TransferLocale {
    var titles: Array<String>
    var notFoundContent: String
    var searchPlaceholder: String
    var itemUnit: String
    var itemsUnit: String
}
