package antd.modal

import antd.button.ButtonType
import antd.button.NativeButtonProps
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ActionButtonComponent : Component<ActionButtonProps, ActionButtonState> {
    override fun render(): ReactElement?
}

external interface ActionButtonProps : RProps {
    var type: ButtonType?
    var actionFn: ((args: Array<Any>) -> Any /* Any | PromiseLike<Any> */)?
    var closeModal: Function<Unit>?
    var autoFocus: Boolean?
    var buttonProps: NativeButtonProps?
}

external interface ActionButtonState : RState {
    var loading: Boolean
}
