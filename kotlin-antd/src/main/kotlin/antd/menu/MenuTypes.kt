package antd.menu

import kotlinext.js.Object

typealias Key = String
typealias ReactInstance = Any

typealias MenuMode = String /* "vertical" | "vertical-left" | "vertical-right" | "horizontal" | "inline" */
typealias MenuTheme = String /* "light" | "dark" */

typealias RenderIconType = Any /* String | ReactElement | (props: Any) -> Array<Any /* String | ReactElement */> */
typealias SelectEventHandler = (info: SelectInfo) -> Unit
typealias HoverEventHandler = (info: HoverEventHandlerInfo) -> Unit
typealias MenuHoverEventHandler = (info: MenuHoverEventHandlerInfo) -> Unit
typealias MenuClickEventHandler = (info: MenuInfo) -> Unit
typealias DestroyEventHandler = (key: Key) -> Unit
typealias OpenEventHandler = (keys: Any /* Array<Key> | OpenEventHandlerInfo */) -> Unit
typealias OpenAnimation = Any /* String | Map<String, Any> */
typealias LegacyFunctionRef = (node: ReactInstance) -> Unit
typealias BuiltinPlacements = Object /* Map<String, Any> */
typealias TriggerSubMenuAction = String /* "click" | "hover" */
