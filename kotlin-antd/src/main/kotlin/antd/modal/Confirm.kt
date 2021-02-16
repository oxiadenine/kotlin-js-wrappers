@file:JsModule("antd/lib/modal/confirm")
@file:JsNonModule

package antd.modal

@JsName("default")
external fun confirm(config: ModalFuncProps): ConfirmResult

external interface ConfirmResult {
    var destroy: (args: Array<Any>) -> Unit
    var update: (configUpdate: ConfigUpdate) -> Unit
}

external fun withWarn(props: ModalFuncProps): ModalFuncProps
external fun withInfo(props: ModalFuncProps): ModalFuncProps
external fun withSuccess(props: ModalFuncProps): ModalFuncProps
external fun withError(props: ModalFuncProps): ModalFuncProps
external fun withConfirm(props: ModalFuncProps): ModalFuncProps

open external class ModalStaticFunctions {
    var info: ModalFunc
    var success: ModalFunc
    var error: ModalFunc
    var warn: ModalFunc
    var warning: ModalFunc
    var confirm: ModalFunc
}
