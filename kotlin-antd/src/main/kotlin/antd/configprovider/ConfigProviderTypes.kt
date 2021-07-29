package antd.configprovider

import antd.ReactNode
import react.*

typealias SizeType = String /* "small" | "middle" | "large" */
typealias DirectionType = String /* "ltr" | "rtl" */
typealias RenderEmptyHandler = (componentName: String?) -> ReactNode

typealias IReactComponent<P> = ComponentClass<P>
