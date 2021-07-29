package antd.form

import antd.ReactNode
import react.*

external interface FormListComponent : ComponentType<FormListProps>

external interface FormListProps : RProps {
    var prefixCls: String?
    var name: Any /* String | Number | Array<Any /* String | Number */> */
    var rules: Array<ValidatorRule>?
    var children: (fields: Array<FormListFieldData>, operation: FormListOperation, meta: FormListMeta) -> ReactNode
}

external interface FormListFieldData {
    var name: Number
    var key: Number
    var fieldKey: Number
}

external interface FormListOperation {
    var add: (defaultValue: StoreValue, insertIndex: Number?) -> Unit
    var remove: (index: Any /* Number | Array<Number> */) -> Unit
    var move: (from: Number, to: Number) -> Unit
}

external interface FormListMeta {
    var errors: Array<ReactNode>
}
