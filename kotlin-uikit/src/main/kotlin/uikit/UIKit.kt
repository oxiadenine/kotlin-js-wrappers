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
    fun update(element: UIkitElement? = definedExternally, e: Event? = definedExternally)

    fun component(name: String? = definedExternally, options: dynamic = definedExternally)
    fun getComponents(element: UIkitElement? = definedExternally): UIkitElement
    fun getComponent(element: UIkitElement? = definedExternally, name: String): dynamic
    fun connect(node: UIkitNode? = definedExternally)
    fun disconnect(node: UIkitNode)
}

external interface UIKitUtil : AjaxUtil, AnimationUtil, AttrUtil, ClassUtil, DimensionsUtil, DomUtil, EnvUtil,
    EventUtil, FastDomUtil, FilterUtil, LangUtil, MouseUtil, OptionsUtil, PlayerUtil, PositionUtil, PromiseUtil,
    SelectorUtil, StyleUtil, ViewportUtil

typealias UIkitElement = Any /* String | Node | Element | HTMLElement */
typealias UIkitNode = Any /* Node | Element | HTMLElement */

@JsModule("uikit/dist/js/uikit-icons")
@JsNonModule
external val Icons: Plugin

typealias Plugin = (uikit: UIKit) -> UIKit
