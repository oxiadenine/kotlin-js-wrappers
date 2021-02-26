package antd.treeselect

typealias RawValue = Any /* String | Number */
typealias SelectValue = Any /* RawValue | Array<RawValue> | LabeledValue | Array<LabeledValue> */

typealias SelectSource = String /* "option" | "selection" | "input" | "clear" */
typealias RawValueType = Any /* String | Number */
typealias DefaultValueType = Any /* RawValueType | Array<RawValueType> | LabelValueType | Array<LabelValueType> */
typealias CheckedStrategy = String /* "SHOW_ALL" | "SHOW_PARENT" | "SHOW_CHILD" */
