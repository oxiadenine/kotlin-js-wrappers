package samples.form

import antd.button.*
import antd.datepicker.*
import antd.form.*
import antd.timepicker.*
import kotlinext.js.*
import react.*
import styled.*

private val formItemLayout = jsObject<FormItemProps<Any>> {
    labelCol = jsObject {
        xs = jsObject { span = 24 }
        sm = jsObject { span = 8 }
    }
    wrapperCol = jsObject {
        xs = jsObject { span = 24 }
        sm = jsObject { span = 16 }
    }
}

private val config = jsObject<FormItemProps<Any>> {
    rules = arrayOf(jsObject<AggregationRule> {
        type = "object"
        required = true
        message = "Please select time!"
    })
}

private val rangeConfig = jsObject<FormItemProps<Any>> {
    rules = arrayOf(jsObject<AggregationRule> {
        type = "array"
        required = true
        message = "Please select time!"
    })
}

private val timeRelatedForm = functionalComponent<RProps> {
    val handleFinish = { fieldsValue: dynamic ->
        val rangeValue = fieldsValue["range-picker"]
        val rangeTimeValue = fieldsValue["range-time-picker"]

        val obj = js {}

        val values: dynamic = Object.assign(obj, fieldsValue)

        values["date-picker"] = fieldsValue["date-picker"].format("YYYY-MM-DD")
        values["date-time-picker"] = fieldsValue["date-time-picker"].format("YYYY-MM-DD HH:mm:ss")
        values["month-picker"] = fieldsValue["month-picker"].format("YYYY-MM")
        values["range-picker"] = arrayOf(rangeValue[0].format("YYYY-MM-DD"), rangeValue[1].format("YYYY-MM-DD"))
        values["range-time-picker"] = arrayOf(
            rangeTimeValue[0].format("YYYY-MM-DD HH:mm:ss"),
            rangeTimeValue[1].format("YYYY-MM-DD HH:mm:ss")
        )
        values["time-picker"] = fieldsValue["time-picker"].format("HH:mm:ss")

        console.log("Received values of form: ", values.unsafeCast < Any())
    }

    form {
        attrs {
            name = "time_related_controls"
            labelCol = formItemLayout.labelCol
            wrapperCol = formItemLayout.wrapperCol
            onFinish = handleFinish
        }
        formItem {
            attrs {
                name = "date-picker"
                label = "DatePicker"
                rules = config.rules
            }
            datePicker {}
        }
        formItem {
            attrs {
                name = "date-time-picker"
                label = "DatePicker[showTime]"
                rules = config.rules
            }
            datePicker {
                attrs {
                    showTime = true
                    format = "YYYY-MM-DD HH:mm:ss"
                }
            }
        }
        formItem {
            attrs {
                name = "month-picker"
                label = "MonthPicker"
                rules = config.rules
            }
            monthPicker {}
        }
        formItem {
            attrs {
                name = "range-picker"
                label = "RangePicker"
                rules = rangeConfig.rules
            }
            rangePicker {}
        }
        formItem {
            attrs {
                name = "range-time-picker"
                label = "RangePicker[showTime]"
                rules = rangeConfig.rules
            }
            rangePicker {
                attrs {
                    showTime = true
                    format = "YYYY-MM-DD HH:mm:ss"
                }
            }
        }
        formItem {
            attrs {
                name = "time-picker"
                label = "TimePicker"
                rules = config.rules
            }
            timePicker {}
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

fun RBuilder.timeRelatedForm() = child(timeRelatedForm) {}

fun RBuilder.timeRelatedControls() {
    styledDiv {
        css { +FormStyles.timeRelatedControls }
        timeRelatedForm()
    }
}
