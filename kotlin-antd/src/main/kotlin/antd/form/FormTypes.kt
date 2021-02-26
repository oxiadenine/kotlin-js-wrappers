package antd.form

import antd.ReactNode
import kotlin.js.*

typealias FormLayout = String /* "horizontal" | "inline" | "vertical" */
typealias SizeType = String /* "small" | "middle" | "large" */
typealias FormLabelAlign = String /* "left" | "right" */
typealias FormItemValidateStatus = String /* "success" | "warning" | "error" | "validating" | "" */
typealias RequiredMark = Any /* Boolean | "optional" */

typealias RenderChildren<Values> = (form: FormInstance<Values>) -> ReactNode
typealias ChildrenType<Values> = Any /* RenderChildren<Values> | ReactNode */
typealias LabelTooltipType = Any /* WrapperTooltipProps | ReactNode */
typealias ValidateStatus = String /* "success" | "warning" | "error" | "validating" | "" */

typealias InternalNamePath = Any /* String | Array<String> | Number */
typealias NamePath = Any /* String | Number | InternalNamePath */
typealias StoreValue = Any
typealias RuleType = String /* "string" | "number" | "boolean" | "method" | "regexp" | "integer" | "float" | "object" | "enum" | "date" | "url" | "hex" | "email" */
typealias Validator = (rule: RuleObject, value: StoreValue?, callback: (error: String?) -> Unit) -> Any /* Promise<Any> | Unit */
typealias RuleRender = (form: FormInstance<Any>) -> RuleObject
typealias RuleObject = Any /* AggregationRule | ArrayRule */
typealias Rule = Any /* RuleObject | RuleRender */
typealias InternalValidateFields = (nameList: Array<NamePath>, options: ValidateOptions?) -> Promise<Store>
typealias ValidateMessage = Any /* String | () -> String */
typealias Updater<ValueType> = (prev: ValueType?) -> ValueType
typealias ShouldUpdate<Values> = Any /* Boolean | (prevValues: Values, nextValues: Values, info: ShouldUpdateInfo) -> Boolean */
typealias EventArgs = Array<Any>
typealias ReducerAction = Any /* UpdateAction | ValidateAction */
