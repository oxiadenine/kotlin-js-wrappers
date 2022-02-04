package samples

import kotlinext.js.require
import kotlinx.browser.document
import react.dom.render

fun main() {
    require("antd/dist/antd.css")

    render(document.getElementById("root")!!) {
        app()
    }
}
