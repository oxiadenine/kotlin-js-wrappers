package antd.input

import antd.ReactNode
import antd.RefAttributes
import react.*

external object SearchComponent : Component<SearchProps, RState> {
    override fun render(): ReactElement?
}

external interface SearchProps : InputProps, RefAttributes<InputComponent> {
    var inputPrefixCls: String?
    var onSearch: ((value: String, event: Any? /* ChangeEvent<HTMLInputElement> | MouseEvent<HTMLElement> | KeyboardEvent<HTMLInputElement> */) -> Unit)?
    var enterButton: ReactNode?
    var loading: Boolean?
}
