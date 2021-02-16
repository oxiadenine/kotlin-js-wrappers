@file:JsModule("antd/lib/message/hooks/useMessage")
@file:JsNonModule

package antd.message

import antd.notification.RcNoticeContent
import antd.notification.RcNotificationInstance

@JsName("default")
external fun createUseMessage(
    getRcNotificationInstance: (args: ArgsProps, callback: (info: CreateUseMessageCallbackInfo) -> Unit) -> Unit,
    getRCNoticeProps: (args: ArgsProps, prefixCls: String) -> RcNoticeContent
): () -> Array<Any /* MessageInstance | ReactElement */>

external interface CreateUseMessageCallbackInfo {
    var prefixCls: String
    var instance: RcNotificationInstance
}
