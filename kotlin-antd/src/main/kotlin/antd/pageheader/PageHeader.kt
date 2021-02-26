@file:JsModule("antd/lib/page-header")
@file:JsNonModule

package antd.pageheader

import antd.*
import antd.breadcrumb.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object PageHeaderComponent : Component<PageHeaderProps, RState> {
    override fun render(): ReactElement?
}

external interface PageHeaderProps : RProps {
    var backIcon: ReactNode?
    var prefixCls: String?
    var title: ReactNode
    var subTitle: ReactNode?
    var style: dynamic
    var breadcrumb: BreadcrumbProps?
    var tags: Any? /* ReactElement | Array<ReactElement> */
    var footer: ReactNode?
    var extra: ReactNode?
    var onBack: ((e: MouseEvent<HTMLDivElement>) -> Unit)?
    var className: String?
    var ghost: Boolean?
}
