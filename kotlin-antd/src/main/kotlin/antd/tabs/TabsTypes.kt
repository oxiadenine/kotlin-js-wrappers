package antd.tabs

import antd.ReactNode
import kotlinext.js.Record
import react.ReactElement

typealias TabsType = String /* "line" | "card" | "editable-card" */
typealias TabsPosition = String /* "top" | "right" | "bottom" | "left" */

typealias TabPosition = String /* "top" | "right" | "bottom" | "left" */
typealias RenderTabBar = (props: Any, DefaultTabBar: dynamic) -> ReactElement
typealias OnTabScroll = (info: OnTabsScrollInfo) -> Unit
typealias TabBarExtraPosition = String /* "left" | "right" */
typealias TabBarExtraMap = Record<TabBarExtraPosition, ReactNode>
typealias TabBarExtraContent = Any /* ReactNode | TabBarExtraMap */
