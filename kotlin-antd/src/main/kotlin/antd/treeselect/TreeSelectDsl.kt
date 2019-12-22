package antd.treeselect

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

inline fun <T : TreeNodeValue, reified TSC : TreeSelectComponent<T>> RBuilder.treeSelect(noinline handler: RHandler<TreeSelectProps<T>>) = child(TSC::class, handler)
fun RBuilder.treeNode(handler: RHandler<TreeNodeProps>) = child(TreeSelectComponent.TreeNode, jsObject {}, handler)
