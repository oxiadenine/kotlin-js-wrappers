package antd.form

import kotlinext.js.*
import react.*

fun RBuilder.form(handler: RHandler<FormProps<Any>>) = child(FormComponent::class, handler)
fun RBuilder.formItem(handler: RHandler<FormItemProps<Any>>) = child(FormComponent.Item, jso {}, handler)
fun RBuilder.formList(handler: RHandler<FormListProps>) = child(FormComponent.List, jso {}, handler)
fun RBuilder.formErrorList(handler: RHandler<FormErrorListProps>) = child(FormComponent.ErrorList, jso {}, handler)
fun RBuilder.formProvider(handler: RHandler<FormProviderProps>) = child(FormComponent.Provider, jso {}, handler)
