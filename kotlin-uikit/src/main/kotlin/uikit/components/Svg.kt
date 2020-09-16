package uikit.components

import org.w3c.dom.Element
import kotlin.js.Promise

external interface SvgElement {
    val svg: Promise<Element>
}

external interface SvgOptions {
    var src: String?
    var strokeAnimation: Boolean?
}
