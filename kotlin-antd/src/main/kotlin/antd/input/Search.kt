package antd.input

import react.*

external object SearchComponent : Component<SearchProps, RState> {
    override fun render(): ReactElement?
}

external interface SearchProps : InputProps {
    var inputPrefixCls: String?
    var onSearch: ((value: String, event: Any? /* ChangeEvent<HTMLInputElement> | MouseEvent<HTMLElement> | KeyboardEvent<HTMLInputElement> */) -> Unit)?
    var enterButton: Any? /* Boolean | ReactElement */
    var loading: Boolean?
}
