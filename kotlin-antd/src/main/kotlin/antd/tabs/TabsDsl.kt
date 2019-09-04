package antd.tabs

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.tabs(handler: RHandler<TabsProps>) = child(TabsComponent::class, handler)
fun RBuilder.tabPane(handler: RHandler<TabPaneProps>) = child(TabsComponent.TabPane, jsObject {}, handler)
