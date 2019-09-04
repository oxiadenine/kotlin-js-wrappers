package antd.tree

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.tree(handler: RHandler<TreeProps>) = child(TreeComponent::class, handler)
fun RBuilder.treeNode(handler: RHandler<TreeNodeProps>) = child(TreeComponent.TreeNode, jsObject {}, handler)
fun RBuilder.directoryTree(handler: RHandler<DirectoryTreeProps>) = child(TreeComponent.DirectoryTree, jsObject {}, handler)
