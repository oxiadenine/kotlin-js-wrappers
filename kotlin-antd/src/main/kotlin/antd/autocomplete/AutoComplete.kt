@file:JsModule("antd/lib/auto-complete")
@file:JsNonModule

package antd.autocomplete

import antd.*
import antd.select.*
import kotlinext.js.*
import react.*

@JsName("default")
external object AutoCompleteComponent : Component<AutoCompleteProps, RState> {
    val Option: OptionComponent
    val OptGroup: OptionGroupComponent

    override fun render(): ReactElement?
}

external interface AutoCompleteProps : AbstractSelectProps, RProps {
    var value: SelectValue?
    var defaultValue: SelectValue?
    var dataSource: Array<DataSourceItemType>?
    var autoFocus: Boolean?
    var backfill: Boolean?
    var optionLabelProp: String?
    var onChange: ((value: SelectValue) -> Unit)?
    var onSelect: ((value: SelectValue, option: Object) -> Any)?
    var onBlur: (() -> Any)?
    var onFocus: (() -> Any)?
    var children: Any? /* ValidInputElement | ReactElement | Array<ReactElement> */
}

external interface AutoCompleteInputProps {
    var onChange: FormEventHandler<Any>
    var value: Any
}

external interface DataSourceItemObject {
    var value: String
    var text: String
}
