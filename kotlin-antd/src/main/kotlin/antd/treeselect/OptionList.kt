package antd.treeselect

import antd.*
import org.w3c.dom.*
import react.*

external object OptionListComponent : Component<OptionListProps<Array<DataNode>>, RState> {
    override fun render(): ReactElement?
}

external interface OptionListProps<OptionsType> : RProps {
    var prefixCls: String
    var id: String
    var options: OptionsType
    var flattenOptions: Array<FlattenDataNode>
    var height: Number
    var itemHeight: Number
    var virtual: Boolean?
    var values: Set<RawValueType>
    var multiple: Boolean
    var open: Boolean
    var defaultActiveFirstOption: Boolean?
    var notFoundContent: Any? /* String | ReactElement */
    var menuItemSelectedIcon: Any?
    var childrenAsData: Boolean
    var searchValue: String
    var onSelect: (value: RawValueType, option: OnSelectOption) -> Unit
    var onToggleOpen: (open: Boolean?) -> Unit
    var onActiveValue: (value: RawValueType, index: Number) -> Unit
    var onScroll: UIEventHandler<HTMLDivElement>
    var onMouseEnter: () -> Unit
}

external interface OnSelectOption {
    var selected: Boolean
}
