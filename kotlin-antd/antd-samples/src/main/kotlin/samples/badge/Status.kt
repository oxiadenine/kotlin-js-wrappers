package samples.badge

import antd.badge.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.status() {
    styledDiv {
        css { +BadgeStyles.status }
        div {
            badge {
                attrs.status = "success"
            }
            badge {
                attrs.status = "error"
            }
            badge {
                attrs.status = "default"
            }
            badge {
                attrs.status = "processing"
            }
            badge {
                attrs.status = "warning"
            }
            br {}
            badge {
                attrs {
                    status = "success"
                    text = "Success"
                }
            }
            br {}
            badge {
                attrs {
                    status = "error"
                    text = "Error"
                }
            }
            br {}
            badge {
                attrs {
                    status = "default"
                    text = "Default"
                }
            }
            br {}
            badge {
                attrs {
                    status = "processing"
                    text = "Processing"
                }
            }
            br {}
            badge {
                attrs {
                    status = "warning"
                    text = "Warning"
                }
            }
        }
    }
}
