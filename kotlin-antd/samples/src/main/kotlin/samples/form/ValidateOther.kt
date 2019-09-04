package samples.form

import antd.FormEventHandler
import antd.button.button
import antd.form.*
import antd.icon.icon
import antd.inputnumber.inputNumber
import antd.radio.radio
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.rate.rate
import antd.select.option
import antd.select.select
import antd.slider.SliderMarks
import antd.slider.slider
import antd.switch.switch
import antd.upload.dragger
import antd.upload.upload
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinext.js.objectAssign
import kotlinx.html.classes
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div
import react.dom.p
import react.dom.span

class ValidateOtherDemo : RComponent<FormComponentProps<Any>, RState>() {
    private val handleSubmit: FormEventHandler<HTMLElement> = { e ->
        e.preventDefault()

        props.form.validateFields { err, values ->
            if (err != null) {
                console.log("Received values of form: ", values)
            }
        }
    }

    private val normFile = fun (e: Any?): Any {
        console.log("Upload event:", e)

        if (jsTypeOf(e) == "array") {
            return e!!
        }

        return e?.asDynamic()?.fileList?.unsafeCast<Any>() ?: e!!
    }

    override fun RBuilder.render() {
        val formItemLayout = jsObject<FormItemProps> {
            labelCol = jsObject { span = 6 }
            wrapperCol = jsObject { span = 14 }
        }

        val sliderMarks: dynamic = js {}

        sliderMarks["0"] = "A"
        sliderMarks["20"] = "B"
        sliderMarks["40"] = "C"
        sliderMarks["60"] = "D"
        sliderMarks["80"] = "E"
        sliderMarks["100"] = "F"

        form {
            objectAssign(attrs, formItemLayout)
            attrs.onSubmit = handleSubmit
            formItem {
                attrs.label = "Plain Text"
                span {
                    attrs.classes = setOf("ant-form-text")
                    +"China"
                }
            }
            formItem {
                attrs {
                    label = "Select"
                    hasFeedback = true
                }
                childList.add(props.form.getFieldDecorator("select", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please select your country!"
                    })
                })(buildElement {
                    select {
                        attrs.placeholder = "Please select a country"
                        option {
                            attrs.value = "china"
                            +"China"
                        }
                        option {
                            attrs.value = "usa"
                            +"U.S.A"
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "Select[multiple]"
                childList.add(props.form.getFieldDecorator("select-multiple", jsObject {
                    rules = arrayOf(jsObject {
                        required = true
                        message = "Please select your favourite colors!"
                        type = "array"
                    })
                })(buildElement {
                    select {
                        attrs {
                            mode = "multiple"
                            placeholder = "Please select favourite colors"
                        }
                        option {
                            attrs.value = "red"
                            +"Red"
                        }
                        option {
                            attrs.value = "green"
                            +"Green"
                        }
                        option {
                            attrs.value = "blue"
                            +"Blue"
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "InputNumber"
                childList.add(props.form.getFieldDecorator("input-number", jsObject { initialValue = 3 })
                (buildElement {
                    inputNumber {
                        attrs {
                            min = 1
                            max = 10
                        }
                    }
                }!!))
                span {
                    attrs.classes = setOf("ant-form-text")
                    +"machines"
                }
            }
            formItem {
                attrs.label = "Switch"
                childList.add(props.form.getFieldDecorator("switch", jsObject { valuePropName = "checked" })
                (buildElement {
                    switch {}
                }!!))
            }
            formItem {
                attrs.label = "Slider"
                childList.add(props.form.getFieldDecorator("slider")
                (buildElement {
                    slider {
                        attrs.marks = sliderMarks.unsafeCast<SliderMarks>()
                    }
                }!!))
            }
            formItem {
                attrs.label = "Radio.Group"
                childList.add(props.form.getFieldDecorator("radio-group")
                (buildElement {
                    radioGroup {
                        radio {
                            attrs.value = "a"
                            +"item 1"
                        }
                        radio {
                            attrs.value = "b"
                            +"item 2"
                        }
                        radio {
                            attrs.value = "c"
                            +"item 3"
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "Radio.Button"
                childList.add(props.form.getFieldDecorator("radio-button")
                (buildElement {
                    radioGroup {
                        radioButton {
                            attrs.value = "a"
                            +"item 1"
                        }
                        radioButton {
                            attrs.value = "b"
                            +"item 2"
                        }
                        radioButton {
                            attrs.value = "c"
                            +"item 3"
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "Rate"
                childList.add(props.form.getFieldDecorator("rate", jsObject { initialValue = 3.5 })
                (buildElement {
                    rate {}
                }!!))
            }
            formItem {
                attrs {
                    label = "Upload"
                    extra = "longgggggggggggggggggggggggggggggggggg"
                }
                childList.add(props.form.getFieldDecorator("upload", jsObject {
                    valuePropName = "fileList"
                    getValueFromEvent = normFile
                })(buildElement {
                    upload {
                        attrs {
                            name = "logo"
                            action = "/upload.do"
                            listType = "picture"
                        }
                        button {
                            icon {
                                attrs.type = "upload"
                            }
                            +"Click to upload"
                        }
                    }
                }!!))
            }
            formItem {
                attrs.label = "Dragger"
                childList.add(props.form.getFieldDecorator("dragger", jsObject {
                    valuePropName = "fileList"
                    getValueFromEvent = normFile
                })(buildElement {
                    dragger {
                        attrs {
                            name = "files"
                            action = "/upload.do"
                        }
                        p {
                            attrs.classes = setOf("ant-upload-drag-icon")
                            icon {
                                attrs.type = "inbox"
                            }
                        }
                        p {
                            attrs.classes = setOf("ant-upload-text")
                            +"Click or drag file to this area to upload"
                        }
                        p {
                            attrs.classes = setOf("ant-upload-hint")
                            +"Support for a single or bulk upload."
                        }
                    }
                }!!))
            }
            formItem {
                attrs {
                    wrapperCol = jsObject {
                        span = 12
                        offset = 6
                    }
                }
                button {
                    attrs {
                        type = "primary"
                        htmlType = "submit"
                    }
                    +"submit"
                }
            }
        }
    }
}

private val wrappedValidateOtherDemo = FormComponent.create<FormComponentProps<Any>, RState>(
        jsObject { name = "validate_other" })(ValidateOtherDemo::class.js)

fun RBuilder.wrappedValidateOtherDemo(handler: RHandler<FormComponentProps<Any>>) = child(wrappedValidateOtherDemo, jsObject {}, handler)

fun RBuilder.validateOther() {
    div("form-container") {
        attrs.id = "form-validate-other"
        wrappedValidateOtherDemo {}
    }
}
