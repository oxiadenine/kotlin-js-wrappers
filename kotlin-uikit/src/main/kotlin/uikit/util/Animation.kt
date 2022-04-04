package uikit.util

import uikit.UIKitElement
import kotlin.js.Promise

external interface AnimationUtil {
    val transition: Transition
    val animation: Animation

    fun transition(
        element: UIKitElement? = definedExternally,
        props: dynamic = definedExternally,
        duration: Number? = definedExternally,
        timing: String? = definedExternally
    ): Promise<Unit>

    fun animate(
        element: UIKitElement? = definedExternally,
        animation: Animation? = definedExternally,
        duration: Number? = definedExternally,
        origin: dynamic = definedExternally,
        out: dynamic = definedExternally
    ): Promise<Unit>
}


external interface Transition {
    var start: TransitionFun

    fun stop(element: UIKitElement? = definedExternally): Promise<Unit>
    fun cancel(element: UIKitElement? = definedExternally)
    fun inProgress(element: UIKitElement? = definedExternally): Boolean
}

external interface Animation {
    var `in`: AnimateFun

    fun out(
        element: UIKitElement? = definedExternally,
        animation: Animation? = definedExternally,
        duration: Number? = definedExternally,
        origin: dynamic = definedExternally
    ): AnimateFun

    fun inProgress(element: UIKitElement? = definedExternally): Boolean
    fun cancel(element: UIKitElement? = definedExternally)
}

typealias TransitionFun = (element: UIKitElement?, props: dynamic, duration: Number?, timing: String?) -> Promise<Unit>
typealias AnimateFun = (element: UIKitElement?, animation: Animation?, duration: Number?, origin: dynamic, out: dynamic) -> Promise<Unit>
