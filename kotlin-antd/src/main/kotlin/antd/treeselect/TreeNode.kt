package antd.treeselect

import antd.Key
import react.*

external interface TreeNodeComponent : ComponentType<TreeNodeProps>

external interface TreeNodeProps : DataNode, RProps {
    override var value: Key?
    override var children: Any?
}
