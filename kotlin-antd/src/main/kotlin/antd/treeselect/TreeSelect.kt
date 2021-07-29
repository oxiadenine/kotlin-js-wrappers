@file:JsModule("antd/lib/tree-select")
@file:JsNonModule

package antd.treeselect

import antd.*
import antd.ReactNode
import antd.configprovider.*
import antd.select.*
import antd.tree.*
import react.*
import kotlin.js.*

@JsName("default")
external class TreeSelectComponent<T : DefaultValueType> : Component<TreeSelectProps<T>, State> {
    companion object {
        val TreeNode: TreeNodeComponent

        val SHOW_ALL: String
        val SHOW_PARENT: String
        val SHOW_CHILD: String
    }

    override fun render(): ReactElement?
}

external interface TreeSelectProps<T> : RcTreeSelectProps<T>, RefTreeSelectProps, RProps {
    var suffixIcon: ReactNode?
    var size: SizeType?
    var bordered: Boolean?
    var ref: Any? /* (instance: RefTreeSelectProps) -> Unit | RefObject<RefTreeSelectProps> */
}

external interface RefTreeSelectProps {
    var focus: () -> Unit
    var blur: () -> Unit
}

external interface RcTreeSelectProps<ValueType> : RcSelectProps<Array<DataNode>, ValueType> {
    var multiple: Boolean?
    override var showArrow: Boolean?
    override var showSearch: Boolean?
    override var open: Boolean?
    override var defaultOpen: Boolean?
    override var value: ValueType?
    override var defaultValue: ValueType?
    override var disabled: Boolean?
    override var placeholder: ReactNode?
    override var inputValue: String?
    override var searchValue: String?
    override var autoClearSearchValue: Boolean?
    override var maxTagTextLength: Number?
    override var maxTagCount: Number?
    override var maxTagPlaceholder: Any?
    var loadData: ((dataNode: LegacyDataNode) -> Promise<Any>)?
    var treeNodeFilterProp: String?
    var treeNodeLabelProp: String?
    var treeDataSimpleMode: Any? /* Boolean | SimpleModeConfig */
    var treeExpandedKeys: Array<Key>?
    var treeDefaultExpandedKeys: Array<Key>?
    var treeLoadedKeys: Array<Key>?
    var treeCheckable: Any? /* Boolean | ReactNode */
    var treeCheckStrictly: Boolean?
    var showCheckedStrategy: CheckedStrategy?
    var treeDefaultExpandAll: Boolean?
    var treeData: Array<DataNode>?
    var treeLine: Boolean?
    var treeIcon: IconType?
    var showTreeIcon:Boolean?
    var switcherIcon: IconType?
    var treeMotion: Any?
    override var children: ReactNode?
    var filterTreeNode: Any? /* Boolean | FilterFunc<LegacyDataNode> */
    var dropdownPopupAlign: Any?
    override var onSearch: ((value: String) -> Unit)?
    override var onChange: dynamic /* (value: ValueType, labelList: ReactNode, extra: ChangeEventExtra) -> Unit */
    var onTreeExpand: ((expandedKeys: Array<Key>) -> Unit)?
    var onTreeLoad: ((loadedKeys: Array<Key>) -> Unit)?
    override var onDropdownVisibleChange: ((open: Boolean) -> Unit)?
    var searchPlaceholder: ReactNode?
}

external interface LabeledValue {
    var key: String?
    var value: RawValue
    var label: ReactNode?
}

external interface LabelValueType {
    var key: Key?
    var value: RawValueType?
    var label: ReactNode?
    var halfChecked: Boolean?
}

external interface DataNode {
    var value: RawValueType?
    var title: ReactNode?
    var label: ReactNode?
    var key: Key?
    var disabled: Boolean?
    var disableCheckbox: Boolean?
    var checkable: Boolean?
    var children: Any? /* ReactNode | Array<InnerDataNode> | Array<TreeDataNode> */
}

external interface InnerDataNode : DataNode {
    override var key: Key?
    override var value: RawValueType?
    override var label: ReactNode?
    override var children: Any?
}

external interface LegacyDataNode : DataNode {
    var props: Any
}

external interface TreeDataNode : DataNode {
    override var key: Key?
    override var children: Any?
}

external interface FlattenDataNode {
    var data: DataNode
    var key: Key
    var level: Number
}

external interface SimpleModeConfig {
    var id: Key?
    var pId: Key?
    var rootPId: Key?
}

external interface LegacyCheckedNode {
    var pos: String
    var node: ReactElement
    var children: Array<LegacyCheckedNode>?
}

external interface ChangeEventExtra {
    var preValue: Array<LabelValueType>
    var triggerValue: RawValueType
    var selected: Boolean?
    var checked: Boolean?
    var triggerNode: ReactElement
    var allCheckedNodes: Array<LegacyCheckedNode>
}

