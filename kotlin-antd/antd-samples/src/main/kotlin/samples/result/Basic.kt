package samples.result

import antd.button.button
import antd.icon.*
import antd.radio.*
import antd.result.*
import antd.typography.*
import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.a
import react.dom.div
import styled.*

interface BasicDemoState : RState {
    var status: String
    var title: String
    var subTitle: String?
    var extra: Any
}

class BasicDemo : RComponent<RProps, BasicDemoState>() {
    private val handleChange: (RadioChangeEvent) -> Unit = { e ->
        val resultState: BasicDemoState = when (val resultStatus = e.target.value.unsafeCast<String>()) {
            "403" -> jsObject {
                status = resultStatus
                title = "403"
                subTitle = "Sorry, you are not authorized to access this page."
                extra = buildElement {
                    button {
                        attrs.type = "primary"
                        +"Back Home"
                    }
                }
            }
            "404" -> jsObject {
                status = resultStatus
                title = "404"
                subTitle = "Sorry, the page you visited does not exist."
                extra = buildElement {
                    button {
                        attrs.type = "primary"
                        +"Back Home"
                    }
                }
            }
            "500" -> jsObject {
                status = resultStatus
                title = "500"
                subTitle = "Sorry, the server is wrong."
                extra = buildElement {
                    button {
                        attrs.type = "primary"
                        +"Back Home"
                    }
                }
            }
            "success" -> jsObject {
                status = resultStatus
                title = "Successfully Purchased Cloud Server ECS!"
                subTitle = "Order number: 2017182818828182881 Cloud server configuration takes 1-5 minutes, please wait."
                extra = arrayOf(
                    buildElement {
                        button {
                            attrs {
                                type = "primary"
                                key = "console"
                            }
                            +"Go Console"
                        }
                    },
                    buildElement {
                        button {
                            attrs.key = "buy"
                            +"Buy Again"
                        }
                    }
                )
            }
            "info" -> jsObject {
                status = resultStatus
                title = "Your operation has been executed"
                subTitle = null
                extra = buildElement {
                    button {
                        attrs {
                            type = "primary"
                            key = "console"
                        }
                        +"Go Console"
                    }
                }
            }
            "error" -> jsObject {
                status = resultStatus
                title = "Submission Failed"
                subTitle = "Please check and modify the following information before resubmitting."
                extra = arrayOf(
                    buildElement {
                        button {
                            attrs {
                                type = "primary"
                                key = "console"
                            }
                            +"Go Console"
                        }
                    },
                    buildElement {
                        button {
                            attrs.key = "buy"
                            +"Buy Again"
                        }
                    }
                )
            }
            "warning" -> jsObject {
                status = resultStatus
                title = "warning"
                subTitle = "There are some problems with your operation."
                extra = buildElement {
                    button {
                        attrs {
                            type = "primary"
                            key = "console"
                        }
                        +"Go Console"
                    }
                }
            }
            else -> jsObject {}
        }

        setState(resultState)
    }

    override fun BasicDemoState.init() {
        status = "403"
        title = "403"
        subTitle = "Sorry, you are not authorized to access this page."
        extra = buildElement {
            button {
                attrs.type = "primary"
                +"Back Home"
            }
        }
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    onChange = handleChange
                    value = state.status
                }
                radio {
                    attrs.value = "403"
                    +"403"
                }
                radio {
                    attrs.value = "404"
                    +"404"
                }
                radio {
                    attrs.value = "500"
                    +"500"
                }
                radio {
                    attrs.value = "success"
                    +"success"
                }
                radio {
                    attrs.value = "info"
                    +"info"
                }
                radio {
                    attrs.value = "error"
                    +"error"
                }
                radio {
                    attrs.value = "warning"
                    +"warning"
                }
            }
            result {
                attrs {
                    status = state.status
                    title = state.title
                    subTitle = state.subTitle
                    extra = state.extra
                }
                if (state.status == "error") {
                    div {
                        attrs.classes = setOf("desc")
                        paragraph {
                            text {
                                attrs {
                                    strong = true
                                    style = js { fontSize = 16 }
                                }
                                +"The content you submitted has the following error:"
                            }
                        }
                        paragraph {
                            closeCircleOutlined {
                                attrs.style = js { color = "red" }
                            }
                            +" Your account has been frozen "
                            a { +"Thaw immediately >" }
                        }
                        paragraph {
                            closeCircleOutlined {
                                attrs.style = js { color = "red" }
                            }
                            +" Your account is not yet eligible to apply "
                            a { +"Apply Unlock >" }
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.basicDemo() = child(BasicDemo::class) {}

fun RBuilder.basic() {
    styledDiv {
        css { +ResultStyles.basic }
        basicDemo()
    }
}
