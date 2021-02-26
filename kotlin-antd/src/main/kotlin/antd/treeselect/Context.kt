package antd.treeselect

import antd.Key
import antd.tree.*
import react.*
import kotlin.js.*

external val selectContext: RContext<ContextProps>

external interface ContextProps {
    var checkable: Any /* Boolean | ReactNode */
    var checkedKeys: Array<Key>
    var halfCheckedKeys: Array<Key>
    var treeExpandedKeys: Array<Key>
    var treeDefaultExpandedKeys: Array<Key>
    var onTreeExpand: (keys: Array<Key>) -> Unit
    var treeDefaultExpandAll: Boolean
    var treeIcon: IconType
    var showTreeIcon: Boolean
    var switcherIcon: IconType
    var treeLine: Boolean
    var treeNodeFilterProp: String
    var treeLoadedKeys: Array<Key>
    var treeMotion: Any
    var loadData: (treeNode: LegacyDataNode) -> Promise<Any>
    var onTreeLoad: (loadedKeys: Array<Key>) -> Unit
}
