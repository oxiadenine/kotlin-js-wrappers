package antd.select

import antd.*
import org.w3c.dom.*
import react.*

external object OptionListComponent : Component<OptionListProps<SelectOptionsType>, RState> {
    override fun render(): ReactElement?
}

external interface OptionListProps<OptionsType> : RefAttributes<RefOptionListProps>, RProps {
    var prefixCls: String
    var id: String
    var options: OptionsType
    var flattenOptions: Array<FlattenOptionsType<OptionsType>>
    var height: Number
    var itemHeight: Number
    var values: Set<RawValueType>
    var multiple: Boolean
    var open: Boolean
    var defaultActiveFirstOption: Boolean?
    var notFoundContent: ReactNode?
    var menuItemSelectedIcon: RenderNode?
    var childrenAsData: Boolean
    var searchValue: String
    var virtual: Boolean
    var onSelect: (value: RawValueType, option: OnSelectOption) -> Unit
    var onToggleOpen: (open: Boolean?) -> Unit
    var onActiveValue: OnActiveValue
    var onScroll: UIEventHandler<HTMLDivElement>
    var onMouseEnter: MouseEventHandler<Any>?
}

external interface FlattenOptionsType<OptionsType> {
    var key: Key
    var data: OptionsType
}

external interface OnSelectOption {
    var selected: Boolean
}

external interface RefOptionListProps {
    var onKeyDown: KeyboardEventHandler<Any>
    var onKeyUp: KeyboardEventHandler<Any>
    var scrollTo: ((index: Number) -> Unit)?
}
