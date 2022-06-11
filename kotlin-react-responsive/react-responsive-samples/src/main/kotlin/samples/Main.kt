package samples

import kotlinx.browser.*
import react.create
import react.dom.client.createRoot

fun main() {
    createRoot(document.getElementById("root")!!).render(App.create())
}
