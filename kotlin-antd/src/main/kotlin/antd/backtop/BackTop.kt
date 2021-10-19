@file:JsModule("antd/lib/back-top")
@file:JsNonModule

package antd.backtop

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

@JsName("default")
external object BackTopComponent : Component<BackTopProps, State> {
    override fun render(): ReactElement?
}

external interface BackTopProps : Props {
    var visibilityHeight: Number?
    var onClick: MouseEventHandler<HTMLElement>?
    var target: (() -> Any /* HTMLElement | Window | Document */)?
    var prefixCls: String?
    var children: ReactNode?
    var className: String?
    var style: dynamic
    var duration: Number?
    var visible: Boolean?
}
