package uikit.util

import uikit.UIKitElement
import uikit.UIKitNode

external interface DomUtil {
    fun ready(fn: dynamic)
    fun empty(element: UIKitElement? = definedExternally): UIKitElement
    fun html(parent: dynamic = definedExternally, html: dynamic = definedExternally): dynamic
    fun prepend(parent: dynamic = definedExternally, element: UIKitElement? = definedExternally): dynamic
    fun append(parent: dynamic = definedExternally, element: UIKitElement? = definedExternally): dynamic
    fun before(ref: dynamic = definedExternally, element: UIKitElement? = definedExternally): dynamic
    fun after(ref: dynamic = definedExternally, element: UIKitElement? = definedExternally): dynamic
    fun insertNodes(element: UIKitElement? = definedExternally, fn: dynamic): dynamic
    fun remove(element: UIKitElement? = definedExternally)
    fun wrapAll(element: UIKitElement? = definedExternally, structure: dynamic = definedExternally): dynamic
    fun wrapInner(element: UIKitElement? = definedExternally, structure: dynamic = definedExternally): dynamic
    fun unwrap(element: UIKitElement? = definedExternally)
    fun fragment(html: dynamic = definedExternally): dynamic
    fun apply(node: UIKitNode? = definedExternally, fn: dynamic = definedExternally)
    fun `$`(selector: dynamic = definedExternally, context: dynamic = definedExternally): dynamic
    fun `$$`(selector: dynamic = definedExternally, context: dynamic = definedExternally): dynamic
}