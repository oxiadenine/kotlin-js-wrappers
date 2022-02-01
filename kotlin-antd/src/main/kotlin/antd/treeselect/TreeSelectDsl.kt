package antd.treeselect

import kotlinext.js.*
import react.*

inline fun <T : DefaultValueType, reified TSC : TreeSelectComponent<T>> RBuilder.treeSelect(noinline handler: RHandler<TreeSelectProps<T>>) = child(TSC::class, handler)
fun RBuilder.treeNode(handler: RHandler<TreeNodeProps>) = child(TreeSelectComponent.TreeNode, jso {}, handler)
