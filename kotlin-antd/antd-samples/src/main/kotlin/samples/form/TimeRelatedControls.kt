package samples.form

import antd.FormEventHandler
import antd.button.button
import antd.datepicker.datePicker
import antd.datepicker.monthPicker
import antd.datepicker.rangePicker
import antd.form.*
import antd.timepicker.timePicker
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinext.js.objectAssign
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div

class TimeRelatedForm : RComponent<FormComponentProps<Any>, RState>() {
    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, fieldsValue: dynamic ->
            if (err != null) {
                return@validateFields
            }

            // Should format date value before submit.
            val rangeValue = fieldsValue["range-picker"]
            val rangeTimeValue = fieldsValue["range-time-picker"]

            val obj = js {}

            val values: dynamic = objectAssign(obj, fieldsValue)

            values["date-picker"] = fieldsValue["date-picker"].format("YYYY-MM-DD")
            values["date-time-picker"] = fieldsValue["date-time-picker"].format("YYYY-MM-DD HH:mm:ss")
            values["month-picker"] = fieldsValue["month-picker"].format("YYYY-MM")
            values["range-picker"] = arrayOf(rangeValue[0].format("YYYY-MM-DD"), rangeValue[1].format("YYYY-MM-DD"))
            values["range-time-picker"] = arrayOf(
                    rangeTimeValue[0].format("YYYY-MM-DD HH:mm:ss"),
                    rangeTimeValue[1].format("YYYY-MM-DD HH:mm:ss")
            )
            values["time-picker"] = fieldsValue["time-picker"].format("HH:mm:ss")

            console.log("Received values of form: ", values.unsafeCast<Any())
        }
    }

    override fun RBuilder.render() {
        val formItemLayout = jsObject<FormItemProps> {
            labelCol = jsObject {
                xs = jsObject { span = 24 }
                sm = jsObject { span = 8 }
            }
            wrapperCol = jsObject {
                xs = jsObject { span = 24 }
                sm = jsObject { span = 16 }
            }
        }

        val config = jsObject<GetFieldDecoratorOptions> {
            rules = arrayOf(jsObject {
                type = "object"
                required = true
                message = "Please select time!"
            })
        }

        val rangeConfig = jsObject<GetFieldDecoratorOptions> {
            rules = arrayOf(jsObject {
                type = "array"
                required = true
                message = "Please select time!"
            })
        }

        form {
            objectAssign(attrs, formItemLayout)
            attrs.onSubmit = handleSubmit
            formItem {
                attrs.label = "DatePicker"
                childList.add(props.form.getFieldDecorator("date-picker", config)
                (buildElement {
                    datePicker {}
                }!!))
            }
            formItem {
                attrs.label = "DatePicker[showTime]"
                childList.add(props.form.getFieldDecorator("date-time-picker", config)
                (buildElement {
                    datePicker {
                        attrs {
                            showTime = true
                            format = "YYYY-MM-DD HH:mm:ss"
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "MonthPicker"
                childList.add(props.form.getFieldDecorator("month-picker", config)
                (buildElement {
                    monthPicker {}
                }!!))
            }
            formItem {
                attrs.label = "RangePicker"
                childList.add(props.form.getFieldDecorator("range-time-picker", rangeConfig)
                (buildElement {
                    rangePicker {}
                }!!))
            }
            formItem {
                attrs.label = "RangePicker[showTime]"
                childList.add(props.form.getFieldDecorator("range-picker", rangeConfig)
                (buildElement {
                    rangePicker {
                        attrs {
                            showTime = true
                            format = "YYYY-MM-DD HH:mm:ss"
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "TimePicker"
                childList.add(props.form.getFieldDecorator("time-picker", config)
                (buildElement {
                    timePicker {}
                }!!))
            }
            formItem {
                attrs {
                    wrapperCol = jsObject {
                        xs = jsObject {
                            span = 24
                            offset = 0
                        }
                        sm = jsObject {
                            span = 16
                            offset = 8
                        }
                    }
                }
                button {
                    attrs {
                        type = "primary"
                        htmlType = "submit"
                    }
                    +"Submit"
                }
            }
        }
    }
}

private val wrappedTimeRelatedForm = FormComponent.create<FormComponentProps<Any>, RState>(
        jsObject { name = "time_related_controls" })(TimeRelatedForm::class.js)

fun RBuilder.wrappedTimeRelatedForm(handler: RHandler<FormComponentProps<Any>>) = child(wrappedTimeRelatedForm, jsObject {}, handler)

fun RBuilder.timeRelatedControls() {
    div("form-container") {
        attrs.id = "form-time-related-controls"
        wrappedTimeRelatedForm {}
    }
}
