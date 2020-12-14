@file:JsModule("antd/lib/form")
@file:JsNonModule

package antd.form

import antd.grid.*
import react.*
import kotlin.js.*

@JsName("default")
external object FormComponent : Component<FormProps<Any>, RState> {
    val Item: FormItemComponent
    val List: FormListComponent
    val ErrorList: FormErrorListComponent
    val Provider: FormProvider

    fun useForm(form: FormInstance<Any>? = definedExternally): Array<FormInstance<Any>>

    override fun render(): ReactElement?
}

external interface FormProps<Values> : FormBaseProps<Values>, RcFormProps<Values>, RProps {
    var prefixCls: String?
    var colon: Boolean?
    override var name: String?
    var layout: FormLayout?
    var labelAlign: FormLabelAlign?
    var labelCol: ColProps?
    var wrapperCol: ColProps?
    override var form: FormInstance<Values>?
    var size: SizeType?
    var scrollToFirstError: Boolean?
    var requiredMark: RequiredMark?
    /** @deprecated Will warning in future branch. Pls use `requiredMark` instead. */
    var hideRequiredMark: Boolean?
}

external interface FormBaseProps<Values> {
    var children: Any? /* RenderProps | ReactElement */
    var ref: Any? /* (instance: FormInstance<Values>?) -> Unit | RMutableRef<FormInstance<Values>> */
}

external interface RcFormProps<Values> {
    var initialValues: Store?
    var form: FormInstance<Values>?
    var children: Any? /* RenderProps | ReactElement */
    var component: Any? /* Boolean | String | FunctionalComponent<RProps> | RClass<RProps> */
    var fields: Array<FieldData>?
    var name: String?
    var validateMessages: ValidateMessages?
    var onValuesChange: ((changedValues: Any, values: Values) -> Unit)?
    var onFieldsChange: ((changedFields: Array<FieldData>, allFields: Array<FieldData>) -> Unit)?
    var onFinish: ((values: Any) -> Unit)?
    var onFinishFailed: ((errorInfo: Any) -> Unit)?
    var validateTrigger: Any? /* String | Array<String> | Boolean */
    var preserve: Boolean?
    var className: String?
}

external interface FormInstance<Values> {
    var getFieldValue: (name: NamePath) -> StoreValue
    fun getFieldsValue(): Values
    fun getFieldsValue(nameList: Any /* Array<NamePath> | Boolean */, filterFunc: ((meta: Meta) -> Boolean)?): Any
    var getFieldError: (name: NamePath) -> Array<String>
    var getFieldsError: (nameList: Array<NamePath>?) -> Array<FieldError>
    fun isFieldsTouched(nameList: Array<NamePath>? = definedExternally, allFieldsTouched: Boolean? = definedExternally): Boolean
    fun isFieldsTouched(allFieldsTouched: Boolean? = definedExternally): Boolean
    var isFieldTouched: (name: NamePath) -> Boolean
    var isFieldValidating: (name: NamePath) -> Boolean
    var isFieldsValidating: (nameList: Array<NamePath>) -> Boolean
    fun resetFields(fields: Array<NamePath>? = definedExternally)
    var setFields: (fields: Array<FieldData>) -> Unit
    var setFieldsValue: (value: Values) -> Unit
    fun validateFields(nameList: Array<NamePath>? = definedExternally): Promise<Store>
    var submit: () -> Unit
}

external interface InternalFormInstance {
    /**
     * Passed by field context props
     */
    var prefixName: InternalNamePath?
    var validateTrigger: Any? /* String | Array<String> | Boolean */
    /**
     * Form component should register some content into store.
     * We pass the `HOOK_MARK` as key to avoid user call the function.
     */
    var getInternalHooks: (secret: String) -> InternalHooks?
};

external interface Store

external interface BaseRule {
    var enum: Array<StoreValue>
    var len: Number?
    var max: Number?
    var message: Any? /* String | ReactElement */
    var min: Number?
    var pattern: RegExp?
    var required: Boolean?
    var transform: ((value: StoreValue) -> StoreValue)?
    var type: RuleType?
    var whitespace: Boolean?
    /** Customize rule level `validateTrigger`. Must be subset of Field `validateTrigger` */
    var validateTrigger: Any? /* String | Array<String> */
}

external interface ValidatorRule {
    var message: Any? /* String | ReactElement */
    var validator: Validator
}

external interface ArrayRule : AggregationRule {
    override var type: RuleType?
    var defaultField: RuleObject?
}

external interface AggregationRule : BaseRule, ValidatorRule

external interface Meta {
    var touched: Boolean
    var validating: Boolean
    var errors: Array<String>
    var name: InternalNamePath
}

external interface InternalFieldData : Meta {
    var value: StoreValue
}

external interface FieldData {
    var name: NamePath
}

external interface FieldError {
    var name: InternalNamePath;
    var errors: Array<String>
}

external interface ValidateErrorEntity<Values> {
    var values: Values
    var errorFields: Array<ValidateErrorEntityFields>
    var outOfDate: Boolean
}

external interface ValidateErrorEntityFields {
    var name: InternalNamePath
    var errors: Array<String>
}

external interface FieldEntity {
    var onStoreChange: (store: Store, namePathList: Array<InternalNamePath>?, info: ValuedNotifyInfo) -> Unit
    var isFieldTouched: () -> Boolean
    var isFieldDirty: () -> Boolean
    var isFieldValidating: () -> Boolean
    var isListField: () -> Boolean
    var isList: () -> Boolean
    var validateRules: (options: ValidateOptions?) -> Promise<Array<String>>
    var getMeta: () -> Meta
    var getNamePath: () -> InternalNamePath;
    var getErrors: () -> Array<String>
    var props: FieldEntityProps
}

external interface FieldEntityProps {
    var name: NamePath?
    var rules: Array<Rule>?
    var dependencies: Array<NamePath>?
    var initialValue: Any?
}

external interface Callbacks<Values> {
    var onValuesChange: ((changedValues: Any, values: Values) -> Unit)?
    var onFieldsChange: ((changedFields: Array<FieldData>, allFields: Array<FieldData>) -> Unit)?
    var onFinish: ((values: Values) -> Unit)?
    var onFinishFailed: ((errorInfo: ValidateErrorEntity<Values>) -> Unit)?
}

external interface ValuedNotifyInfo {
    var store: Store
}

external interface ValidateOptions {
    var triggerName: String?
    var validateMessages: ValidateMessages?
    /**
     * Recursive validate. It will validate all the name path that contains the provided one.
     * e.g. ['a'] will validate ['a'] , ['a', 'b'] and ['a', 1].
     */
    var recursive: Boolean?
}

external interface ValidateMessages {
    var default: ValidateMessage?
    var required: ValidateMessage?
    var enum: ValidateMessage?
    var whitespace: ValidateMessage?
    var date: ValidateMessagesDate?
    var types: ValidateMessagesTypes?
    var string: ValidateMessagesString?
    var number: ValidateMessagesNumber?
    var array: ValidateMessagesArray?
    var pattern: ValidateMessagesPattern?
}

external interface ValidateMessagesDate {
    var format: ValidateMessage?
    var parse: ValidateMessage?
    var invalid: ValidateMessage?
}

external interface ValidateMessagesTypes {
    var string: ValidateMessage?
    var method: ValidateMessage?
    var array: ValidateMessage?
    var `object`: ValidateMessage?
    var number: ValidateMessage?
    var date: ValidateMessage?
    var boolean: ValidateMessage?
    var integer: ValidateMessage?
    var float: ValidateMessage?
    var regexp: ValidateMessage?
    var email: ValidateMessage?
    var url: ValidateMessage?
    var hex: ValidateMessage?
}

external interface ValidateMessagesString {
    var len: ValidateMessage?
    var min: ValidateMessage?
    var max: ValidateMessage?
    var range: ValidateMessage?
}

external interface ValidateMessagesNumber  {
    var len: ValidateMessage?
    var min: ValidateMessage?
    var max: ValidateMessage?
    var range: ValidateMessage?
}

external interface ValidateMessagesArray {
    var len: ValidateMessage?
    var min: ValidateMessage?
    var max: ValidateMessage?
    var range: ValidateMessage?
}

external interface ValidateMessagesPattern {
    var mismatch: ValidateMessage?
}

external fun <T> toArray(candidate: Any /* T | Array<T> | Boolean */): Array<T>
external fun getFieldId(namePath: InternalNamePath, formName: String? = definedExternally): String?
