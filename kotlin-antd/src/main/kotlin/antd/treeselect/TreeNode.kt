package antd.treeselect

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TreeNodeComponent : Component<TreeNodeProps, RState> {
    override fun render(): ReactElement?
}

external interface TreeNodeProps : RProps {
    var disableCheckbox: Boolean?
    var disabled: Boolean?
    var isLeaf: Boolean?
    var title: Any /* String | ReactElement */
    var value: String?
    var selectable: Boolean?
}

external interface TreeNodeNormal {
    var value: Any /* String | Number */
    var label: Any? /* String | ReactElement */
    var title: Any? /* String | ReactElement */
    var key: String
    var isLeaf: Boolean?
    var disabled: Boolean?
    var disableCheckbox: Boolean?
    var selectable: Boolean?
    var children: Array<TreeNodeNormal>?
}

external interface TreeNodeSimpleMode {
    /* [key: String]: String | Boolean | ReactElement */
}

external interface TreeDataSimpleMode {
    var id: String?
    var pId: String?
    var rootPId: String?
}
