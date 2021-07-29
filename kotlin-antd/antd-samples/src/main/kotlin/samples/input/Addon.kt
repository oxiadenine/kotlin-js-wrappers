package samples.input

import antd.icon.settingOutlined
import antd.input.input
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.css.marginBottom
import kotlinx.css.px
import react.RBuilder
import react.buildElement
import react.dom.div
import styled.css
import styled.styledDiv

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
    styledDiv {
        css { +InputStyles.addon }
        div {
            styledDiv {
                css { marginBottom = 16.px }
                input {
                    attrs {
                        addonBefore = "Http://"
                        addonAfter = ".com"
                        defaultValue = "mysite"
                    }
                }
            }
            styledDiv {
                css { marginBottom = 16.px }
                input {
                    attrs {
                        addonBefore = selectBefore
                        addonAfter = selectAfter
                        defaultValue = "mysite"
                    }
                }
            }
            styledDiv {
                css { marginBottom = 16.px }
                input {
                    attrs {
                        addonAfter = buildElement {
                            settingOutlined {}
                        }
                        defaultValue = "mysite"
                    }
                }
            }
        }
    }
}
