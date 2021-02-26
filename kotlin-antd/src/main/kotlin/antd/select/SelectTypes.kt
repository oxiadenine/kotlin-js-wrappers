package antd.select

import org.w3c.dom.*

typealias SelectValue = Any /* RawValue | Array<RawValue> | LabeledValue | Array<LabeledValue> */

typealias RenderDOMFunc = (props: Any) -> HTMLElement
typealias RenderNode = Any /* ReactNode | (props: Any) -> ReactNode */
typealias Mode = String /* "multiple" | "tags" | "combobox" */
typealias SelectOptionsType = Array<Any /* OptionData | OptionGroupData */>

typealias SelectSource = String /* "option" | "selection" | "input" */
typealias RawValueType = Any /* String | Number */
typealias DefaultValueType = Any /* RawValueType | Array<RawValueType> | LabelValueType | Array<LabelValueType> */
typealias OnClear = () -> Unit
typealias OnActiveValue = (active: RawValueType, index: Number, info: OnActiveValueInfo) -> Unit
typealias FilterFunc<OptionsType> = (inputValue: String, option: OptionsType) -> Boolean
