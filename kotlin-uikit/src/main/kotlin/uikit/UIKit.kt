package uikit

import org.w3c.dom.events.Event
import uikit.util.*

@JsModule("uikit")
@JsNonModule
external val UIkit: UIKit

external interface UIKit : UIKitComponent {
    val util: UIKitUtil
    val prefix: String
    val data: String
    val options: dynamic
    val version: String

    fun use(plugin: Plugin): UIKit
    fun mixin(mixin: dynamic = definedExternally, component: String? = definedExternally)
    fun extend(options: dynamic = definedExternally): dynamic
    fun update(element: UIKitElement? = definedExternally, e: Event? = definedExternally)

    fun component(name: String? = definedExternally, options: dynamic = definedExternally)
    fun getComponents(element: UIKitElement? = definedExternally): UIKitElement
    fun getComponent(element: UIKitElement? = definedExternally, name: String): dynamic
    fun connect(node: UIKitNode? = definedExternally)
    fun disconnect(node: UIKitNode)
}

external interface UIKitUtil : AjaxUtil, AnimationUtil, AttrUtil, ClassUtil, DimensionsUtil, DomUtil, EnvUtil,
    EventUtil, FastDomUtil, FilterUtil, LangUtil, MouseUtil, OptionsUtil, PlayerUtil, PositionUtil, PromiseUtil,
    SelectorUtil, StyleUtil, ViewportUtil

typealias UIKitElement = Any /* String | Node | Element | HTMLElement */
typealias UIKitNode = Any /* Node | Element | HTMLElement */

@JsModule("uikit/dist/js/uikit-icons")
@JsNonModule
external val Icons: Plugin

typealias Plugin = (uikit: UIKit) -> UIKit
