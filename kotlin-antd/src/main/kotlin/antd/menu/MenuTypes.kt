package antd.menu

import kotlinext.js.Object

typealias MenuMode = String /* "vertical" | "vertical-left" | "vertical-right" | "horizontal" | "inline" */
typealias MenuTheme = String /* "light" | "dark" */

typealias RenderIconType = Any /* String | ReactElement | (props: Any) -> Array<Any /* String | ReactElement */> */
typealias SelectEventHandler = (info: SelectInfo) -> Unit
typealias HoverEventHandler = (info: HoverEventHandlerInfo) -> Unit
typealias MenuHoverEventHandler = (info: MenuHoverEventHandlerInfo) -> Unit
typealias MenuClickEventHandler = (info: MenuInfo) -> Unit
typealias DestroyEventHandler = (key: dynamic) -> Unit
typealias OpenEventHandler = (keys: Any /* Array<Key> | OpenEventHandlerInfo */) -> Unit
typealias OpenAnimation = Any /* String | Map<String, Any> */
typealias LegacyFunctionRef = (node: dynamic) -> Unit
typealias BuiltinPlacements = Object /* Map<String, Any> */
typealias TriggerSubMenuAction = String /* "click" | "hover" */
