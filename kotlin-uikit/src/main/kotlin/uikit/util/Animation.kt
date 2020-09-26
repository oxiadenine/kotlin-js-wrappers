package uikit.util

import kotlin.js.Promise

external interface Transition {
    var start: Transition

    fun stop(element: Any /* String | Array<String> | Element */): Promise<Unit>
    fun cancel(element: Any /* String | Array<String> | Element */)
    fun inProgress(element: Any /* String | Array<String> | Element */): Boolean
}

external interface Animation {
    var `in`: AnimateFun

    fun out(
        element: Any /* String | Array<String> | Element */,
        animation: Animation? = definedExternally,
        duration: Number? = definedExternally,
        origin: dynamic = definedExternally): AnimateFun

    fun inProgress(element: Any /* String | Array<String> | Element */): Boolean
    fun cancel(element: Any /* String | Array<String> | Element */)
}

typealias TransitionFun = (
    element: Any /* String | Array<String> | Element */,
    props: dynamic,
    duration: Number?,
    timing: String?) -> Promise<Unit>

typealias AnimateFun = (
    element: Any /* String | Array<String> | Element */,
    animation: Animation?,
    duration: Number?,
    origin: dynamic,
    out: dynamic) -> Promise<Unit>
