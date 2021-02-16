@file:JsModule("antd/lib/modal/useModal")
@file:JsNonModule

package antd.modal

@JsName("default")
external fun useModal(): Array<Any /* ModalStaticFunctions | ReactElement */>

external interface HookModalProps {
    var afterClose: () -> Unit
    var config: ModalFuncProps
}

external interface HookModalRef {
    var destroy: () -> Unit
    var update: (config: ModalFuncProps) -> Unit
}
