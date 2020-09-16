package uikit.components

import org.w3c.dom.Element
import kotlin.js.Promise

external interface Icon {
    fun add(name: String, svg: Element)
}

external interface IconElement {
    val svg: Promise<Element>
}

external interface IconOptions {
    var icon: String?
    var ratio: Number?
}
