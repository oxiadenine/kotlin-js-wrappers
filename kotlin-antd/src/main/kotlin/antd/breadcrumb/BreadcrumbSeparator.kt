package antd.breadcrumb

import react.*

external object BreadcrumbSeparatorComponent : Component<BreadcrumbSeparatorProps, RState> {
    override fun render(): ReactElement?
}

external interface BreadcrumbSeparatorProps : RProps
