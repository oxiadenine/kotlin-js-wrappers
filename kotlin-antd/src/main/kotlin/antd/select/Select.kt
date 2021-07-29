@file:JsModule("antd/lib/select")
@file:JsNonModule

package antd.select

import antd.*
import antd.ReactNode
import antd.configprovider.*
import org.w3c.dom.*
import react.*

@JsName("default")
external class SelectComponent<VT : SelectValue> : Component<SelectProps<VT>, State> {
    companion object {
        val Option: OptionComponent
        val OptGroup: OptionGroupComponent
    }

    override fun render(): ReactElement?
}

external interface SelectProps<VT : SelectValue> : InternalSelectProps<VT>, RProps {
    override var mode: String? /* "multiple" | "tags" */
    var ref: Any? /* (instance: RefSelectProps?) -> Unit | RefObject<RefSelectProps> */
}

external interface RefSelectProps {
    var focus: () -> Unit
    var blur: () -> Unit
}

external interface InternalSelectProps<VT> : RcSelectProps<Any, VT> {
    var suffixIcon: ReactNode?
    var size: SizeType
    override var mode: String? /* "multiple" | "tags" */
    var bordered: Boolean?
}

external interface RcSelectProps<OptionsType, ValueType> : AriaAttributes {
    var prefixCls: String?
    var id: String?
    var className: String?
    var style: dynamic
    var options: OptionsType?
    var children: ReactNode?
    var mode: Mode?
    var value: ValueType?
    var defaultValue: ValueType?
    var labelInValue: Boolean?
    var inputValue: String?
    var searchValue: String?
    var optionFilterProp: String?
    var filterOption: Any? /* Boolean | FilterFunc<OptionsType> */
    var showSearch: Boolean?
    var autoClearSearchValue: Boolean?
    var onSearch: ((value: String) -> Unit)?
    var onClear: OnClear?
    var allowClear: Boolean?
    var clearIcon: ReactNode?
    var showArrow: Boolean?
    var inputIcon: RenderNode?
    var removeIcon: ReactNode?
    var menuItemSelectedIcon: RenderNode?
    var open: Boolean?
    var defaultOpen: Boolean?
    var listHeight: Number?
    var listItemHeight: Number?
    var dropdownStyle: dynamic
    var dropdownClassName: String?
    var dropdownMatchSelectWidth: Any? /* Boolean | Number */
    var virtual: Boolean?
    var dropdownRender: ((menu: ReactElement) -> ReactElement)?
    var dropdownAlign: Any?
    var animation: String?
    var transitionName: String?
    var getPopupContainer: RenderDOMFunc?
    var direction: String?
    var disabled: Boolean?
    var loading: Boolean?
    var autoFocus: Boolean?
    var defaultActiveFirstOption: Boolean?
    var notFoundContent: ReactNode?
    var placeholder: ReactNode?
    var backfill: Boolean?
    var getInputElement: (() -> ReactNode)?
    var optionLabelProp: String?
    var maxTagTextLength: Number?
    var maxTagCount: Number?
    var maxTagPlaceholder: Any? /*ReactNode | (omittedValues: Array<LabelValueType>) -> ReactNode */
    var tokenSeparators: Array<String>?
    var tagRender: ((props: CustomTagProps) -> ReactElement)?
    var showAction: Array<String>?
    var tabIndex: Number?
    var onKeyUp: KeyboardEventHandler<HTMLDivElement>?
    var onKeyDown: KeyboardEventHandler<HTMLDivElement>?
    var onPopupScroll: UIEventHandler<HTMLDivElement>?
    var onDropdownVisibleChange: ((open: Boolean) -> Unit)?
    var onSelect: ((value: SingleType<ValueType>, option: OptionsType) -> Unit)?
    var onDeselect: ((value: SingleType<ValueType>, option: OptionsType) -> Unit)?
    var onInputKeyDown: KeyboardEventHandler<HTMLInputElement>?
    var onClick: MouseEventHandler<Any>?
    var onChange: ((value: ValueType, option: Any /* OptionsType | OptionsType */) -> Unit)?
    var onBlur: FocusEventHandler<HTMLElement>?
    var onFocus: FocusEventHandler<HTMLElement>?
    var onMouseDown: MouseEventHandler<HTMLDivElement>?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
    var choiceTransitionName: String?
}

external interface SingleType<MT>

external interface OptionData : OptionCoreData

external interface FlattenOptionData {
    var group: Boolean?
    var groupOption: Boolean?
    var key: Any /* String | Number */
    var data: Any /* OptionData | OptionGroupData */
}

external interface CustomTagProps {
    var label: DefaultValueType
    var value: DefaultValueType
    var disabled: Boolean
    var onClose: (event: MouseEvent<HTMLElement>) -> Unit
    var closable: Boolean
}

external interface LabelValueType {
    var key: Key?
    var value: RawValueType?
    var label: ReactNode?
}

external interface LabeledValue {
    var key: String
    var label: ReactNode
}

external interface SelectLocale {
    var notFoundContent: String?
}

external interface OnActiveValueInfo {
    var source: String? /* "keyboard" | "mouse" */
}
