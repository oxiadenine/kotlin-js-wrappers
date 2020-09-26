package samples

import kotlinext.js.*
import react.dom.render
import kotlinx.browser.document

fun main() {
    require("antd/dist/antd.css")

    render(document.getElementById("root")) {
        app()
    }
}
