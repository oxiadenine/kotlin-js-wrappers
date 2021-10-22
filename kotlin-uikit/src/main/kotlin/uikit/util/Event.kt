package uikit.util

import org.w3c.dom.events.*
import uikit.UIkitElement

external interface EventUtil {
    fun on(
        targets: dynamic = definedExternally,
        type: String,
        selector: String? = definedExternally,
        listener: ((e: Event) -> Unit)? = definedExternally,
        useCapture: Boolean? = definedExternally
    ): () -> OffFun

    fun off(
        targets: dynamic = definedExternally,
        type: String,
        selector: String? = definedExternally,
        listener: ((e: Event) -> Unit)? = definedExternally,
        useCapture: Boolean? = definedExternally
    )

    fun once(
        element: UIkitElement? = definedExternally,
        type: String,
        selector: String? = definedExternally,
        listener: ((e: Event) -> Unit)? = definedExternally,
        useCapture: Boolean? = definedExternally,
        condition: ((e: Event) -> Boolean)? = definedExternally
    ): OffFun

    fun trigger(
        targets: dynamic = definedExternally,
        event: Event? = definedExternally,
        detail: dynamic = definedExternally
    ): dynamic

    fun createEvent(
        e: Event? = definedExternally,
        bubbles: Boolean? = definedExternally,
        cancelable: Boolean? = definedExternally,
        detail: dynamic = definedExternally
    ): Event

    fun toEventTarget(target: dynamic = definedExternally): dynamic
    fun isTouch(e: Event): Boolean
    fun getEventPos(e: Event? = definedExternally): dynamic
}

typealias OnFun = (targets: dynamic, type: String, selector: String?, listener: ((e: Event) -> Unit)?, useCapture: Boolean?) -> () -> OffFun
typealias OffFun = (targets: dynamic, type: String, selector: String?, listener: ((e: Event) -> Unit)?, useCapture: Boolean?) -> Unit
typealias OnceFun = (element: UIkitElement?, type: String, selector: String?, listener: ((e: Event) -> Unit)?, useCapture: Boolean?, condition: ((e: Event) -> Boolean)?) -> OffFun
