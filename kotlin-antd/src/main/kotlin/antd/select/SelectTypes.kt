package antd.select

import org.w3c.dom.*

typealias SelectValue = Any /* RawValue | Array<RawValue> | LabeledValue | Array<LabeledValue> */

typealias RenderDOMFunc = (props: Any) -> HTMLElement
typealias RenderNode = Any /* String | ReactElement | (props: Any) -> ReactElement */
typealias Mode = String /* "multiple" | "tags" | "combobox" */
typealias OptionsType = Array<Any /* OptionData | OptionGroupData */>

typealias SelectSource = String /* "option" | "selection" | "input" */
typealias Key = Any /* String | Number */
typealias RawValueType = Any /* String | Number */
typealias DefaultValueType = Any /* RawValueType | Array<RawValueType> | LabelValueType | Array<LabelValueType> */
typealias OnClear = () -> Unit
typealias OnActiveValue = (active: RawValueType, index: Number, info: dynamic) -> Unit
typealias FilterFunc<OptionsType> = (inputValue: String, option: OptionsType) -> Boolean
