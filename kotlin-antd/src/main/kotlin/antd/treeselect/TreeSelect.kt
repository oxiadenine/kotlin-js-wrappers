@file:JsModule("antd/lib/tree-select")
@file:JsNonModule

package antd.treeselect

import antd.*
import antd.select.*
import org.w3c.dom.*
import react.*

@JsName("default")
external class TreeSelectComponent<T : TreeNodeValue> : Component<TreeSelectProps<T>, RState> {
    companion object {
        val TreeNode: TreeNodeComponent

        val SHOW_ALL: String
        val SHOW_PARENT: String
        val SHOW_CHILD: String
    }

    override fun render(): ReactElement?
}

external interface TreeSelectProps<T : TreeNodeValue> : AbstractSelectProps, RProps {
    var autoFocus: Boolean?
    var defaultValue: T?
    override var dropdownStyle: dynamic
    var filterTreeNode: ((inputValue: String, treeNode: Any) -> Boolean)?
    var labelInValue: Boolean?
    var loadData: ((node: Any) -> Unit)?
    var maxTagCount: Number?
    var maxTagPlaceholder: Any? /* ReactElement | MaxTagPlaceholderFn */
    var multiple: Boolean?
    override var notFoundContent: Any? /* String | ReactElement */
    var onChange: ((value: T, label: Any, extra: Any) -> Unit)?
    override var onSearch: dynamic /* (value: Any) -> Unit */
    var onSelect: ((value: Any) -> Unit)?
    var onTreeExpand: ((keys: Array<String>) -> Unit)?
    var onFocus: FocusEventHandler<HTMLInputElement>?
    var onBlur: FocusEventHandler<HTMLInputElement>?
    var searchPlaceholder: String?
    var searchValue: String?
    var showCheckedStrategy: CheckedStrategy?
    var suffixIcon: Any? /* String | ReactElement */
    var treeCheckable: Any? /* Boolean | ReactElement */
    var treeCheckStrictly: Boolean?
    var treeData: Array<TreeNode>?
    var treeDataSimpleMode: Any? /* Boolean | TreeDataSimpleMode */
    var treeDefaultExpandAll: Boolean?
    var treeDefaultExpandedKeys: Array<String>?
    var treeExpandedKeys: Array<String>?
    var treeIcon: Boolean?
    var treeNodeFilterProp: String?
    var treeNodeLabelProp: String?
    var value: T?
}
