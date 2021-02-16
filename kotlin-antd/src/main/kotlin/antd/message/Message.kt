@file:JsModule("antd/lib/message")
@file:JsNonModule

package antd.message

import org.w3c.dom.*
import kotlin.js.Promise

@JsName("default")
external val message: MessageApi

external interface MessageApi : MessageInstance {
    fun warn(content: JointContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun config(options: ConfigOptions)
    fun destroy(messageKey: Key)
    fun useMessage(): Array<Any /* MessageInstance | ReactElement */>
}

external interface MessageInstance {
    fun info(content: JointContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun success(content: JointContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun error(content: JointContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun warning(content: JointContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun loading(content: JointContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun open(args: ArgsProps): MessageType
}

external interface ThenableArgument

external interface MessageType {
    var then: (fill: ThenableArgument, reject: ThenableArgument) -> Promise<Unit>
    var promise: Promise<Unit>
}

external interface ArgsProps {
    var content: Any /* String | ReactElement */
    var duration: Number
    var type: NoticeType
    var prefixCls: String?
    var onClose: (() -> Unit)?
    var icon: Any? /* String | ReactElement */
    var key: Any? /* String | Number */
    var style: dynamic
    var className: String?
}

external interface ConfigOptions {
    var top: Number?
    var duration: Number?
    var prefixCls: String?
    var getContainer: (() -> HTMLElement)?
    var transitionName: String?
    var maxCount: Number?
    var rtl: Boolean?
}
