package samples

import kotlinx.browser.*
import react.create
import react.dom.client.createRoot
import uikit.*

fun main() {
    js("require('uikit/dist/css/uikit.css')")

    UIkit.use(Icons)

    createRoot(document.getElementById("root")!!).render(App.create())
}