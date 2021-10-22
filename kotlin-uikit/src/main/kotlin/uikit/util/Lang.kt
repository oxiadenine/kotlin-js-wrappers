package uikit.util

import uikit.UIkitElement
import uikit.UIkitNode

external interface LangUtil {
    val hyphenate: (str: String) -> String
    val camelize: (str: String) -> String
    val ucfirst: (str: String) -> String

    val toArray: (value: Any) -> Array<Any>
    val assign: (target: dynamic, args: Array<dynamic>) -> dynamic

    val dimensions: Dimensions

    fun hasOwn(obj: dynamic = definedExternally, key: String? = definedExternally): Boolean
    fun startsWith(str: String? = definedExternally, search: String? = definedExternally): Boolean
    fun endsWith(str: String? = definedExternally, search: String? = definedExternally): Boolean
    fun includes(obj: dynamic = definedExternally, search: String? = definedExternally): Boolean
    fun findIndex(array: Array<Any>? = definedExternally, predicate: dynamic = definedExternally): Number

    fun isFunction(obj: dynamic = definedExternally): Boolean
    fun isObject(obj: dynamic = definedExternally): Boolean
    fun isPlainObject(obj: dynamic = definedExternally): Boolean
    fun isWindow(obj: dynamic = definedExternally): Boolean
    fun isDocument(obj: dynamic = definedExternally): Boolean
    fun isNode(obj: dynamic = definedExternally): Boolean
    fun isElement(obj: dynamic = definedExternally): Boolean
    fun nodeType(obj: dynamic = definedExternally): Boolean
    fun isBoolean(value: Any? = definedExternally): Boolean
    fun isString(value: Any? = definedExternally): Boolean
    fun isNumber(value: Any? = definedExternally): Boolean
    fun isNumeric(value: Any? = definedExternally): Boolean
    fun isEmpty(obj: dynamic = definedExternally): Boolean
    fun isUndefined(value: dynamic = definedExternally): Boolean

    fun toBoolean(value: Any? = definedExternally): Boolean
    fun toNumber(value: Any? = definedExternally): Any /* Number | Boolean */
    fun toFloat(value: Any? = definedExternally): Number
    fun toNode(element: UIkitElement? = definedExternally): UIkitNode
    fun toNodes(element: UIkitElement? = definedExternally): Array<UIkitNode>
    fun toWindow(element: UIkitElement? = definedExternally): dynamic
    fun toMs(time: Any? /* String | Number */ = definedExternally): Number

    fun isEqual(value: dynamic = definedExternally, other: dynamic = definedExternally): Boolean
    fun swap(
        value: dynamic = definedExternally,
        a: dynamic = definedExternally,
        b: dynamic = definedExternally
    ): dynamic

    fun last(array: Array<dynamic>): dynamic
    fun each(obj: dynamic, cb: dynamic): Boolean
    fun sortBy(array: Array<dynamic>, prop: dynamic): Number
    fun uniqueBy(array: Array<dynamic>, prop: dynamic): Boolean
    fun clamp(
        number: Number? = definedExternally,
        min: Number? = definedExternally,
        max: Number? = definedExternally
    ): Number

    fun noop()
    fun intersectRect(vararg rects: dynamic): Boolean
    fun pointInRect(point: dynamic, rect: dynamic): Boolean
    fun getIndex(
        i: Number? = definedExternally,
        elements: Array<UIkitElement>? = definedExternally,
        current: Number? = definedExternally,
        finite: Boolean? = definedExternally
    ): Number

    fun memoize(fn: dynamic): dynamic
}

external interface Dimensions {
    fun ratio(dimensions: dynamic, prop: dynamic, value: dynamic): dynamic
    fun contain(dimensions: dynamic = definedExternally, maxDimensions: dynamic): dynamic
    fun cover(dimensions: dynamic = definedExternally, maxDimensions: dynamic = definedExternally): dynamic
}
