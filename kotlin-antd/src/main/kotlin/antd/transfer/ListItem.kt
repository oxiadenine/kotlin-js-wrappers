package antd.transfer

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TransferListItemComponent : Component<RProps, RState> {
    override fun render(): ReactElement?
}
