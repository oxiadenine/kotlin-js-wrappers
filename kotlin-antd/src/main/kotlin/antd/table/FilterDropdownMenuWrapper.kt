package antd.table

import react.*

external object FilterDropdownMenuWrapperComponent : Component<FilterDropdownMenuWrapperProps, RState> {
    override fun render(): ReactElement?
}

external interface FilterDropdownMenuWrapperProps : RProps {
    var children: ReactElement?
    var className: String?
}
