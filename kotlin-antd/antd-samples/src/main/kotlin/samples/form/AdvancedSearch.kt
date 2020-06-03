package samples.form

import antd.FormEventHandler
import antd.MouseEventHandler
import antd.button.button
import antd.form.*
import antd.grid.col
import antd.grid.row
import antd.icon.icon
import antd.input.input
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.classes
import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.*
import react.dom.a
import react.dom.div
import react.dom.jsStyle

interface AdvancedSearchFormState : RState {
    var expand: Boolean
}

class AdvancedSearchForm : RComponent<FormComponentProps<Any>, AdvancedSearchFormState>() {
    // To generate mock Form.Item
    private fun getFields(): Array<ReactElement> {
        val count = if (state.expand) 10 else 6

        return (0..9).map { i ->
            buildElement {
                col {
                    attrs {
                        span = 8
                        key = i.toString()
                        style = js { display = if (i < count) "block" else "none" }
                    }
                    formItem {
                        attrs.label = "Field $i"
                        childList.add(props.form.getFieldDecorator("field-$i", jsObject {
                            rules = arrayOf(jsObject {
                                required = true
                                message = "Input something!"
                            })
                        })(buildElement {
                            input {
                                attrs.placeholder = "placeholder"
                            }
                        }))
                    }
                }
            }
        }.toTypedArray()
    }

    private val handleSearch: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { _, values ->
            console.log("Received values of form: ", values)
        }
    }

    private val handleReset: MouseEventHandler<Any> = {
        props.form.resetFields()
    }

    private val toggle: (Event) -> Unit = {
        setState {
            expand = !state.expand
        }
    }

    override fun AdvancedSearchFormState.init() {
        expand = false
    }

    override fun RBuilder.render() {
        form {
            attrs {
                className = "ant-advanced-search-form"
                onSubmit = handleSearch
            }
            row {
                attrs.gutter = 24
                childList.add(getFields())
                col {
                    attrs {
                        span = 24
                        style = js { textAlign = "right" }
                    }
                    button {
                        attrs {
                            type = "primary"
                            htmlType = "submit"
                        }
                        +"Search"
                    }
                    button {
                        attrs {
                            style = js { marginLeft = 8 }
                            onClick = handleReset
                        }
                        +"Clear"
                    }
                    a {
                        attrs {
                            jsStyle = js {
                                marginLeft = 8
                                fontSize = 12
                            }
                            onClickFunction = toggle
                        }
                        +"Collapse "
                        icon {
                            attrs.type = if (state.expand) "up" else "down"
                        }
                    }
                }
            }
        }
    }
}

private val wrappedAdvancedSearchForm = FormComponent.create<FormComponentProps<Any>, AdvancedSearchFormState>(
        jsObject { name = "advanced_search" })(AdvancedSearchForm::class.js)

fun RBuilder.wrappedAdvancedSearchForm(handler: RHandler<FormComponentProps<Any>>) = child(wrappedAdvancedSearchForm, jsObject {}, handler)

fun RBuilder.advancedSearch() {
    div("form-container") {
        attrs.id = "form-advanced-search"
        div {
            wrappedAdvancedSearchForm {}
            div {
                attrs.classes = setOf("search-result-list")
                +"Search Result List"
            }
        }
    }
}
