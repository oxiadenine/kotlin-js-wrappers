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
    var backIcon: Any? /* String | ReactElement */
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
    var ghost: Boolean?
}
