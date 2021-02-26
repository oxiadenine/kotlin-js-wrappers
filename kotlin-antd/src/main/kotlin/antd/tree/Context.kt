package antd.tree

import antd.*
import kotlinext.js.Record
import org.w3c.dom.*
import react.*
import kotlin.js.*

external val treeContext: RContext<TreeContextProps?>

external interface TreeContextProps {
    var prefixCls: String
    var selectable: Boolean
    var showIcon: Boolean
    var icon: IconType
    var switcherIcon: IconType
    var draggable: Boolean
    var checkable: Any /* Boolean | ReactNode */
    var checkStrictly: Boolean
    var disabled: Boolean
    var keyEntities: Record<Key, DataEntity>
    var loadData: (treeNode: EventDataNode) -> Promise<Unit>
    var filterTreeNode: (treeNode: EventDataNode) -> Boolean
    var titleRender: ((node: DataNode) -> ReactNode)?
    var onNodeClick: NodeMouseEventHandler
    var onNodeDoubleClick: NodeMouseEventHandler
    var onNodeExpand: NodeMouseEventHandler
    var onNodeSelect: NodeMouseEventHandler
    var onNodeCheck: (e: MouseEvent<HTMLSpanElement>, treeNode: EventDataNode, checked: Boolean) -> Unit
    var onNodeLoad: (treeNode: EventDataNode) -> Unit
    var onNodeMouseEnter: NodeMouseEventHandler
    var onNodeMouseLeave: NodeMouseEventHandler
    var onNodeContextMenu: NodeMouseEventHandler
    var onNodeDragStart: NodeDragEventHandler
    var onNodeDragEnter: NodeDragEventHandler
    var onNodeDragOver: NodeDragEventHandler
    var onNodeDragLeave: NodeDragEventHandler
    var onNodeDragEnd: NodeDragEventHandler
    var onNodeDrop: NodeDragEventHandler
}

external interface NodeMouseEventParams<T : HTMLSpanElement> {
    var event: MouseEvent<T>
    var node: EventDataNode
}

external interface NodeDragEventParams<T : HTMLDivElement> {
    var event: MouseEvent<T>
    var node: EventDataNode
}

typealias NodeMouseEventHandler = (e: MouseEvent<HTMLSpanElement>, node: EventDataNode) -> Unit
typealias NodeDragEventHandler = (e: MouseEvent<HTMLDivElement>, node: NodeInstance) -> Unit
