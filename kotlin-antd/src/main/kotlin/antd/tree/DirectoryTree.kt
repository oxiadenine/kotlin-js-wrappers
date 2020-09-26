package antd.tree

import react.*

external object DirectoryTreeComponent : Component<DirectoryTreeProps, DirectoryTreeState> {
    override fun render(): ReactElement?
}

external interface DirectoryTreeProps : TreeProps {
    var expandAction: DirectoryTreeExpandAction
}

external interface DirectoryTreeState : RState {
    var expandedKeys: Array<String>?
    var selectedKeys: Array<String>?
}
