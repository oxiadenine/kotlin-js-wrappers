package antd.tabs

import kotlinext.js.*
import react.*

fun RBuilder.tabs(handler: RHandler<TabsProps>) = child(TabsComponent::class, handler)
fun RBuilder.tabPane(handler: RHandler<TabPaneProps>) = child(TabsComponent.TabPane, jso {}, handler)
