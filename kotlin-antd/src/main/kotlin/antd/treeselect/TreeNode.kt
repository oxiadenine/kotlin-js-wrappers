package antd.treeselect

import react.*

external object TreeNodeComponent : Component<TreeNodeProps, RState> {
    override fun render(): ReactElement?
}

external interface TreeNodeProps : DataNode, RProps {
    override var value: Key?
    override var children: Any?
}
