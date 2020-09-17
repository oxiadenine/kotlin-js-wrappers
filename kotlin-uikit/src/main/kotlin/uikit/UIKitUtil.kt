package uikit

import org.w3c.dom.HTMLImageElement
import org.w3c.dom.events.Event
import uikit.util.Animation
import uikit.util.Environment
import uikit.util.OffFun
import kotlin.js.Promise

external interface UIKitUtil {
    fun ajax(url: String, options: dynamic = definedExternally): Promise<Environment>

    fun animate(
        element: Any /* String | Array<String> | Element */,
        animation: Animation? = definedExternally,
        duration: Number? = definedExternally,
        origin: dynamic = definedExternally,
        out: dynamic = definedExternally): Promise<Unit>

    fun getImage(
        src: String,
        srcset: String? = definedExternally,
        sizes: String? = definedExternally): Promise<HTMLImageElement>

    fun on(
        targets: Any /* String | Array<String> | Element */,
        type: String,
        selector: String? = definedExternally,
        listener: (e: Event) -> Unit,
        useCapture: Boolean? = definedExternally): () -> OffFun

    fun off(
        targets: Any /* String | Array<String> | Element */,
        type: String,
        selector: String? = definedExternally,
        listener: (e: Event) -> Unit,
        useCapture: Boolean? = definedExternally)

    fun once(
        element: Any /* String | Array<String> | Element */,
        type: String,
        selector: String? = definedExternally,
        listener: (e: Event) -> Unit,
        useCapture: Boolean? = definedExternally,
        condition: ((e: Event) -> Boolean)? = definedExternally): OffFun

    fun transition(
        element: Any /* String | Array<String> | Element */,
        props: dynamic = definedExternally,
        duration: Number? = definedExternally,
        timing: String? = definedExternally): Promise<Unit>
}
