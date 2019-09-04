package antd.table

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object FilterMenuComponent : Component<FilterMenuProps<Any>, FilterMenuState<Any>> {
    override fun render(): ReactElement?
}

external interface FilterMenuProps<T> : RProps {
    var locale: TableLocale
    var selectedKeys: Array<String>
    var column: ColumnProps<T>
    var confirmFilter: (column: ColumnProps<T>, selectedKeys: Array<String>) -> Any
    var prefixCls: String
    var dropdownPrefixCls: String
    var getPopupContainer: GetPopupContainer?
}

external interface FilterMenuState<T> : RState {
    var selectedKeys: Array<String>
    var valueKeys: ValueKeys
    var keyPathOfSelectedItem: KeyPathOfSelectedItem
    var visible: Boolean?
    var prevProps: FilterMenuProps<T>
}

external interface ValueKeys {
    /* [name: String]: String */
}

external interface KeyPathOfSelectedItem {
    /* [key: String]: String */
}
