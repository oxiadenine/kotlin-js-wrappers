package antd.table

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object FilterDropdownMenuWrapperComponent : Component<FilterDropdownMenuWrapperProps, RState> {
    override fun render(): ReactElement?
}

external interface FilterDropdownMenuWrapperProps : RProps {
    var children: ReactElement?
    var className: String?
}
