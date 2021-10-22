package uikit.util

import uikit.UIkitElement
import uikit.UIkitNode

external interface DomUtil {
    fun ready(fn: dynamic)
    fun empty(element: UIkitElement? = definedExternally): UIkitElement
    fun html(parent: dynamic = definedExternally, html: dynamic = definedExternally): dynamic
    fun prepend(parent: dynamic = definedExternally, element: UIkitElement? = definedExternally): dynamic
    fun append(parent: dynamic = definedExternally, element: UIkitElement? = definedExternally): dynamic
    fun before(ref: dynamic = definedExternally, element: UIkitElement? = definedExternally): dynamic
    fun after(ref: dynamic = definedExternally, element: UIkitElement? = definedExternally): dynamic
    fun insertNodes(element: UIkitElement? = definedExternally, fn: dynamic): dynamic
    fun remove(element: UIkitElement? = definedExternally)
    fun wrapAll(element: UIkitElement? = definedExternally, structure: dynamic = definedExternally): dynamic
    fun wrapInner(element: UIkitElement? = definedExternally, structure: dynamic = definedExternally): dynamic
    fun unwrap(element: UIkitElement? = definedExternally)
    fun fragment(html: dynamic = definedExternally): dynamic
    fun apply(node: UIkitNode? = definedExternally, fn: dynamic = definedExternally)
    fun `$`(selector: dynamic = definedExternally, context: dynamic = definedExternally): dynamic
    fun `$$`(selector: dynamic = definedExternally, context: dynamic = definedExternally): dynamic
}
