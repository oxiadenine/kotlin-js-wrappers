package uikit.components

import org.w3c.dom.*
import uikit.*
import kotlin.js.*

external interface SvgComponent : Component {
    val svg: Promise<Element>
}

external interface SvgOptions {
    var src: String?
    var strokeAnimation: Boolean?
}
