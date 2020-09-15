package samples

import kotlinext.js.*
import kotlinx.browser.document
import react.dom.render
import uikit.Icons
import uikit.UIkit

fun main() {
    requireAll(require.context("../../../../../kotlin-uikit/uikit-samples/src", true, js("/\\.css$/")))
    require("uikit/dist/css/uikit.css")

    UIkit.use(Icons)

    render(document.getElementById("root")) {
        app()
    }
}
