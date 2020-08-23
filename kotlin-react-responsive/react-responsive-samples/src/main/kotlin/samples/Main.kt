package samples

import kotlinext.js.*
import react.dom.render
import kotlinx.browser.document

fun main() {
    requireAll(require.context("../../../../../kotlin-react-responsive/react-responsive-samples/src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        app()
    }
}
