@file:JsModule("antd/lib/alert")

package antd.alert

import antd.MouseEventHandler
import org.w3c.dom.HTMLAnchorElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object AlertComponent : Component<AlertProps, AlertState> {
    override fun render(): ReactElement?
}

external interface AlertProps : RProps {
    var type: AlertType?
    var closable: Boolean?
    var closeText: Any? /* String | ReactElement */
    var message: Any /* String | ReactElement */
    var description: Any? /* String | ReactElement */
    var onClose: MouseEventHandler<HTMLAnchorElement>?
    var afterClose: (() -> Unit)?
    var showIcon: Boolean?
    var iconType: String?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    var banner: Boolean?
    var icon: ReactElement?
}

external interface AlertState : RState {
    var closing: Boolean
    var closed: Boolean
}
