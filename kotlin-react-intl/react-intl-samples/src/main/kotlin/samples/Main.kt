package samples

import kotlinx.browser.*
import react.create
import react.dom.*

fun main() {
    render(element = App.create(), container = document.getElementById("root")!!)
}
