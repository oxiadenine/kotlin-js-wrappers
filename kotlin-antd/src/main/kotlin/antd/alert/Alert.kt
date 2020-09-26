@file:JsModule("antd/lib/alert")
@file:JsNonModule

package antd.alert

import antd.*
import org.w3c.dom.*
import react.*

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
