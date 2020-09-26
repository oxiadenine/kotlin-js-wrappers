package antd.transfer

import antd.*
import org.w3c.dom.*
import react.*

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
