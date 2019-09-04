package antd.tree

import antd.MouseEvent
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TreeNodeComponent : Component<TreeNodeProps, RState> {
    override fun render(): ReactElement?
}

external interface TreeNodeProps : RProps {
    var className: String?
    var checkable: Boolean?
    var disabled: Boolean?
    var disableCheckbox: Boolean?
    var title: Any? /* String | ReactElement */
    var key: String?
    var eventKey: String?
    var isLeaf: Boolean?
    var checked: Boolean?
    var expanded: Boolean?
    var loading: Boolean?
    var selected: Boolean?
    var selectable: Boolean?
    var icon: Any /* TreeNodeIconFn | ReactElement */
    var children: ReactElement?
    /* [customProp: String]: Any */
}

external interface TreeNodeAttribute {
    var eventKey: String
    var prefixCls: String
    var className: String
    var expanded: Boolean
    var selected: Boolean
    var checked: Boolean
    var halfChecked: Boolean
    var children: ReactElement
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

external interface TreeNodeNormal {
    var title: Any? /* String | ReactElement */
    var key: String
    var isLeaf: Boolean?
    var disabled: Boolean?
    var disableCheckbox: Boolean?
    var selectable: Boolean?
    var children: Array<TreeNodeNormal>?
}

external interface TreeNodeDragEnterEvent : TreeNodeMouseEvent {
    var expandedKeys: Array<String>
}

external interface TreeNodeMouseEvent {
    var node: TreeNodeComponent
    var event: MouseEvent<HTMLElement>
}

external interface TreeNodeDropEvent {
    var node: TreeNodeComponent
    var dragNode: TreeNodeComponent
    var dragNodesKeys: Array<String>
    var dropPosition: Number
    var dropToGap: Boolean?
    var event: MouseEvent<HTMLElement>
}

external interface TreeNodeCheckedEvent : TreeNodeBaseEvent {
    var event: String /* "check" */
    var checked: Boolean?
    var checkedNodes: Array<TreeNodeComponent>?
}

external interface TreeNodeSelectedEvent : TreeNodeBaseEvent {
    var event: String /* "select" */
    var selected: Boolean?
    var selectedNodes: Array<TreeNodeComponent>?
}

external interface TreeNodeExpandedEvent : TreeNodeBaseEvent {
    var expanded: Boolean?
}

external interface TreeNodeBaseEvent {
    var node: TreeNodeComponent
    var nativeEvent: org.w3c.dom.events.MouseEvent
}
