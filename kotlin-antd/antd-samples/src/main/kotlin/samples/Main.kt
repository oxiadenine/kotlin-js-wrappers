package samples

import kotlinext.js.*
import react.dom.render
import kotlinx.browser.document

fun main() {
    requireAll(require.context("../../../../../kotlin-antd/antd-samples/src", true, js("/\\.css$/")))
    require("antd/dist/antd.css")

    render(document.getElementById("root")) {
        app()
    }
}
