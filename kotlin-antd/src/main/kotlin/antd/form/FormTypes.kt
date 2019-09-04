package antd.form

import react.Component

typealias ComponentDecorator<P, S> = (component: Any /*JsClass<Component<P, S>> */) -> JsClass<Component<P /* RcBaseFormProps, Omit<P, FormComponentProps> */, S>>

typealias FormCreateOptionMessagesCallback = (args: Array<Any>) -> String
typealias FormLayout = String /* "horizontal" | "inline" | "vertical" */
typealias ValidateCallback<V> = (errors: Any?, values: V?) -> Unit

typealias FormLabelAlign = String /* "left" | "right" */
typealias FormItemValidateStatus = String /* "success" | "warning" | "error" | "validating" | "" */
