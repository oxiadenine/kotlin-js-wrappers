package antd.modal

import antd.button.*
import react.*

external object ActionButtonComponent : Component<ActionButtonProps, State> {
    override fun render(): ReactElement?
}

external interface ActionButtonProps : Props {
    var type: LegacyButtonType?
    var actionFn: ((args: Array<Any>) -> Any /* Any | Promise<Any> */)?
    var closeModal: Function<Unit>
    var autoFocus: Boolean?
    var prefixCls: String
    var buttonProps: ButtonProps?
}
