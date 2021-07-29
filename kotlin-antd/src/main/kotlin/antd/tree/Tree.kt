@file:JsModule("antd/lib/tree")
@file:JsNonModule

package antd.tree

import antd.*
import antd.ReactNode
import kotlinext.js.Record
import org.w3c.dom.*
import react.*
import kotlin.js.Promise

@JsName("default")
external object TreeComponent : Component<TreeProps, State> {
    val TreeNode: TreeNodeComponent
    val DirectoryTree: DirectoryTreeComponent

    override fun render(): ReactElement?
}

external interface TreeProps : RcTreeProps, RefAttributes<RcTreeComponent>, RProps {
    override var showLine: Any?
    override var className: String?
    override var multiple: Boolean?
    override var autoExpandParent: Boolean?
    override var checkStrictly: Boolean?
    override var checkable: Any?
    override var disabled: Boolean?
    override var defaultExpandAll: Boolean?
    override var defaultExpandParent: Boolean?
    override var defaultExpandedKeys: Array<Key>?
    override var expandedKeys: Array<Key>?
    override var checkedKeys: Any?
    override var defaultCheckedKeys: Array<Key>?
    override var selectedKeys: Array<Key>?
    override var defaultSelectedKeys: Array<Key>?
    override var selectable: Boolean?
    var filterAntTreeNode: ((node: TreeNodeComponent) -> Boolean)?
    override var loadedKeys: Array<Key>?
    override var draggable: Boolean?
    override var style: dynamic
    override var showIcon: Boolean?
    override var icon: Any? /* (nodeProps: TreeNodeAttribute) -> ReactNode | ReactNode */
    override var switcherIcon: Any?
    override var prefixCls: String?
    override var children: ReactNode?
    var blockNode: Boolean?
}

external object RcTreeComponent : Component<RcTreeProps, RcTreeState> {
    override fun render(): ReactElement?
}

external interface RcTreeProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var focusable: Boolean?
    var tabIndex: Number?
    var children: ReactNode?
    var treeData: Array<DataNode>?
    var showLine: Any?
    var showIcon: Boolean?
    var icon: IconType?
    var selectable: Boolean?
    var disabled: Boolean?
    var multiple: Boolean?
    var checkable: Any? /* Boolean | ReactNode */
    var checkStrictly: Boolean?
    var draggable: Boolean?
    var defaultExpandParent: Boolean?
    var autoExpandParent: Boolean?
    var defaultExpandAll: Boolean?
    var defaultExpandedKeys: Array<Key>?
    var expandedKeys: Array<Key>?
    var defaultCheckedKeys: Array<Key>?
    var checkedKeys: Any? /* Array<Key> | CheckedKeysInfo */
    var defaultSelectedKeys: Array<Key>?
    var selectedKeys: Array<Key>?
    var titleRender: ((node: DataNode) -> ReactNode)?
    var onFocus: FocusEventHandler<HTMLDivElement>?
    var onBlur: FocusEventHandler<HTMLDivElement>?
    var onKeyDown: KeyboardEventHandler<HTMLDivElement>?
    var onContextMenu: MouseEventHandler<HTMLDivElement>?
    var onClick: NodeMouseEventHandler?
    var onDoubleClick: NodeMouseEventHandler?
    var onExpand: ((expandedKeys: Array<Key>, info: OnExpandInfo) -> Unit)?
    var onCheck: ((checked: Any /* OnCheckInfo | Array<Key> */, info: CheckInfo) -> Unit)?
    var onSelect: ((selectedKeys: Array<Key>, info: OnSelectInfo) -> Unit)?
    var onLoad: ((loadedKeys: Array<Key>, info: OnLoadInfo) -> Unit)?
    var loadData: ((treeNode: EventDataNode) -> Promise<Unit>)?
    var loadedKeys: Array<Key>?
    var onMouseEnter: ((info: NodeMouseEventParams<HTMLSpanElement>) -> Unit)?
    var onMouseLeave: ((info: NodeMouseEventParams<HTMLSpanElement>) -> Unit)?
    var onRightClick: ((info: OnRightClickInfo) -> Unit)?
    var onDragStart: ((info: NodeDragEventParams<HTMLDivElement>) -> Unit)?
    var onDragEnter: ((info: OnDragEnterInfo) -> Unit)?
    var onDragOver: ((info: NodeDragEventParams<HTMLDivElement>) -> Unit)?
    var onDragLeave: ((info: NodeDragEventParams<HTMLDivElement>) -> Unit)?
    var onDragEnd: ((info: NodeDragEventParams<HTMLDivElement>) -> Unit)?
    var onDrop: ((info: OnDropInfo) -> Unit)?
    var onActiveChange: ((key: Key) -> Unit)?
    var filterTreeNode: ((treeNode: EventDataNode) -> Boolean)?
    var motion: Any?
    var switcherIcon: IconType?
    var height: Number?
    var itemHeight: Number?
    var virtual: Boolean?
}

external interface RcTreeState : State {
    var keyEntities: Record<Key, DataEntity>
    var selectedKeys: Array<Key>
    var checkedKeys: Array<Key>
    var halfCheckedKeys: Array<Key>
    var loadedKeys: Array<Key>
    var loadingKeys: Array<Key>
    var expandedKeys: Array<Key>
    var dragging: Boolean
    var dragNodesKeys: Array<Key>
    var dragOverNodeKey: Key
    var dropPosition: Number
    var treeData: Array<DataNode>
    var flattenNodes: Array<FlattenNode>
    var focused: Boolean
    var activeKey: Key
    var listChanging: Boolean
    var prevProps: RcTreeProps
}

external interface CheckedKeysInfo {
    var checked: Array<Key>
    var halfChecked: Array<Key>
}

external interface OnExpandInfo {
    var node: EventDataNode
    var expanded: Boolean
    var nativeEvent: MouseEvent<Any>
}

external interface OnCheckInfo {
    var checked: Array<Key>
    var halfChecked: Array<Key>
}

external interface OnSelectInfo {
    var event: String
    var selected: Boolean
    var node: EventDataNode
    var selectedNodes: Array<DataNode>
    var nativeEvent: MouseEvent<Any>
}

external interface OnLoadInfo {
    var event: String
    var node: EventDataNode
}

external interface OnRightClickInfo {
    var event: MouseEvent<Any>
    var node: EventDataNode
}

external interface OnDragEnterInfo : NodeDragEventParams<HTMLDivElement> {
    var expandedKeys: Array<Key>
}

external interface OnDropInfo : NodeDragEventParams<HTMLDivElement> {
    var dragNode: EventDataNode
    var dragNodesKeys: Array<Key>
    var dropPosition: Number
    var dropToGap: Boolean
}

external interface CheckInfo {
    var event: String
    var node: EventDataNode
    var checked: Boolean
    var nativeEvent: MouseEvent<Any>
    var checkedNodes: Array<DataNode>
    var checkedNodesPositions: Array<CheckedNodesPosition>?
    var halfCheckedKeys: Array<Key>?
}

external interface CheckedNodesPosition {
    var node: DataNode
    var pos: String
}

external interface DataNode {
    var checkable: Boolean?
    var children: Array<DataNode>?
    var disabled: Boolean?
    var disableCheckbox: Boolean?
    var icon: IconType?
    var isLeaf: Boolean?
    var key: Any /* String | Number */
    var title: ReactNode?
    var selectable: Boolean?
    var switcherIcon: IconType?
    var className: String?
    var style: dynamic
}

external interface EventDataNode : DataNode {
    var expanded: Boolean
    var selected: Boolean
    var checked: Boolean
    var loaded: Boolean
    var loading: Boolean
    var halfChecked: Boolean
    var dragOver: Boolean
    var dragOverGapTop: Boolean
    var dragOverGapBottom: Boolean
    var pos: String
    var active: Boolean
}

external interface Entity {
    var node: Any /* NodeElement | DataNode */
    var index: Number
    var key: Key
    var pos: String
    var parent: Any? /* Entity | DataEntity */
    var children: Array<Any /* Entity> | DataEntity */>?
}

external interface DataEntity : Entity {
    override var node: Any
    override var parent: Any?
    override var children: Array<Any>?
    var level: Number
}

external interface NodeElementSelect {
    var selectHandle: HTMLSpanElement?
    var type: NodeElementSelectType
}

external interface NodeElementSelectType {
    var isTreeNode: Boolean
}

external interface FlattenNode {
    var parent: FlattenNode?
    var children: Array<FlattenNode>
    var pos: String
    var data: DataNode
    var isStart: Array<Boolean>
    var isEnd: Array<Boolean>
}

external interface TreeCheckedKeys {
    var checked: Array<String>
    var halfChecked: Array<String>
}

external interface TreeLoadInfo {
    var event: String /* "load" */
    var node: TreeNodeComponent
}
