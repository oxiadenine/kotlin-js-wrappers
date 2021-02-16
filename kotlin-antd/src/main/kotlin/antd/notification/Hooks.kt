@file:JsModule("antd/lib/notification/hooks/useNotification")
@file:JsNonModule

package antd.notification

@JsName("default")
external fun createUseNotification(
    getNotificationInstance: (args: ArgsProps, callback: (info: CreateUseNotificationCasllbackInfo) -> Unit) -> Unit,
    getRCNoticeProps: (args: ArgsProps, prefixCls: String) -> RcNoticeContent
): () -> Array<Any /* NotificationInstance | ReactElement */>

external interface CreateUseNotificationCasllbackInfo {
    var prefixCls: String
    var instance: RcNotificationInstance
}
