package samples.progress

import antd.progress.progress
import kotlinx.css.px
import kotlinx.css.width
import react.*
import styled.*

fun RBuilder.lineMini() {
    styledDiv {
        css { +ProgressStyles.lineMini }
        styledDiv {
            css { width = 170.px }
            progress {
                attrs {
                    percent = 30
                    size = "small"
                }
            }
            progress {
                attrs {
                    percent = 50
                    size = "small"
                    status = "active"
                }
            }
            progress {
                attrs {
                    percent = 70
                    size = "small"
                    status = "exception"
                }
            }
            progress {
                attrs {
                    percent = 100
                    size = "small"
                }
            }
        }
    }
}
