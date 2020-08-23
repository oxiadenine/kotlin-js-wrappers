@file:JsModule("antd/lib/breadcrumb")
@file:JsNonModule

package antd.breadcrumb

import react.*

@JsName("default")
external object BreadcrumbComponent : Component<BreadcrumbProps, RState> {
    val Item: BreadcrumbItemComponent

    override fun render(): ReactElement?
}

external interface BreadcrumbProps : RProps {
    var prefixCls: String?
    var routes: Array<Route>?
    var params: Any?
    var separator: Any? /* String | ReactElement */
    var itemRender: ((route: Route, params: Any, routes: Array<Route>, paths: Array<String>) -> Any /* String | ReactElement */)?
    var style: dynamic
    var className: String?
}

external interface Route {
    var path: String
    var breadcrumbName: String
    var children: dynamic
}
