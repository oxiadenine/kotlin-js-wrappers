package samples

import kotlinext.js.*
import kotlinx.browser.*
import react.dom.*

fun main() {
    require("antd/dist/antd.css")

    render(document.getElementById("root")) {
        app()
    }
}
