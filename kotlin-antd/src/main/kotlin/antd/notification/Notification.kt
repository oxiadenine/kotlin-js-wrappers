@file:JsModule("antd/lib/notification")
@file:JsNonModule

package antd.notification

import antd.MouseEventHandler
import org.w3c.dom.*
import react.*

@JsName("default")
external object NotificationComponent : Component<NotificationProps, RState> {
    override fun render(): ReactElement?
}

external interface NotificationProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var transitionName: String?
    var animation: Any? /* String | Object */
    var maxCount: Number?
    var closeIcon: Any? /* String | ReactElement */
}

external interface RcNoticeContent : RcNoticeProps {
    override var prefixCls: String?
    override var key: Key?
    override var updateMark: String?
    var content: Any? /* String | ReactElement */
    override var onClose: dynamic /* () -> Unit */
}

external interface RcNotificationInstance {
    var notice: NoticeFunc
    var removeNotice: (key: Key) -> Unit
    var destroy: () -> Unit
    var component: dynamic
    var useNotification: () -> Array<Any /* NoticeFunc | ReactElement */>
}

external interface RcNoticeProps {
    var prefixCls: String?
    var style: dynamic
    var className: String?
    var duration: Number?
    var children: Any? /* String | ReactElement */
    var updateMark: String?
    var noticeKey: Key
    var closeIcon: Any? /* String | ReactElement */
    var closable: Boolean?
    var props: RcDivProps?
    var onClick: MouseEventHandler<HTMLDivElement>?
    var onClose: ((key: Key) -> Unit)?
    var holder: HTMLDivElement?
    var key: Key?
}

external interface RcDivProps

@JsName("default")
external val notification: NotificationApi

external interface NotificationApi : NotificationInstance {
    fun warn(args: ArgsProps)
    fun close(key: String)
    fun config(options: ConfigProps)
    fun destroy()

    var useNotification: () -> Array<Any /* NotificationInstance | ReactElement */>
}

external interface NotificationInstance {
    fun success(args: ArgsProps)
    fun error(args: ArgsProps)
    fun info(args: ArgsProps)
    fun warning(args: ArgsProps)
    fun open(args: ArgsProps)
}

external interface ConfigProps {
    var top: Number?
    var bottom: Number?
    var duration: Number?
    var prefixCls: String?
    var placement: NotificationPlacement
    var getContainer: (() -> HTMLElement)?
    var closeIcon: Any? /* String | ReactElement */
    var rtl: Boolean?
}

external interface ArgsProps {
    var message: Any? /* String | ReactElement */
    var description: Any? /* String | ReactElement */
    var btn: Any? /* String | ReactElement */
    var key: String?
    var onClose: (() -> Unit)?
    var duration: Number?
    var icon: Any? /* String | ReactElement */
    var placement: NotificationPlacement?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    val type: IconType?
    var onClick: (() -> Unit)?
    var top: Number?
    var bottom: Number?
    var getContainer: (() -> HTMLElement)?
    var closeIcon: Any? /* String | ReactElement */
}
