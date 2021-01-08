package antd.configprovider

import react.*

typealias SizeType = String? /* "small" | "middle" | "large" */
typealias DirectionType = String? /* "ltr" | "rtl" */
typealias RenderEmptyHandler = (componentName: String?) -> ReactElement

typealias IReactComponent<P> = RClass<P>
