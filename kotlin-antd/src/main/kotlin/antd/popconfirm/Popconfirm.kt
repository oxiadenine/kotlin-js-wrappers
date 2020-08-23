@file:JsModule("antd/lib/popconfirm")
@file:JsNonModule

package antd.popconfirm

import antd.MouseEvent
import antd.button.ButtonType
import antd.button.NativeButtonProps
import antd.tooltip.AbstractTooltipProps
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

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
