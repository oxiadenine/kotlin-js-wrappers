package uikit.util

import uikit.UIkitElement
import kotlin.js.Promise

external interface AnimationUtil {
    val transition: Transition
    val animation: Animation

    fun transition(
        element: UIkitElement? = definedExternally,
        props: dynamic = definedExternally,
        duration: Number? = definedExternally,
        timing: String? = definedExternally
    ): Promise<Unit>

    fun animate(
        element: UIkitElement? = definedExternally,
        animation: Animation? = definedExternally,
        duration: Number? = definedExternally,
        origin: dynamic = definedExternally,
        out: dynamic = definedExternally
    ): Promise<Unit>
}


external interface Transition {
    var start: TransitionFun

    fun stop(element: UIkitElement? = definedExternally): Promise<Unit>
    fun cancel(element: UIkitElement? = definedExternally)
    fun inProgress(element: UIkitElement? = definedExternally): Boolean
}

external interface Animation {
    var `in`: AnimateFun

    fun out(
        element: UIkitElement? = definedExternally,
        animation: Animation? = definedExternally,
        duration: Number? = definedExternally,
        origin: dynamic = definedExternally
    ): AnimateFun

    fun inProgress(element: UIkitElement? = definedExternally): Boolean
    fun cancel(element: UIkitElement? = definedExternally)
}

typealias TransitionFun = (element: UIkitElement?, props: dynamic, duration: Number?, timing: String?) -> Promise<Unit>
typealias AnimateFun = (element: UIkitElement?, animation: Animation?, duration: Number?, origin: dynamic, out: dynamic) -> Promise<Unit>
