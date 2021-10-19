package antd.transfer

import antd.*
import antd.configprovider.DirectionType
import org.w3c.dom.*
import react.*

external object TransferOperationComponent : Component<TransferOperationProps, State> {
    override fun render(): ReactElement?
}

external interface TransferOperationProps : Props {
    var className: String?
    var leftArrowText: String?
    var rightArrowText: String?
    var moveToLeft: MouseEventHandler<HTMLButtonElement>?
    var moveToRight: MouseEventHandler<HTMLButtonElement>?
    var leftActive: Boolean?
    var rightActive: Boolean?
    var style: dynamic
    var disabled: Boolean?
    var direction: DirectionType?
    var oneWay: Boolean?
}
