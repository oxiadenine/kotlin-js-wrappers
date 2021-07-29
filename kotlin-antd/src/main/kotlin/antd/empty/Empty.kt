@file:JsModule("antd/lib/empty")
@file:JsNonModule

package antd.empty

import antd.ReactNode
import react.*

@JsName("default")
external object EmptyComponent : Component<EmptyProps, State> {
    val PRESENTED_IMAGE_DEFAULT: ReactNode
    val PRESENTED_IMAGE_SIMPLE: ReactNode

    override fun render(): ReactElement?
}

external interface EmptyProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var imageStyle: dynamic
    var image: ReactNode?
    var description: ReactNode?
    var children: ReactNode?
}

external interface TransferLocale {
    var description: String
}
