package samples.mention

import antd.MouseEventHandler
import antd.button.button
import antd.form.FormComponent
import antd.form.FormComponentProps
import antd.form.form
import antd.form.formItem
import antd.mention.MentionComponent
import antd.mention.mention
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

interface ControlledAppState : RState {
    var initValue: Any
}

class ControlledApp : RComponent<FormComponentProps<Any>, ControlledAppState>() {
    private val handleReset: MouseEventHandler<Any> = { e ->
        e.preventDefault()

        props.form.resetFields()
    }

    private val handleSubmit: MouseEventHandler<Any> = { e ->
        e.preventDefault()

        props.form.validateFields { errors, values ->
            if (errors != null) {
                console.log("Errors in the form!!!")

                return@validateFields
            }

            console.log("Submit!!!")
            console.log(values)
        }
    }

    private val checkMention = fun (_: Any, _: Any?, callback: Any, _: Any?, _: Any?) {
        val mentions = MentionComponent.getMentions(props.form.getFieldValue("mention"))

        if (mentions.size < 2) {
            callback.asDynamic()(Error("More than one must be selected!"))
        } else {
            callback.asDynamic()()
        }
    }

    override fun ControlledAppState.init() {
        initValue = MentionComponent.toContentState("@afc163")
    }

    override fun RBuilder.render() {
        console.log(">> render", props.form.getFieldValue("mention") == state.initValue)

        form {
            attrs.layout = "horizontal"
            formItem {
                attrs {
                    id = "control-mention"
                    label = "Top coders"
                    labelCol = jsObject { span = 6 }
                    wrapperCol = jsObject { span = 16 }
                }
                childList.add(props.form.getFieldDecorator("mention", jsObject {
                    rules = arrayOf(jsObject { validator = checkMention })
                    initialValue = state.initValue
                })(buildElement {
                    mention {
                        attrs.suggestions = arrayOf("afc163", "benjycui", "yiminghe", "RaoHai", "中文", "にほんご")
                    }
                }))
            }
            formItem {
                attrs {
                    wrapperCol = jsObject {
                        span = 14
                        offset = 6
                    }
                }
                button {
                    attrs {
                        type = "primary"
                        onClick = handleSubmit
                    }
                    +"Submit"
                }
                +"   "
                button {
                    attrs.onClick = handleReset
                    +"Reset"
                }
            }
        }
    }
}

private val wrappedControlledApp = FormComponent.create<FormComponentProps<Any>, RState>()(ControlledApp::class.js)

fun RBuilder.wrappedControlledApp(handler: RHandler<FormComponentProps<Any>>) = child(wrappedControlledApp, jsObject {}, handler)

fun RBuilder.controlled() {
    styledDiv {
        css { +MentionStyles.controlled }
        wrappedControlledApp {}
    }
}
