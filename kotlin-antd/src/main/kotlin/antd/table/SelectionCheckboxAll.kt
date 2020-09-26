package antd.table

import react.*

external class SelectionCheckboxAllComponent<T> : Component<SelectionCheckboxAllProps<T>, SelectionCheckboxAllState> {
    override fun render(): ReactElement?
}

external interface SelectionCheckboxAllProps<T> : RProps {
    var store: Store
    var locale: TableLocale
    var disabled: Boolean
    var getCheckboxPropsByItem: (item: T, index: Number) -> CheckboxPropsItem
    var getRecordKey: (record: T, index: Number?) -> String
    var data: Array<T>
    var prefixCls: String?
    var onSelect: (key: String, index: Number, selectFunc: Any) -> Unit
    var hideDefaultSelections: Boolean?
    var selections: Any? /* Array<SelectionItem> | Boolean */
    var getPopupContainer: GetPopupContainer?
}

external interface SelectionCheckboxAllState : RState {
    var checked: Boolean?
    var indeterminate: Boolean?
}

external interface CheckboxPropsItem {
    var defaultChecked: Boolean
}

external interface SelectionItem {
    var key: String
    var text: Any /* String | ReactElement */
    var onSelect: SelectionItemSelectFn
}
