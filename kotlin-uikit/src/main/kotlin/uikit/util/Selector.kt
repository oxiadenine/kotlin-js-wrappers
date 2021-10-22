package uikit.util

external interface SelectorUtil {
    fun query(selector: String? = definedExternally, context: dynamic = definedExternally): dynamic
    fun queryAll(selector: String? = definedExternally, context: dynamic = definedExternally): dynamic
    fun find(selector: String? = definedExternally, context: dynamic = definedExternally): dynamic
    fun findAll(selector: String? = definedExternally, context: dynamic = definedExternally): dynamic
    fun escape(css: dynamic = definedExternally): dynamic
}
