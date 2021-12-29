package antd.tree

import antd.Key
import antd.RefAttributes
import react.*

external interface DirectoryTreeComponent : ComponentClass<DirectoryTreeProps>

external interface DirectoryTreeProps : TreeProps, RefAttributes<RcTreeComponent> {
    var expandAction: ExpandAction
}

external interface DirectoryTreeState : State {
    var expandedKeys: Array<Key>?
    var selectedKeys: Array<Key>?
}
