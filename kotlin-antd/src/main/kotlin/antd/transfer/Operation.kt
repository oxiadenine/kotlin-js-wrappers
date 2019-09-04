package antd.transfer

import antd.MouseEventHandler
import org.w3c.dom.HTMLButtonElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TransferOperationComponent : Component<TransferOperationProps, RState> {
    override fun render(): ReactElement?
}

external interface TransferOperationProps : RProps {
    var className: String?
    var leftArrowText: String?
    var rightArrowText: String?
    var moveToLeft: MouseEventHandler<HTMLButtonElement>?
    var moveToRight: MouseEventHandler<HTMLButtonElement>?
    var leftActive: Boolean?
    var rightActive: Boolean?
    var style: dynamic
    var disabled: Boolean?
}
