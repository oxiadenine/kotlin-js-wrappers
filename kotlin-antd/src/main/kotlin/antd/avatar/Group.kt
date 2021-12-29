package antd.avatar

import antd.ReactNode
import react.*

external interface GroupComponent : ComponentClass<GroupProps>

external interface GroupProps : Props {
    var className: String?
    var children: ReactNode?
    var style: dynamic
    var prefixCls: String?
    var maxCount: Number?
    var maxStyle: dynamic
    var maxPopoverPlacement: String? /* "top" | "bottom" */
    var size: AvatarSize?
}
