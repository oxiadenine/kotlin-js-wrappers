package antd.form

import react.*

external object FormItemComponent : Component<FormItemProps<Any>, RState> {
    override fun render(): ReactElement?
}

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
    override var messageVariables: Map<String, String>?
    override var tooltip: LabelTooltipType?
    /** Auto passed by List render props. User should not use this. */
    var fieldKey: Any?
}

external interface RcFieldProps<Values> {
    var children: Any /* ReactElement | (control: ChildProps, meta: Meta, form: FormInstance<Values>) -> ReactElement) */
    /**
     * Set up `dependencies` field.
     * When dependencies field update and current field is touched,
     * will trigger validate rules and render.
     */
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
    var messageVariables: Map<String, String>?
    var initialValue: Any?
    var onReset: (() -> Unit)?
    var preserve: Boolean?
    /** @private Passed by Form.List props. Do not use since it will break by path check. */
    var isListField: Boolean?
    /** @private Passed by Form.List props. Do not use since it will break by path check. */
    var isList: Boolean?
    /** @private Pass context as prop instead of context api
     *  since class component can not get context in constructor */
    var fieldContext: InternalFormInstance?
}

external interface FormItemContext {
    var vertical: Boolean
}

external interface ShouldUpdateInfo {
    var source: String
}
