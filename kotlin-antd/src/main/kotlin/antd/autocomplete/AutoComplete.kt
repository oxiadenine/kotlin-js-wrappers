@file:JsModule("antd/lib/auto-complete")

package antd.autocomplete

import antd.FormEventHandler
import antd.select.AbstractSelectProps
import antd.select.OptionComponent
import antd.select.OptionGroupComponent
import antd.select.SelectValue
import kotlinext.js.Object
import react.Component
import react.RProps
import react.RState
import react.ReactElement

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
