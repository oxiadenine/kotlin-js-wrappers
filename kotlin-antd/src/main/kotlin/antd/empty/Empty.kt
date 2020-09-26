@file:JsModule("antd/lib/empty")
@file:JsNonModule

package antd.empty

import react.*

@JsName("default")
external object EmptyComponent : Component<EmptyProps, RState> {
    val PRESENTED_IMAGE_DEFAULT: String
    val PRESENTED_IMAGE_SIMPLE: String

    override fun render(): ReactElement?
}

external interface EmptyProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var imageStyle: dynamic
    var image: Any? /* String | ReactElement */
    var description: Any? /* String | ReactElement */
    var children: ReactElement?
}

external interface TransferLocale {
    var description: String
}
