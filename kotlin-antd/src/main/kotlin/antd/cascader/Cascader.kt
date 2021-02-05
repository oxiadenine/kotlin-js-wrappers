@file:JsModule("antd/lib/cascader")
@file:JsNonModule

package antd.cascader

import antd.configprovider.SizeType
import org.w3c.dom.*
import react.*

@JsName("default")
external object CascaderComponent : Component<CascaderProps, CascaderState> {
    override fun render(): ReactElement?
}

external interface CascaderProps : RProps {
    var options: Array<CascaderOptionType>
    var defaultValue: CascaderValueType?
    var value: CascaderValueType?
    var onChange: ((value: CascaderValueType, selectedOptions: Array<CascaderOptionType>?) -> Unit)?
    var displayRender: ((label: Array<String>, selectedOptions: Array<CascaderOptionType>?) -> Any /* String | ReactElement */)?
    var style: dynamic
    var className: String?
    var popupClassName: String?
    var popupPlacement: String? /* "bottomLeft" | "bottomRight" | "topLeft" | "topRight" */
    var placeholder: String?
    var size: SizeType?
    var name: String?
    var id: String?
    var bordered: Boolean?
    var disabled: Boolean?
    var allowClear: Boolean?
    var autoFocus: Boolean?
    var showSearch: Any? /* Boolean | ShowSearchType */
    var notFoundContent: Any? /* String | ReactElement */
    var loadData: ((selectedOptions: Array<CascaderOptionType>?) -> Unit)?
    var expandTrigger: CascaderExpandTrigger?
    var expandIcon: Any? /* String | ReactElement */
    var changeOnSelect: Boolean?
    var onPopupVisibleChange: ((popupVisible: Boolean) -> Unit)?
    var prefixCls: String?
    var inputPrefixCls: String?
    var getPopupContainer: ((triggerNode: HTMLElement?) -> HTMLElement)?
    var popupVisible: Boolean?
    var fieldNames: FieldNamesType?
    var suffixIcon: Any? /* String | ReactElement */
    var dropdownRender: ((menus: Any /* String | ReactElement */) -> Any? /* String | ReactElement */)?
}

external interface CascaderState : RState {
    var inputFocused: Boolean
    var inputValue: String
    var value: CascaderValueType
    var popupVisible: Boolean?
    var flattenOptions: Array<Array<CascaderOptionType>>?
    var prevProps: CascaderProps
}

external interface CascaderLocale {
    var placeholder: String?
}

external interface CascaderOptionType {
    var value: Any? /* String | Number */
    var label: Any? /* String | ReactElement */
    var disabled: Boolean?
    var isLeaf: Boolean?
    var loading: Boolean?
    var children: Array<CascaderOptionType>?
}

external interface FieldNamesType {
    var value: Any? /* String | Number */
    var label: String?
    var children: String?
}

external interface FilledFieldNamesType {
    var value: Any /* String | Number */
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
