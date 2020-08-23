@file:JsModule("antd/lib/page-header")
@file:JsNonModule

package antd.pageheader

import antd.MouseEvent
import antd.breadcrumb.BreadcrumbProps
import org.w3c.dom.HTMLDivElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object PageHeaderComponent : Component<PageHeaderProps, RState> {
    override fun render(): ReactElement?
}

external interface PageHeaderProps : RProps {
    var backIcon: ReactElement?
    var prefixCls: String?
    var title: Any /* String | ReactElement */
    var subTitle: Any? /* String | ReactElement */
    var style: dynamic
    var breadcrumb: BreadcrumbProps?
    var tags: Any? /* ReactElement | Array<ReactElement> */
    var footer: Any? /* String | ReactElement */
    var extra: Any? /* String | ReactElement */
    var onBack: ((e: MouseEvent<HTMLDivElement>) -> Unit)?
    var className: String?
}
