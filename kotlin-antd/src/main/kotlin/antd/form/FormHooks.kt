package antd.form

import react.*

external fun <Values> useForm(form: FormInstance<Values>? = definedExternally): Array<FormInstance<Values>>
external fun useCacheErrors(
    errors: Array<ReactElement>,
    changeTrigger: (visible: Boolean) -> Unit, directly: Boolean): Any /* Array<Any /* Boolean & Array<ReactElement> */>> */
external fun <ValueType> useFrameState(defaultValue: ValueType): Array<Any /* ValueType & (updater: Updater<ValueType>) -> void */>
external fun useItemRef(): (name: InternalNamePath, children: Any) -> Any? /* (instance: Any) -> Unit) | MutableRefObject<Any> */

external interface InternalHooks {
    var dispatch: (action: ReducerAction) -> Unit
    var initEntityValue: (entity: FieldEntity) -> Unit
    var registerField: (entity: FieldEntity) -> () -> Unit
    var useSubscribe: (subscribable: Boolean) -> Unit
    var setInitialValues: (values: Store, init: Boolean) -> Unit
    var setCallbacks: (callbacks: Callbacks<Any>) -> Unit
    var getFields: (namePathList: Array<InternalNamePath>?) -> Array<FieldData>
    var setValidateMessages: (validateMessages: ValidateMessages) -> Unit
    var setPreserve: (preserve: Boolean?) -> Unit
}

external interface UpdateAction {
    var type: String /* "updateValue" */
    var namePath: InternalNamePath
    var value: StoreValue
}

external interface ValidateAction {
    var type: String /* "validateField" */
    var namePath: InternalNamePath
    var triggerName: String
}
