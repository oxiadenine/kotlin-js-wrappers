package antd.select

typealias SelectValue = Any /* String | Array<String> | Number | Array<Number> | LabeledValue | Array<LabeledValue> */
typealias SelectSize = String /* "default" | "large" | "small" */
typealias SelectMode = String /* "default" | "multiple" | "tags" | "combobox" */

typealias SelectFilterOption = (inputValue: String, option: Any /* String | ReactElement */) -> Any
typealias SelectMaxTagPlaceholder = (omittedValues: Array<SelectValue>) -> Any /* String | ReactElement */
