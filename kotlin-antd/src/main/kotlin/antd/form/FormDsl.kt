package antd.form

import kotlinext.js.*
import react.*

fun RBuilder.form(handler: RHandler<FormProps<Any>>) = child(FormComponent::class, handler)
fun RBuilder.formItem(handler: RHandler<FormItemProps<Any>>) = child(FormComponent.Item, jsObject {}, handler)
fun RBuilder.formList(handler: RHandler<FormListProps>) = child(FormComponent.List, jsObject {}, handler)
fun RBuilder.formErrorList(handler: RHandler<FormErrorListProps>) = child(FormComponent.ErrorList, jsObject {}, handler)
fun RBuilder.formProvider(handler: RHandler<FormProviderProps>) = child(FormComponent.Provider, jsObject {}, handler)
