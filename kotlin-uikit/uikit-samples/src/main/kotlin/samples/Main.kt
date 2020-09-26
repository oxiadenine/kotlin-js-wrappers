package samples

import kotlinext.js.*
import kotlinx.browser.*
import react.dom.*
import uikit.*

fun main() {
    require("uikit/dist/css/uikit.css")

    UIkit.use(Icons)

    render(document.getElementById("root")) {
        app()
    }
}
