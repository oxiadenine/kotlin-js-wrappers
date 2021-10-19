@file:JsModule("antd/lib/modal")
@file:JsNonModule

package antd.modal

import antd.*
import antd.ReactNode
import antd.button.*
import antd.configprovider.DirectionType
import org.w3c.dom.*
import react.*

@JsName("default")
external class ModalComponent : Component<ModalProps, State> {
    companion object : ModalStaticFunctions {
        val useModal: () -> Array<Any /* ModalStaticFunctions | ReactElement */>

        val destroyAll: () -> Unit
        val config: (rootPrefixCls: RootPrefixCls) -> Unit
    }

    override fun render(): ReactElement?
}

external interface ModalProps : Props {
    var visible: Boolean?
    var confirmLoading: Boolean?
    var title: ReactNode?
    var closable: Boolean?
    var onOk: ((e: MouseEvent<HTMLElement>) -> Unit)?
    var onCancel: ((e: MouseEvent<HTMLElement>) -> Unit)?
    var afterClose: (() -> Unit)?
    var centered: Boolean?
    var width: Any? /* String | Number */
    var footer: ReactNode?
    var okText: ReactNode?
    var okType: LegacyButtonType?
    var cancelText: ReactNode?
    var maskClosable: Boolean?
    var forceRender: Boolean?
    var okButtonProps: ButtonProps?
    var cancelButtonProps: ButtonProps?
    var destroyOnClose: Boolean?
    var style: dynamic
    var wrapClassName: String?
    var maskTransitionName: String?
    var transitionName: String?
    var className: String?
    var getContainer: Any? /* ReactNode | () -> HTMLElement | Boolean */
    var zIndex: Number?
    var bodyStyle: dynamic
    var maskStyle: dynamic
    var mask: Boolean?
    var keyboard: Boolean?
    var wrapProps: Any?
    var prefixCls: String?
    var closeIcon: ReactNode?
    var modalRender: ((node: ReactNode) -> ReactNode)?
}

external interface ModalFuncProps {
    var prefixCls: String?
    var className: String?
    var visible: Boolean?
    var title: ReactNode?
    var content: ReactNode?
    var onOk: ((args: Array<Any>) -> Any)?
    var onCancel: ((args: Array<Any>) -> Any)?
    var okButtonProps: ButtonProps?
    var cancelButtonProps: ButtonProps?
    var centered: Boolean?
    var width: Any? /* String | Number */
    var okText: ReactNode?
    var okType: LegacyButtonType?
    var cancelText: ReactNode?
    var icon: ReactNode?
    var mask: Boolean?
    var maskClosable: Boolean?
    var zIndex: Number?
    var okCancel: Boolean?
    var style: dynamic
    var maskStyle: dynamic
    var type: String?
    var keyboard: Boolean?
    var getContainer: Any? /* ReactNode | () -> HTMLElement | Boolean */
    var autoFocusButton: String? /* "ok" | "cancel" */
    var transitionName: String?
    var maskTransitionName: String?
    var direction: DirectionType?
    var bodyStyle: dynamic
    var modalRender: ((node: ReactNode) -> Any /* String | ReactElement */)?
}

external interface ModalLocale {
    var okText: String
    var cancelText: String
    var justOkText: String
}

external interface ModalFuncResult {
    var destroy: () -> Unit
    var update: (config: ModalFuncProps) -> Unit
}

external interface RootPrefixCls {
    var rootPrefixCls: String?
}
