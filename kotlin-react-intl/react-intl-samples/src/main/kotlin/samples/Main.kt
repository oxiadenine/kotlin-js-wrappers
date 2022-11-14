package samples

import dom.Element
import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    createRoot(document.getElementById("root").unsafeCast<Element>()).render(App.create())
}