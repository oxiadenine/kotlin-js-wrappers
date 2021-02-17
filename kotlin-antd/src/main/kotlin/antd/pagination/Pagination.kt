@file:JsModule("antd/lib/pagination")
@file:JsNonModule

package antd.pagination

import kotlinext.js.*
import react.*

@JsName("default")
external object PaginationComponent : Component<PaginationProps, RState> {
    override fun render(): ReactElement?
}

external interface PaginationProps : RProps {
    var total: Number?
    var defaultCurrent: Number?
    var disabled: Boolean?
    var current: Number?
    var defaultPageSize: Number?
    var pageSize: Number?
    var onChange: ((page: Number, pageSize: Number?) -> Unit)?
    var hideOnSinglePage: Boolean?
    var showSizeChanger: Boolean?
    var pageSizeOptions: Array<String>?
    var onShowSizeChange: ((current: Number, size: Number) -> Unit)?
    var showQuickJumper: Any? /* Boolean | ShowQuickJumper */
    var showTitle: Boolean?
    var showTotal: ((total: Number, range: Array<Number>) -> Any /* String | ReactElement */)?
    var size: String? /* "default" | "small */
    var simple: Boolean?
    var style: dynamic
    var locale: Object?
    var className: String?
    var prefixCls: String?
    var selectPrefixCls: String?
    var itemRender: ((page: Number, type: String /* "page" | "prev" | "next" | "jump-prev" | "jump-next" */, originalElement: ReactElement) -> Any /* String | ReactElement */)?
    var role: String?
    var showLessItems: Boolean?
}

external interface ShowQuickJumper {
    var goButton: Any? /* String | ReactElement */
}

external interface PaginationConfig : PaginationProps {
    var position: PaginationPosition?
}
