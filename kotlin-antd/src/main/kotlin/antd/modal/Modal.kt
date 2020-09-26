@file:JsModule("antd/lib/modal")
@file:JsNonModule

package antd.modal

import antd.*
import antd.button.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object ModalComponent : Component<ModalProps, RState> {
    val info: ModalFunc
    val success: ModalFunc
    val error: ModalFunc
    val warn: ModalFunc
    val warning: ModalFunc
    val confirm: ModalFunc
    val destroyAll: () -> Unit

    override fun render(): ReactElement?
}

external interface ModalProps : RProps {
    var visible: Boolean?
    var confirmLoading: Boolean?
    var title: Any? /* ReactElement | String */
    var closable: Boolean?
    var onOk: ((e: MouseEvent<HTMLElement>) -> Unit)?
    var onCancel: ((e: MouseEvent<HTMLElement>) -> Unit)?
    var afterClose: (() -> Unit)?
    var centered: Boolean?
    var width: Any? /* String | Number */
    var footer: Any? /* String | ReactElement */
    var okText: Any? /* String | ReactElement */
    var okType: ButtonType?
    var cancelText: Any? /* String | ReactElement */
    var maskClosable: Boolean?
    var forceRender: Boolean?
    var okButtonProps: NativeButtonProps?
    var cancelButtonProps: NativeButtonProps?
    var destroyOnClose: Boolean?
    var style: dynamic
    var wrapClassName: String?
    var maskTransitionName: String?
    var transitionName: String?
    var className: String?
    var getContainer: ((instance: dynamic /* ReactInstance */) -> HTMLElement)?
    var zIndex: Number?
    var bodyStyle: dynamic
    var maskStyle: dynamic
    var mask: Boolean?
    var keyboard: Boolean?
    var wrapProps: Any?
    var prefixCls: String?
}

external interface ModalFuncProps {
    var prefixCls: String?
    var className: String?
    var visible: Boolean?
    var title: Any? /* String | ReactElement */
    var content: Any? /* String | ReactElement */
    var onOk: ((args: Array<Any>) -> Any)?
    var onCancel: ((args: Array<Any>) -> Any)?
    var okButtonProps: NativeButtonProps?
    var cancelButtonProps: NativeButtonProps?
    var centered: Boolean?
    var width: Any? /* String | Number */
    var iconClassName: String?
    var okText: Any? /* String | ReactElement */
    var okType: ButtonType?
    var cancelText: Any? /* String | ReactElement */
    var iconType: String?
    var mask: Boolean?
    var maskClosable: Boolean?
    var zIndex: Number?
    var okCancel: Boolean?
    var style: dynamic
    var maskStyle: dynamic
    var type: String?
    var keyboard: Boolean?
    var getContainer: ((instance: dynamic /* ReactInstance */) -> HTMLElement)?
    var autoFocusButton: ModalAutoFocusButton?
    var transitionName: String?
    var maskTransitionName: String?
}

external fun confirm(config: ModalFuncProps): ConfirmResult

external interface ConfirmResult {
    var destroy: (args: Array<Any>) -> Unit
    var update: (newConfig: ModalFuncProps) -> Unit
}

external fun changeConfirmLocale(newLocale: ModalLocale?)
external fun getConfirmLocale(): ModalLocale

external interface ModalLocale {
    var okText: String
    var cancelText: String
    var justOkText: String
}
