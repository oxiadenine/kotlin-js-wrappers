package uikit

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
    fun mixin(element: dynamic, component: dynamic = definedExternally)
    fun extend(options: dynamic = definedExternally): dynamic
    fun update(element: dynamic = definedExternally, e: dynamic = definedExternally)

    fun component(name: String, options: dynamic = definedExternally)
    fun getComponents(element: dynamic = definedExternally): dynamic
    fun getComponent(element: dynamic = definedExternally, name: String): dynamic
    fun connect(node: dynamic = definedExternally)
    fun disconnect(node: dynamic)
}

@JsModule("uikit/dist/js/uikit-icons")
@JsNonModule
external val Icons: Plugin

typealias Plugin = (uikit: UIKit) -> UIKit
