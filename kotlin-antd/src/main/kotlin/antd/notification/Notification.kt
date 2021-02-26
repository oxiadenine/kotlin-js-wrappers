@file:JsModule("antd/lib/notification")
@file:JsNonModule

package antd.notification

import antd.Key
import antd.MouseEventHandler
import antd.ReactNode
import org.w3c.dom.*

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
    var closeIcon: ReactNode?
    var rtl: Boolean?
}

external interface ArgsProps {
    var message: ReactNode?
    var description: ReactNode?
    var btn: ReactNode?
    var key: String?
    var onClose: (() -> Unit)?
    var duration: Number?
    var icon: ReactNode?
    var placement: NotificationPlacement?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    val type: IconType?
    var onClick: (() -> Unit)?
    var top: Number?
    var bottom: Number?
    var getContainer: (() -> HTMLElement)?
    var closeIcon: ReactNode?
}

external interface RcNoticeContent : RcNoticeProps {
    override var prefixCls: String?
    override var key: Key?
    override var updateMark: String?
    var content: ReactNode?
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
    var children: ReactNode?
    var updateMark: String?
    var noticeKey: Key
    var closeIcon: ReactNode?
    var closable: Boolean?
    var props: RcDivProps?
    var onClick: MouseEventHandler<HTMLDivElement>?
    var onClose: ((key: Key) -> Unit)?
    var holder: HTMLDivElement?
    var key: Key?
}

external interface RcDivProps

