@file:JsModule("antd/lib/popconfirm")
@file:JsNonModule

package antd.popconfirm

import antd.*
import antd.button.*
import antd.tooltip.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object PopconfirmComponent : Component<PopconfirmProps, PopconfirmState> {
    override fun render(): ReactElement?
}

external interface PopconfirmProps : AbstractTooltipProps, RProps {
    var title: Any /* String | ReactElement */
    var onConfirm: ((e: MouseEvent<HTMLElement>) -> Unit)?
    var onCancel: ((e: MouseEvent<HTMLElement>) -> Unit)?
    var okText: Any? /* String | ReactElement */
    var okType: ButtonType?
    var cancelText: Any? /* String | ReactElement */
    var okButtonProps: NativeButtonProps?
    var cancelButtonProps: NativeButtonProps?
    var icon: ReactElement?
    override var onVisibleChange: dynamic /* PopconfirmVisibleChange */
}

external interface PopconfirmState : RState {
    var visible: Boolean?
}

external interface PopconfirmLocale {
    var okText: String
    var cancelText: String
}
