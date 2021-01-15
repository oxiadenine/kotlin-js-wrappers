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
    var target: (() -> Any /* HTMLElement | Window | Document */)?
    var prefixCls: String?
    var children: Any? /* String | ReactElement */
    var className: String?
    var style: dynamic
    var duration: Number?
    var visible: Boolean?
}
