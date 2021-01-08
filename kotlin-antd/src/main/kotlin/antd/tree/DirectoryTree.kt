package antd.tree

import react.*

external object DirectoryTreeComponent : Component<DirectoryTreeProps, DirectoryTreeState> {
    override fun render(): ReactElement?
}

external interface DirectoryTreeProps : TreeProps {
    var expandAction: ExpandAction
}

external interface DirectoryTreeState : RState {
    var expandedKeys: Array<Key>?
    var selectedKeys: Array<Key>?
}
