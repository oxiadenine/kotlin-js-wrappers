package samples

import dom.Element
import kotlinx.browser.document
import react.create
import react.dom.client.createRoot
import uikit.*

fun main() {
    js("require('uikit/dist/css/uikit.css')")

    UIkit.use(Icons)

    createRoot(document.getElementById("root").unsafeCast<Element>()).render(App.create())
}