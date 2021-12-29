package antd.form

import kotlinext.js.Record
import react.*

external interface FormItemComponent : ComponentClass<FormItemProps<Any>>

external interface FormItemProps<Values> : FormItemLabelProps, FormItemInputProps, RcFieldProps<Values> {
    override var prefixCls: String?
    var noStyle: Boolean?
    var style: dynamic
    var className: String?
    override var children: ChildrenType<Values>
    var id: String?
    override var hasFeedback: Boolean?
    override var validateStatus: FormItemValidateStatus?
    override var required: Boolean?
    var hidden: Boolean?
    override var initialValue: Any?
    override var messageVariables: Record<String, String>?
    override var tooltip: LabelTooltipType?
    var fieldKey: Any?
}

external interface RcFieldProps<Values> {
    var children: Any /* ReactElement | (control: ChildProps, meta: Meta, form: FormInstance<Values>) -> ReactNode) */
    var dependencies: Array<NamePath>
    var getValueFromEvent: ((args: EventArgs) -> StoreValue)?
    var name: InternalNamePath?
    var normalize: ((value: StoreValue, prevValue: StoreValue, allValues: Store) -> StoreValue)?
    var rules: Array<Rule>
    var shouldUpdate: ShouldUpdate<Values>?
    var trigger: String?
    var validateTrigger: Any? /* String | Array<String> | Boolean */
    var validateFirst: Any? /* Boolean | "parallel" */
    var valuePropName: String?
    var getValueProps: ((value: StoreValue) -> dynamic)?
    var messageVariables: Record<String, String>?
    var initialValue: Any?
    var onReset: (() -> Unit)?
    var preserve: Boolean?
    var isListField: Boolean?
    var isList: Boolean?
    var fieldContext: InternalFormInstance?
}

external interface FormItemContext {
    var vertical: Boolean
}

external interface ShouldUpdateInfo {
    var source: String
}
