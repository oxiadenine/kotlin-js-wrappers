@file:JsModule("antd/lib/message")
@file:JsNonModule

package antd.message

import org.w3c.dom.HTMLElement
import react.ReactElement
import kotlin.js.Promise

@JsName("default")
external val message: Message

external interface Message {
    fun info(content: ConfigContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun success(content: ConfigContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun error(content: ConfigContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun warn(content: ConfigContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun warning(content: ConfigContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun loading(content: ConfigContent, duration: ConfigDuration? = definedExternally, onClose: ConfigOnClose? = definedExternally): MessageType
    fun open(args: ArgsProps): MessageType
    fun config(options: ConfigOptions)
    fun destroy()
}

external interface ThenableArgument {
    /* (val: Any): Unit */
}

external interface MessageType {
    /* var (): Unit */
    var then: (fill: ThenableArgument, reject: ThenableArgument) -> Promise<Unit>
    var promise: Promise<Unit>
}

external interface ArgsProps {
    var content: Any /* String | ReactElement */
    var duration: Number?
    var type: NoticeType
    var onClose: (() -> Unit)?
    var icon: ReactElement?
}

external interface ConfigOptions {
    var top: Number?
    var duration: Number?
    var prefixCls: String?
    var getContainer: (() -> HTMLElement)?
    var transitionName: String?
    var maxCount: Number?
}
