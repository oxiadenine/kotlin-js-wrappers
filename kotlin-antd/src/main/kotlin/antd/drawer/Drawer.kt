@file:JsModule("antd/lib/drawer")
@file:JsNonModule

package antd.drawer

import antd.ReactNode
import react.*

@JsName("default")
external object DrawerComponent : Component<DrawerProps, State> {
    override fun render(): ReactElement?
}

external interface DrawerProps : Props {
    var closable: Boolean?
    var closeIcon: ReactNode?
    var destroyOnClose: Boolean?
    var forceRender: Boolean?
    var getContainer: Any? /* String | HTMLElement | GetContainerFunc | Boolean */
    var maskClosable: Boolean?
    var mask: Boolean?
    var maskStyle: dynamic
    var style: dynamic
    var drawerStyle: dynamic
    var headerStyle: dynamic
    var bodyStyle: dynamic
    var title: ReactNode?
    var visible: Boolean?
    var width: Any? /* Number | String */
    var height: Any? /* Number | String */
    var zIndex: Number?
    var prefixCls: String?
    var push: Any? /* Boolean | PushSate */
    var placement: PlacementType?
    var onClose: ((e: EventType) -> Unit)?
    var afterVisibleChange: ((visible: Boolean) -> Unit)?
    var className: String?
    var handler: Any? /* Number | String */
    var keyboard: Boolean?
    var footer: Any? /* Number | String */
    var footerStyle: dynamic
}

external interface PushState {
    var distance: Any /* String | Number */
}
