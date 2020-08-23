@file:JsModule("antd/lib/notification")
@file:JsNonModule

package antd.notification

import org.w3c.dom.HTMLElement
import react.ReactElement

@JsName("default")
external val notification: Notification

external interface Notification {
    fun success(args: ArgsProps)
    fun error(args: ArgsProps)
    fun info(args: ArgsProps)
    fun warn(args: ArgsProps)
    fun warning(args: ArgsProps)
    fun open(args: ArgsProps)
    fun close(key: String)
    fun config(options: ConfigProps)
    fun destroy()
}

external interface ConfigProps {
    var top: Number?
    var bottom: Number?
    var duration: Number?
    var placement: NotificationPlacement
    var getContainer: (() -> HTMLElement)?
}

external interface ArgsProps {
    var message: Any? /* String | ReactElement */
    var description: Any? /* String | ReactElement */
    var btn: ReactElement?
    var key: String?
    var onClose: (() -> Unit)?
    var duration: Number?
    var icon: ReactElement?
    var placement: NotificationPlacement?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    val type: IconType?
    var onClick: (() -> Unit)?
    var top: Number?
    var bottom: Number?
    var getContainer: (() -> HTMLElement)?
}
