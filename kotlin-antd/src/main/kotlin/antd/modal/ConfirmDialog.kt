package antd.modal

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ConfirmDialogComponent : Component<ConfirmDialogProps, RState> {
    override fun render(): ReactElement?
}

external interface ConfirmDialogProps : ModalFuncProps, RProps {
    var afterClose: (() -> Unit)?
    var close: (args: Array<Any>) -> Unit
    override var autoFocusButton: String? /* "ok" | "cancel" */
    var rootPrefixCls: String?
}
