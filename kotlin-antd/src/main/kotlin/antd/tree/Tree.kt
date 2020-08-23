@file:JsModule("antd/lib/tree")
@file:JsNonModule

package antd.tree

import antd.MouseEvent
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement
import kotlin.js.Promise

@JsName("default")
external object TreeComponent : Component<TreeProps, RState> {
    val TreeNode: TreeNodeComponent
    val DirectoryTree: DirectoryTreeComponent

    override fun render(): ReactElement?
}

external interface TreeProps : RProps {
    var showLine: Boolean?
    var className: String?
    var multiple: Boolean?
    var autoExpandParent: Boolean?
    var checkStrictly: Boolean?
    var checkable: Boolean?
    var disabled: Boolean?
    var defaultExpandAll: Boolean?
    var defaultExpandParent: Boolean?
    var defaultExpandedKeys: Array<String>?
    var expandedKeys: Array<String>?
    var checkedKeys: Any? /* Array<String> | TreeCheckedKeys */
    var defaultCheckedKeys: Array<String>?
    var selectedKeys: Array<String>?
    var defaultSelectedKeys: Array<String>?
    var selectable: Boolean?
    var onExpand: Any? /* TreeExpandFn | Promise<Unit> */
    var onCheck: ((checkedKeys: Any /* Array<String> | TreeCheckedKeys */, e: TreeNodeCheckedEvent) -> Unit)?
    var onSelect: ((selectedKeys: Array<String>, e: TreeNodeSelectedEvent) -> Unit)?
    var onClick: ((e: MouseEvent<HTMLElement>, node: TreeNodeComponent) -> Unit)?
    var onDoubleClick: ((e: MouseEvent<HTMLElement>, node: TreeNodeComponent) -> Unit)?
    var filterAntTreeNode: ((node: TreeNodeComponent) -> Boolean)?
    var loadData: ((node: TreeNodeComponent) -> Promise<Unit>)?
    var loadedKeys: Array<String>
    var onLoad: ((loadedKeys: Array<String>, info: TreeLoadInfo) -> Unit)?
    var onRightClick: ((options: TreeNodeMouseEvent) -> Unit)?
    var draggable: Boolean?
    var onDragStart: ((options: TreeNodeMouseEvent) -> Unit)?
    var onDragEnter: ((options: TreeNodeDragEnterEvent) -> Unit)?
    var onDragOver: ((options: TreeNodeMouseEvent) -> Unit)?
    var onDragLeave: ((options: TreeNodeMouseEvent) -> Unit)?
    var onDragEnd: ((options: TreeNodeMouseEvent) -> Unit)?
    var onDrop: ((options: TreeNodeDropEvent) -> Unit)?
    var style: dynamic
    var showIcon: Boolean?
    var icon: Any? /* TreeNodeIconFn | ReactElement */
    var switcherIcon: ReactElement?
    var prefixCls: String?
    var filterTreeNode: ((node: TreeNodeComponent) -> Boolean)?
    var children: ReactElement?
    var blockNode: Boolean?
    var treeData: Array<TreeNodeNormal>?
}

external interface TreeCheckedKeys {
    var checked: Array<String>
    var halfChecked: Array<String>
}

external interface TreeLoadInfo {
    var event: String /* "load" */
    var node: TreeNodeComponent
}
