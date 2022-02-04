package antd.input

import antd.RefAttributes
import antd.ReactNode
import react.*

external interface SearchComponent : ComponentClass<SearchProps>

external interface SearchProps : InputProps, RefAttributes<InputComponent> {
    var inputPrefixCls: String?
    var onSearch: ((value: String, event: Any? /* ChangeEvent<HTMLInputElement> | MouseEvent<HTMLElement> | KeyboardEvent<HTMLInputElement> */) -> Unit)?
    var enterButton: ReactNode?
    var loading: Boolean?
}
