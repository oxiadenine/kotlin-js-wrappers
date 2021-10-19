@file:JsModule("antd/lib/list")
@file:JsNonModule

package antd.list

import antd.ReactNode
import react.*

@JsName("default")
external class ListComponent<T> : Component<ListProps<T>, State> {
    companion object {
        val Item: ItemComponent
    }

    override fun render(): ReactElement?
}

external val listContext: Context<ListConsumerProps>
external val listConsumer: Consumer<ListConsumerProps>

external interface ListProps<T> : Props {
    var bordered: Boolean?
    var className: String?
    var style: dynamic
    var children: ReactNode?
    var dataSource: Array<T>?
    var extra: ReactNode?
    var grid: ListGridType?
    var id: String?
    var itemLayout: ListItemLayout?
    var loading: Any? /* Boolean | SpinProps */
    var loadMore: ReactNode?
    var pagination: Any? /* PaginationConfig | Boolean */
    var prefixCls: String?
    var rowKey: Any? /* (item: T) -> String | String */
    var renderItem: ((item: T, index: Number) -> ReactNode)?
    var size: ListSize?
    var split: Boolean?
    var header: ReactNode?
    var footer: ReactNode?
    var locale: ListLocale?
}

external interface ListGridType {
    var gutter: Number?
    var column: ColumnCount?
    var xs: ColumnCount?
    var sm: ColumnCount?
    var md: ColumnCount?
    var lg: ColumnCount?
    var xl: ColumnCount?
    var xxl: ColumnCount?
}

external interface ListLocale {
    var emptyText: Any /* ReactNode | () -> ReactNode */
}

external interface ListConsumerProps {
    var grid: Any
    var itemLayout: String?
}
