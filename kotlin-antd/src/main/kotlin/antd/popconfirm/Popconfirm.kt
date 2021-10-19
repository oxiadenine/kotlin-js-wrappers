@file:JsModule("antd/lib/popconfirm")
@file:JsNonModule

package antd.popconfirm

import antd.*
import antd.ReactNode
import antd.button.*
import antd.tooltip.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object PopconfirmComponent : Component<PopconfirmProps, PopconfirmState> {
    override fun render(): ReactElement?
}

external interface PopconfirmProps : AbstractTooltipProps, RefAttributes<dynamic>, Props {
    var title: Any /* ReactNode | RenderFunction */
    var disabled: Boolean?
    var onConfirm: ((e: MouseEvent<HTMLElement>?) -> Unit)?
    var onCancel: ((e: MouseEvent<HTMLElement>?) -> Unit)?
    var okText: ReactNode?
    var okType: LegacyButtonType?
    var cancelText: ReactNode?
    var okButtonProps: NativeButtonProps?
    var cancelButtonProps: NativeButtonProps?
    var icon: ReactNode?
    override var onVisibleChange: dynamic /* (visible: Boolean, e: Any? /* MouseEvent<HTMLElement> | KeyboardEvent<HTMLDivElement> */) -> Unit */
}

external interface PopconfirmState : State {
    var visible: Boolean?
}

external interface PopconfirmLocale {
    var okText: String
    var cancelText: String
}
