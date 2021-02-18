package antd.tabs

import react.ReactElement

typealias TabsType = String /* "line" | "card" | "editable-card" */
typealias TabsPosition = String /* "top" | "right" | "bottom" | "left" */

typealias TabPosition = String /* "top" | "right" | "bottom" | "left" */
typealias RenderTabBar = (props: Any, DefaultTabBar: dynamic) -> ReactElement
typealias OnTabScroll = (info: OnTabsScrollInfo) -> Unit
typealias TabBarExtraPosition = String /* "left" | "right" */
typealias TabBarExtraMap = Map<TabBarExtraPosition, Any /* String | ReactElement */>
typealias TabBarExtraContent = Any /* String | ReactElement | TabBarExtraMap */
