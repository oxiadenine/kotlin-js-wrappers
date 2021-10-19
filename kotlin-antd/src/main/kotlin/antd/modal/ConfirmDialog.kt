package antd.modal

import react.*

external object ConfirmDialogComponent : Component<ConfirmDialogProps, State> {
    override fun render(): ReactElement?
}

external interface ConfirmDialogProps : ModalFuncProps, Props {
    var afterClose: (() -> Unit)?
    var close: (args: Array<Any>) -> Unit
    override var autoFocusButton: String? /* "ok" | "cancel" */
    var rootPrefixCls: String?
}
