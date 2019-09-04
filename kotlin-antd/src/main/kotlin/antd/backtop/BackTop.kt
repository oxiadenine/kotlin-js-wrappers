@file:JsModule("antd/lib/back-top")

package antd.backtop

import antd.MouseEventHandler
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

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
