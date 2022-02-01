package antd.layout

import kotlinext.js.*
import react.*

fun RBuilder.layout(handler: RHandler<LayoutProps>) = child(LayoutComponent::class, handler)
fun RBuilder.header(handler: RHandler<LayoutProps>) = child(LayoutComponent.Header, jso {}, handler)
fun RBuilder.footer(handler: RHandler<LayoutProps>) = child(LayoutComponent.Footer, jso {}, handler)
fun RBuilder.content(handler: RHandler<LayoutProps>) = child(LayoutComponent.Content, jso {}, handler)
fun RBuilder.sider(handler: RHandler<SiderProps>) = child(LayoutComponent.Sider, jso {}, handler)
