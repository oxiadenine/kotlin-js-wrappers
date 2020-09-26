@file:JsModule("antd/lib/back-top")
@file:JsNonModule

package antd.backtop

import antd.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object BackTopComponent : Component<BackTopProps, RState> {
    override fun render(): ReactElement?
}

external interface BackTopProps : RProps {
    var visibilityHeight: Number?
    var onClick: MouseEventHandler<HTMLElement>?
    var target: (() -> Any /* HTMLElement | Window */)?
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var visible: Boolean?
}
