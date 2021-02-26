package antd.tree

import antd.Key
import antd.RefAttributes
import react.*

external object DirectoryTreeComponent : Component<DirectoryTreeProps, DirectoryTreeState> {
    override fun render(): ReactElement?
}

external interface DirectoryTreeProps : TreeProps, RefAttributes<RcTreeComponent> {
    var expandAction: ExpandAction
}

external interface DirectoryTreeState : RState {
    var expandedKeys: Array<Key>?
    var selectedKeys: Array<Key>?
}
