package samples.form

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.form.*
import antd.input.input
import antd.modal.modal
import antd.radio.radio
import antd.radio.radioGroup
import kotlinext.js.jsObject
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div

interface CollectionCreateFormProps : FormComponentProps<Any> {
    var visible: Boolean?
    var onCancel: ((event: MouseEvent<HTMLElement>) -> Unit)?
    var onCreate: ((event: MouseEvent<HTMLElement>) -> Unit)?
}

class CollectionCreateForm : RComponent<CollectionCreateFormProps, RState>() {
    override fun RBuilder.render() {
        modal {
            attrs {
                visible = props.visible
                title = "Create a new collection"
                okText = "Create"
                onCancel = props.onCancel
                onOk = props.onCreate
            }
            form {
                attrs.layout = "vertical"
                formItem {
                    attrs.label = "Title"
                    childList.add(props.form.getFieldDecorator("title", jsObject {
                        rules = arrayOf(jsObject {
                            required = true
                            message = "Please input the title of collection!"
                        })
                    })(buildElement {
                        input {}
                    }!!))
                }
                formItem {
                    attrs.label = "Description"
                    childList.add(props.form.getFieldDecorator("description")
                    (buildElement {
                        input {
                            attrs.type = "textarea"
                        }
                    }!!))
                }
                formItem {
                    attrs.className = "collection-create-form_last-form-item"
                    childList.add(props.form.getFieldDecorator("modifier", jsObject {
                        initialValue = "public"
                    })(buildElement {
                        radioGroup {
                            radio {
                                attrs.value = "public"
                                +"Public"
                            }
                            radio {
                                attrs.value = "private"
                                +"Private"
                            }
                        }
                    }!!))
                }
            }
        }
    }
}

private val wrappedCollectionCreateForm = FormComponent.create<CollectionCreateFormProps, RState>(
        jsObject { name = "form_in_modal" })(CollectionCreateForm::class.js)

fun RBuilder.wrappedCollectionCreateForm(handler: RHandler<CollectionCreateFormProps>) = child(wrappedCollectionCreateForm, jsObject {}, handler)

interface CollectionsPageState : RState {
    var visible: Boolean
}

class CollectionsPage : RComponent<FormComponentProps<Any>, CollectionsPageState>() {
    var formRef: CollectionCreateForm? = null

    private val showModal: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val handleCancel: (MouseEvent<HTMLElement>) -> Unit = {
        setState {
            visible = false
        }
    }

    private val handleCreate: (MouseEvent<HTMLElement>) -> Unit = {
        val form = formRef!!.props.form

        form.validateFields { err, values ->
            if (err != null) {
                return@validateFields
            }

            console.log("Received values of form: ", values)

            form.resetFields()

            setState {
                visible = false
            }
        }
    }

    private val saveFormRef = fun (formReference: CollectionCreateForm) {
        formRef = formReference
    }

    override fun CollectionsPageState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = showModal
                }
                +"New Collection"
            }
            wrappedCollectionCreateForm {
                attrs {
                    wrappedComponentRef = saveFormRef
                    visible = state.visible
                    onCancel = handleCancel
                    onCreate = handleCreate
                }
            }
        }
    }
}

fun RBuilder.collectionsPage() = child(CollectionsPage::class) {}

fun RBuilder.formInModal() {
    div("form-container") {
        attrs.id = "form-form-in-modal"
        collectionsPage()
    }
}
