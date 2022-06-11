package samples

import kotlinext.js.*
import kotlinx.browser.*
import react.create
import react.dom.client.createRoot
import uikit.*

fun main() {
    require("uikit/dist/css/uikit.css")

    UIkit.use(Icons)

    createRoot(document.getElementById("root")!!).render(App.create())
}
