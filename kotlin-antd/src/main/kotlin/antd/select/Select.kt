@file:JsModule("antd/lib/select")
@file:JsNonModule

package antd.select

import antd.KeyboardEventHandler
import antd.MouseEventHandler
import antd.UIEventHandler
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import react.*

@JsName("default")
external class SelectComponent<T : SelectValue> : Component<SelectProps<T>, RState> {
    companion object {
        val Option: OptionComponent
        val OptGroup: OptionGroupComponent
    }

    override fun render(): ReactElement?
}

external interface SelectProps<T : SelectValue> : AbstractSelectProps, RProps {
    var value: T?
    var defaultValue: T?
    var mode: SelectMode?
    var optionLabelProp: String?
    var firstActiveValue: Any? /* String | Array<String> */
    var onChange: ((value: T, option: Any /* ReactElement | Array<ReactElement> */) -> Unit)?
    var onSelect: ((value: T, option: Any /* String | ReactElement */) -> Unit)?
    var onDeselect: ((value: T) -> Unit)?
    var onBlur: ((value: T) -> Unit)?
    var onFocus: (() -> Unit)?
    var onPopupScroll: UIEventHandler<HTMLDivElement>?
    var onInputKeyDown: ((e: KeyboardEventHandler<HTMLInputElement>) -> Unit)?
    var onMouseEnter: ((e: MouseEventHandler<HTMLInputElement>) -> Unit)?
    var onMouseLeave: ((e: MouseEventHandler<HTMLInputElement>) -> Unit)?
    var maxTagCount: Number?
    var maxTagTextLength: Number?
    var maxTagPlaceholder: Any? /*  ReactElement | SelectMaxTagPlaceholder */
    var optionFilterProp: String?
    var labelInValue: Boolean?
    var tokenSeparators: Array<String>?
    var getInputElement: () -> ReactElement?
    var autoFocus: Boolean?
    var suffixIcon: Any? /* String | ReactElement */
    var removeIcon: Any? /* String | ReactElement */
    var clvearIcon: Any? /* String | ReactElement */
    var menuItemSelectedIcon: Any? /* String | ReactElement */
}

external interface AbstractSelectProps {
    var prefixCls: String?
    var className: String?
    var showAction: Any? /* String | Array<String> */
    var size: SelectSize?
    var notFoundContent: Any? /* String | ReactElement */
    var transitionName: String?
    var choiceTransitionName: String?
    var showSearch: Boolean?
    var allowClear: Boolean?
    var disabled: Boolean?
    var showArrow: Boolean?
    var style: dynamic
    var tabIndex: Number?
    var placeholder: Any? /* String | ReactElement */
    var defaultActiveFirstOption: Boolean?
    var dropdownClassName: String?
    var dropdownStyle: dynamic
    var dropdownMenuStyle: dynamic
    var dropdownMatchSelectWidth: Boolean?
    var onSearch: ((value: String) -> Unit)?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var filterOption: Any? /* Boolean | SelectFilterOption */
    var id: String?
    var defaultOpen: Boolean?
    var open: Boolean?
    var onDropdownVisibleChange: ((open: Boolean) -> Unit)?
    var autoClearSearchValue: Boolean?
    var dropdownRender: ((menu: ReactElement?, props: SelectProps<Any>?) -> Any /* String | ReactElement */)?
    var loading: Boolean?
}

external interface LabeledValue {
    var key: String
    var label: Any /* String | ReactElement */
}

external interface SelectLocale {
    var notFoundContent: String?
}
