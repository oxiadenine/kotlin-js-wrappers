package antd.table

import org.w3c.dom.events.*
import react.*

external object SelectionBoxComponent : Component<SelectionBoxProps, SelectionBoxState> {
    override fun render(): ReactElement?
}

external interface SelectionBoxProps : RProps {
    var store: Store
    var type: RowSelectionType?
    var defaultSelection: Array<String>
    var rowIndex: String
    var name: String?
    var disabled: Boolean?
    var onChange: (e: Any /* RadioChangeEvent | CheckboxChangeEvent */) -> Unit
}

external interface SelectionBoxState : RState {
    var checked: Boolean?
}

external interface SelectionInfo<T> {
    var selectWay: TableSelectWay
    var record: T?
    var checked: Boolean?
    var changeRowKeys: Array<String>?
    var nativeEvent: Event?
}
