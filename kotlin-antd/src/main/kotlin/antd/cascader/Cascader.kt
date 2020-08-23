@file:JsModule("antd/lib/cascader")
@file:JsNonModule

package antd.cascader

import org.w3c.dom.HTMLElement
import react.*

@JsName("default")
external object CascaderComponent : Component<CascaderProps, CascaderState> {
    override fun render(): ReactElement?
}

external interface CascaderProps : RProps {
    var options: Array<CascaderOptionType>
    var defaultValue: Array<String>?
    var value: Array<String>?
    var onChange: ((value: Array<String>, selectedOptions: Array<CascaderOptionType>?) -> Unit)?
    var displayRender: ((label: Array<String>, selectedOptions: Array<CascaderOptionType>?) -> Any /* String | ReactElement */)?
    var style: dynamic
    var className: String?
    var popupClassName: String?
    var popupPlacement: CascaderPopupPlacement?
    var placeholder: String?
    var size: CascaderSize?
    var disabled: Boolean?
    var allowClear: Boolean?
    var showSearch: Any? /* Boolean | ShowSearchType */
    var notFoundContent: Any? /* String | ReactElement */
    var loadData: ((selectedOptions: Array<CascaderOptionType>?) -> Unit)?
    var expandTrigger: CascaderExpandTrigger?
    var changeOnSelect: Boolean?
    var onPopupVisibleChange: ((popupVisible: Boolean) -> Unit)?
    var prefixCls: String?
    var inputPrefixCls: String?
    var getPopupContainer: ((triggerNode: HTMLElement?) -> HTMLElement)?
    var popupVisible: Boolean?
    var fieldNames: FieldNamesType?
    var suffixIcon: Any? /* String | ReactElement */
}

external interface CascaderState : RState {
    var inputFocused: Boolean
    var inputValue: String
    var value: Array<String>
    var popupVisible: Boolean?
    var flattenOptions: Array<Array<CascaderOptionType>>?
    var prevProps: CascaderProps
}

external interface CascaderLocale {
    var placeholder: String?
}

external interface CascaderOptionType {
    var value: String?
    var label: Any? /* String | ReactElement */
    var disabled: Boolean?
    var children: Array<CascaderOptionType>?
    /* [key: String]: Any */
}

external interface FieldNamesType {
    var value: String?
    var label: String?
    var children: String?
}

external interface FilledFieldNamesType {
    var value: String
    var label: String
    var children: String
}

external interface ShowSearchType {
    var filter: ((inputValue: String, path: Array<CascaderOptionType>, names: FilledFieldNamesType) -> Boolean)?
    var render: ((inputValue: String, path: Array<CascaderOptionType>, prefixCls: String?, names: FilledFieldNamesType) -> Any /* String | ReactElement */)?
    var sort: ((a: Array<CascaderOptionType>, b: Array<CascaderOptionType>, inputValue: String, names: FilledFieldNamesType) -> Number)?
    var matchInputWidth: Boolean?
    var limit: Any? /* Number | Boolean */
}
