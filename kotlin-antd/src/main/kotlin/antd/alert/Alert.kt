@file:JsModule("antd/lib/alert")
@file:JsNonModule

package antd.alert

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

@JsName("default")
external object AlertComponent : Component<AlertProps, State> {
    val ErrorBoundary: ErrorBoundaryComponent

    override fun render(): ReactElement?
}

external interface AlertProps : RProps {
    var type: String? /* "success" | "info" | "warning" | "error" */
    var closable: Boolean?
    var closeText: ReactNode?
    var message: ReactNode
    var description: ReactNode?
    var onClose: MouseEventHandler<HTMLAnchorElement>?
    var afterClose: (() -> Unit)?
    var showIcon: Boolean?
    var role: String?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    var banner: Boolean?
    var icon: ReactNode?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
    var onClick: MouseEventHandler<HTMLDivElement>?
}
