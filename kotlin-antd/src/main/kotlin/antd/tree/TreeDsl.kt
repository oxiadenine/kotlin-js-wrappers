package antd.tree

import kotlinext.js.*
import react.*

fun RBuilder.tree(handler: RHandler<TreeProps>) = child(TreeComponent::class, handler)
fun RBuilder.treeNode(handler: RHandler<InternalTreeNodeProps>) = child(TreeComponent.TreeNode, jsObject {}, handler)
fun RBuilder.directoryTree(handler: RHandler<DirectoryTreeProps>) = child(TreeComponent.DirectoryTree, jsObject {}, handler)
