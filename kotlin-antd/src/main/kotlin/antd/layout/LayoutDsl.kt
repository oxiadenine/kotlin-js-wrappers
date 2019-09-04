package antd.layout

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.layout(handler: RHandler<LayoutProps>) = child(LayoutComponent::class, handler)
fun RBuilder.header(handler: RHandler<LayoutProps>) = child(LayoutComponent.Header, jsObject {}, handler)
fun RBuilder.footer(handler: RHandler<LayoutProps>) = child(LayoutComponent.Footer, jsObject {}, handler)
fun RBuilder.content(handler: RHandler<LayoutProps>) = child(LayoutComponent.Content, jsObject {}, handler)
fun RBuilder.sider(handler: RHandler<SiderProps>) = child(LayoutComponent.Sider, jsObject {}, handler)
