package antd.treeselect

typealias MaxTagPlaceholderFn = (omittedValues: Array<Any>) -> Any /* String | ReactElement */

typealias TreeNodeValue = Any /* String | Number | Array<String> | Array<Number> */
typealias TreeNode = Any /* TreeNodeNormal | TreeNodeSimpleMode */

typealias CheckedStrategy = String /* "SHOW_ALL" | "SHOW_PARENT" | "SHOW_CHILD" */
