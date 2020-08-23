@file:JsModule("antd/lib/drawer")
@file:JsNonModule

package antd.drawer

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object DrawerComponent : Component<DrawerProps, DrawerState> {
    override fun render(): ReactElement?
}

external interface DrawerProps : RProps {
    var closable: Boolean?
    var destroyOnClose: Boolean?
    var getContainer: Any? /* String | HTMLElement | GetContainerFunc */
    var maskClosable: Boolean?
    var mask: Boolean?
    var maskStyle: dynamic
    var style: dynamic
    var bodyStyle: dynamic
    var title: Any? /* SString | ReactElement */
    var visible: Boolean?
    var width: Any? /* Number | String */
    var height: Any? /* Number | String */
    var wrapClassName: String?
    var zIndex: Number?
    var prefixCls: String?
    var push: Boolean?
    var placement: PlacementType?
    var onClose: ((e: EventType) -> Unit)?
    var afterVisibleChange: ((visible: Boolean) -> Unit)?
    var className: String?
    var handler: ReactElement?
}

external interface DrawerState : RState {
    var push: Boolean?
}
