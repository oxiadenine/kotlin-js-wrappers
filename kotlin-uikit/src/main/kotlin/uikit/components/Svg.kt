package uikit.components

import org.w3c.dom.Element
import uikit.Component
import kotlin.js.Promise

external interface SvgComponent : Component {
    val svg: Promise<Element>
}

external interface SvgOptions {
    var src: String?
    var strokeAnimation: Boolean?
}