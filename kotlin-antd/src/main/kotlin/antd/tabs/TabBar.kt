package antd.tabs

import react.Component
import react.RState
import react.ReactElement

external object TabBarComponent : Component<TabsProps, RState> {
    override fun render(): ReactElement?
}
