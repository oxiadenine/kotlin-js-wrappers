@file:JsModule("antd/lib/form")

package antd.form

import antd.FormHTMLAttributes
import antd.grid.ColProps
import kotlinext.js.Object
import org.w3c.dom.HTMLFormElement
import react.*
import kotlin.js.RegExp

@JsName("default")
external object FormComponent : Component<FormProps, RState> {
    val Item: FormItemComponent

    fun createFormField(field: dynamic): dynamic
    fun <TOwnProps : RProps, TOwnState : RState> create(options: FormCreateOption<TOwnProps>? = definedExternally): ComponentDecorator<TOwnProps, TOwnState>

    override fun render(): ReactElement?
}

external interface FormProps : FormHTMLAttributes<HTMLFormElement>, RProps {
    var layout: FormLayout?
    var form: WrappedFormUtils<Any>?
    override var onSubmit: dynamic /* FormEventHandler<HTMLElement>? */
    override var style: dynamic
    override var className: String?
    var prefixCls: String?
    var hideRequiredMark: Boolean
    var wrapperCol: ColProps?
    var labelCol: ColProps?
    var colon: Boolean?
    var labelAlign: FormLabelAlign?
}

external interface FormComponentProps<V : Any> : WrappedFormInternalProps<V>, RcBaseFormProps, RProps {
    override var form: WrappedFormUtils<V>
}

external interface RcBaseFormProps : RProps {
    var wrappedComponentRef: Any?
}

external interface WrappedFormInternalProps<V : Any> {
    var form: WrappedFormUtils<V>
}

external interface WrappedFormUtils<V : Any> {
    fun getFieldsValue(fieldNames: Array<String>? = definedExternally): dynamic
    fun getFieldValue(fieldName: String): Any
    fun setFieldsValue(obj: Object)
    fun setFields(obj: Object)
    fun validateFields(fieldNames: Array<String>, options: ValidateFieldsOptions, callback: ValidateCallback<V>)
    fun validateFields(options: ValidateFieldsOptions, callback: ValidateCallback<V>)
    fun validateFields(fieldNames: Array<String>, callback: ValidateCallback<V>)
    fun validateFields(fieldNames: Array<String>, options: ValidateFieldsOptions)
    fun validateFields(fieldNames: Array<String>)
    fun validateFields(callback: ValidateCallback<V>)
    fun validateFields(options: ValidateFieldsOptions)
    fun validateFields()
    fun validateFieldsAndScroll(fieldNames: Array<String>, options: ValidateFieldsOptions, callback: ValidateCallback<V>)
    fun validateFieldsAndScroll(options: ValidateFieldsOptions, callback: ValidateCallback<V>)
    fun validateFieldsAndScroll(fieldNames: Array<String>, callback: ValidateCallback<V>)
    fun validateFieldsAndScroll(fieldNames: Array<String>, options: ValidateFieldsOptions)
    fun validateFieldsAndScroll(fieldNames: Array<String>)
    fun validateFieldsAndScroll(callback: ValidateCallback<V>)
    fun validateFieldsAndScroll(options: ValidateFieldsOptions)
    fun validateFieldsAndScroll()
    fun getFieldError(name: String): Array<String>?
    fun getFieldsError(names: Array<String>? = definedExternally): Any? /* String | Array<String> */
    fun isFieldValidating(name: String): Boolean
    fun isFieldTouched(name: String): Boolean
    fun isFieldsTouched(names: Array<String>? = definedExternally): Boolean
    fun resetFields(names: Array<String>? = definedExternally)
    fun getFieldDecorator(id: Any, options: GetFieldDecoratorOptions? = definedExternally): (node: ReactElement) -> ReactElement
}

external interface GetFieldDecoratorOptions {
    var valuePropName: String?
    var initialValue: Any?
    var trigger: String?
    var getValueFromEvent: ((args: Array<Any>) -> Any)?
    var getValueProps: ((value: Any) -> Any)?
    var validateTrigger: Any? /* String | Array<String> */
    var rules: Array<ValidationRule>?
    var exclusive: Boolean?
    var normalize: ((value: Any, prevValue: Any, allValues: Any) -> Any)?
    var validateFirst: Boolean?
    var preserve: Boolean?
}

external interface ValidationRule {
    var message: Any? /* String | ReactElement */
    var type: String?
    var required: Boolean?
    var whitespace: Boolean?
    var len: Number?
    var min: Number?
    var max: Number?
    var enum: Any? /* String | Array<String> */
    var pattern: RegExp?
    var transform: ((value: Any) -> Any)?
    var validator: ((rule: Any, value: Any?, callback: Any, source: Any?, options: Any?) -> Any)?
}

external interface ValidateFieldsOptions {
    var first: Boolean?
    var firstFields: Array<String>?
    var force: Boolean?
    var scroll: DomScrollIntoViewConfig?
}

external interface DomScrollIntoViewConfig {
    var alignWithLeft: Boolean?
    var alignWithTop: Boolean?
    var offsetTop: Number?
    var offsetLeft: Number?
    var offsetBottom: Number?
    var offsetRight: Number?
    var allowHorizontalScroll: Boolean?
    var onlyScrollIfNeeded: Boolean?
}

external interface FormCreateOption<T> {
    var onFieldsChange: ((props: T, fields: Any, allFields: Any) -> Unit)?
    var onValuesChange: ((props: T, changedValues: Any, allValues: Any) -> Unit)?
    var mapPropsToFields: ((props: T) -> Unit)?
    var validateMessages: FormCreateOptionMessages?
    var withRef: Boolean?
    var name: String?
}

external interface FormCreateOptionMessages {
    /* [messageId: String]: String | FormCreateOptionMessagesCallback | FormCreateOptionMessages */
}
