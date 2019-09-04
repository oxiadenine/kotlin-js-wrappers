package antd.modal

typealias ModalAutoFocusButton = String /* "ok" | "cancel" */

typealias ModalFunc = (props: ModalFuncProps) -> ModalFuncResult

interface ModalFuncResult {
    var destroy: () -> Unit
    var update: (config: ModalFuncProps) -> Unit
}
