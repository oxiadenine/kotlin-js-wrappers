@file:JsModule("antd/lib/tree-select")
@file:JsNonModule

package antd.treeselect

import antd.*
import antd.configprovider.*
import antd.select.*
import antd.tree.*
import org.w3c.dom.*
import react.*
import kotlin.js.*

@JsName("default")
external class TreeSelectComponent<T : DefaultValueType> : Component<TreeSelectProps<T>, RState> {
    companion object {
        val TreeNode: TreeNodeComponent

        val SHOW_ALL: String
        val SHOW_PARENT: String
        val SHOW_CHILD: String
    }

    override fun render(): ReactElement?
}

external interface TreeSelectProps<T> : RcTreeSelectProps<T>, RProps {
    var suffixIcon: Any? /* String | ReactElement */
    var size: SizeType?
    var bordered: Boolean?
}

external interface RcTreeSelectProps<ValueType> {
    var multiple: Boolean?
    var showArrow: Boolean?
    var showSearch: Boolean?
    var open: Boolean?
    var defaultOpen: Boolean?
    var value: ValueType?
    var defaultValue: ValueType?
    var disabled: Boolean?
    var placeholder: Any? /* String | ReactElement */
    var inputValue: String?
    var searchValue: String?
    var autoClearSearchValue: Boolean?
    var maxTagTextLength: Number?
    var maxTagCount: Number?
    var maxTagPlaceholder: Any?
    var loadData: ((dataNode: LegacyDataNode) -> Promise<Any>)?
    var treeNodeFilterProp: String?
    var treeNodeLabelProp: String?
    var treeDataSimpleMode: Any? /* Boolean | SimpleModeConfig */
    var treeExpandedKeys: Array<Key>?
    var treeDefaultExpandedKeys: Array<Key>?
    var treeLoadedKeys: Array<Key>?
    var treeCheckable: Any? /* Boolean | String | ReactElement */
    var treeCheckStrictly: Boolean?
    var showCheckedStrategy: CheckedStrategy?
    var treeDefaultExpandAll: Boolean?
    var treeData: Array<DataNode>?
    var treeLine: Boolean?
    var treeIcon: IconType?
    var showTreeIcon:Boolean?
    var switcherIcon: IconType?
    var treeMotion: Any?
    var children: Any?
    var filterTreeNode: Any? /* Boolean | FilterFunc<LegacyDataNode> */
    var dropdownPopupAlign: Any?
    var onSearch: ((value: String) -> Unit)?
    var onChange: ((value: ValueType, labelList: Any /* String | ReactElement */, extra: ChangeEventExtra) -> Unit)?
    var onTreeExpand: ((expandedKeys: Array<Key>) -> Unit)?
    var onTreeLoad: ((loadedKeys: Array<Key>) -> Unit)?
    var onDropdownVisibleChange: ((open: Boolean) -> Unit)?
    var searchPlaceholder: Any? /* String | ReactElement */
    /* RcSelectProps */
    var prefixCls: String?
    var id: String?
    var className: String?
    var style: dynamic
    var options: OptionsType?
    var labelInValue: Boolean?
    var optionFilterProp: String?
    var onClear: OnClear?
    var allowClear: Boolean?
    var clearIcon: Any? /* String | ReactElement */
    var inputIcon: RenderNode?
    var removeIcon: Any? /* String | ReactElement */
    var listHeight: Number?
    var listItemHeight: Number?
    var dropdownStyle: dynamic
    var dropdownClassName: String?
    var dropdownMatchSelectWidth: Any? /* Boolean | Number */
    var virtual: Boolean?
    var dropdownRender: ((menu: ReactElement) -> ReactElement)?
    var animation: String?
    var transitionName: String?
    var getPopupContainer: RenderDOMFunc?
    var direction: String?
    var loading: Boolean?
    var autoFocus: Boolean?
    var defaultActiveFirstOption: Boolean?
    var notFoundContent: Any? /* String | ReactElement */
    var tagRender: ((props: CustomTagProps) -> ReactElement)?
    var showAction: Array<String>?
    var tabIndex: Number?
    var onKeyUp: KeyboardEventHandler<HTMLDivElement>?
    var onKeyDown: KeyboardEventHandler<HTMLDivElement>?
    var onPopupScroll: UIEventHandler<HTMLDivElement>?
    var onSelect: ((value: SingleType<ValueType>, option: OptionsType) -> Unit)?
    var onDeselect: ((value: SingleType<ValueType>, option: OptionsType) -> Unit)?
    var onInputKeyDown: KeyboardEventHandler<HTMLInputElement>?
    var onClick: MouseEventHandler<Any>?
    var onBlur: FocusEventHandler<HTMLElement>?
    var onFocus: FocusEventHandler<HTMLElement>?
    var onMouseDown: MouseEventHandler<HTMLDivElement>?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
    var choiceTransitionName: String?
}

external interface LabeledValue {
    var key: String?
    var value: RawValue
    var label: Any? /* String | ReactElement */
}

external interface LabelValueType {
    var key: Key?
    var value: RawValueType?
    var label: Any? /* String | ReactElement */
    var halfChecked: Boolean?
}

external interface DataNode {
    var value: RawValueType?
    var title: Any? /* String | ReactElement */
    var label: Any? /* String | ReactElement */
    var key: Key?
    var disabled: Boolean?
    var disableCheckbox: Boolean?
    var checkable: Boolean?
    var children: Any? /* String | ReactElement | Array<InnerDataNode> | Array<TreeDataNode> */
}

external interface InnerDataNode : DataNode {
    override var key: Key?
    override var value: RawValueType?
    override var label: Any? /* String | ReactElement */
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
    var node: ReactElement;
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

