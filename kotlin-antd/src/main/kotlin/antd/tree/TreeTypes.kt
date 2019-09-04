package antd.tree

import react.ReactElement

typealias TreeExpandFn = (expandedKeys: Array<String>, info: TreeNodeExpandedEvent) -> Unit

typealias TreeNodeIconFn = (treeNode: TreeNodeAttribute) -> ReactElement

typealias DirectoryTreeExpandAction = Any /* Boolean | "click" | "doubleClick" */
