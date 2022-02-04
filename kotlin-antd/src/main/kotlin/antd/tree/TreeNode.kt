package antd.tree

import antd.*
import antd.Key
import antd.ReactNode
import org.w3c.dom.*
import react.*
import react.Ref

external interface TreeNodeComponent : ComponentClass<InternalTreeNodeProps>

external interface InternalTreeNodeProps : TreeNodeProps, Props {
    var context: TreeContextProps?
}

external interface TreeNodeProps {
    var eventKey: Key?
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var expanded: Boolean?
    var selected: Boolean?
    var checked: Boolean?
    var loaded: Boolean?
    var loading: Boolean?
    var halfChecked: Boolean?
    var title: Any /* ReactNode | (data: DataNode) -> ReactNode */
    var dragOver: Boolean?
    var dragOverGapTop: Boolean?
    var dragOverGapBottom: Boolean?
    var pos: String?
    var domRef: Ref<HTMLDivElement>?
    var data: DataNode?
    var isStart: Array<Boolean>?
    var isEnd: Array<Boolean>?
    var active: Boolean?
    var onMouseMove: MouseEventHandler<HTMLDivElement>?
    var isLeaf: Boolean?
    var checkable: Boolean?
    var selectable: Boolean?
    var disabled: Boolean?
    var disableCheckbox: Boolean?
    var icon: IconType?
    var switcherIcon: IconType?
    var children: ReactNode?
}

external interface TreeNodeState : State {
    var dragNodeHighlight: Boolean
}

external interface TreeNodeAttribute {
    var eventKey: String
    var prefixCls: String
    var className: String
    var expanded: Boolean
    var selected: Boolean
    var checked: Boolean
    var halfChecked: Boolean
    var children: Any /* String | ReactElement */
    var title: Any /* String | ReactElement */
    var pos: String
    var dragOver: Boolean
    var dragOverGapTop: Boolean
    var dragOverGapBottom: Boolean
    var isLeaf: Boolean
    var selectable: Boolean
    var disabled: Boolean
    var disableCheckbox: Boolean
}

external interface TreeNodeDragEnterEvent : TreeNodeMouseEvent {
    var expandedKeys: Array<Key>
}

external interface TreeNodeMouseEvent {
    var node: TreeNodeComponent
    var event: MouseEvent<HTMLElement>
}

external interface TreeNodeDropEvent {
    var node: TreeNodeComponent
    var dragNode: TreeNodeComponent
    var dragNodesKeys: Array<Key>
    var dropPosition: Number
    var dropToGap: Boolean?
    var event: MouseEvent<HTMLElement>
}

external interface TreeNodeCheckedEvent : TreeNodeBaseEvent {
    var event: String
    var checked: Boolean?
    var checkedNodes: Array<TreeNodeComponent>?
}

external interface TreeNodeSelectedEvent : TreeNodeBaseEvent {
    var event: String
    var selected: Boolean?
    var selectedNodes: Array<DataNode>?
}

external interface TreeNodeExpandedEvent : TreeNodeBaseEvent {
    var expanded: Boolean?
}

external interface TreeNodeBaseEvent {
    var node: TreeNodeComponent
    var nativeEvent: MouseEvent<Any>
}
