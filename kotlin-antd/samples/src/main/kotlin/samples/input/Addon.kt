package samples.input

import antd.icon.icon
import antd.input.input
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val selectBefore = buildElement {
    select<String, SelectComponent<String>> {
        attrs {
            defaultValue = "Http://"
            style = js { width = 90 }
        }
        option {
            attrs.value = "Http://"
            +"Http://"
        }
        option {
            attrs.value = "Https://"
            +"Https://"
        }
    }
}

private val selectAfter = buildElement {
    select<String, SelectComponent<String>> {
        attrs {
            defaultValue = ".com"
            style = js { width = 80 }
        }
        option {
            attrs.value = ".com"
            +".com"
        }
        option {
            attrs.value = ".jp"
            +".jp"
        }
        option {
            attrs.value = ".cn"
            +".cn"
        }
        option {
            attrs.value = ".org"
            +".org"
        }
    }
}

fun RBuilder.addon() {
    div("input-container") {
        attrs.id = "input-addon"
        div {
            div {
                attrs.jsStyle = js { marginBottom = 16 }
                input {
                    attrs {
                        addonBefore = "Http://"
                        addonAfter = ".com"
                        defaultValue = "mysite"
                    }
                }
            }
            div {
                attrs.jsStyle = js { marginBottom = 16 }
                input {
                    attrs {
                        addonBefore = selectBefore
                        addonAfter = selectAfter
                        defaultValue = "mysite"
                    }
                }
            }
            div {
                attrs.jsStyle = js { marginBottom = 16 }
                input {
                    attrs {
                        addonAfter = buildElement {
                            icon {
                                attrs.type = "setting"
                            }
                        }
                        defaultValue = "mysite"
                    }
                }
            }
        }
    }
}
