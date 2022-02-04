@file:JsModule("antd/lib/layout")
@file:JsNonModule

package antd.layout

import antd.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object LayoutComponent : Component<LayoutProps, State> {
    val Header: HeaderComponent
    val Footer: FooterComponent
    val Content: ContentComponent
    val Sider: SiderComponent

    override fun render(): ReactElement?
}

external interface HeaderComponent : ComponentClass<LayoutProps>

external interface FooterComponent : ComponentClass<LayoutProps>

external interface ContentComponent : ComponentClass<LayoutProps>

external val layoutContext: Context<LayoutContextProps>

external interface LayoutProps : HTMLAttributes<HTMLDivElement>, Props {
    var prefixCls: String?
    var hasSider: Boolean?
}

external interface LayoutContextProps {
    var siderHook: LayoutContextSiderHook
}

external interface LayoutContextSiderHook {
    var addSider: (id: String) -> Unit
    var removeSider: (id: String) -> Unit
}
