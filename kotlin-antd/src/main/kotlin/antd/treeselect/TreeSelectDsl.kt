package antd.treeselect

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.treeSelect(handler: RHandler<TreeSelectProps<TreeNodeValue>>) = child(TreeSelectComponent::class, handler)
fun RBuilder.treeNode(handler: RHandler<TreeNodeProps>) = child(TreeSelectComponent.TreeNode, jsObject {}, handler)
