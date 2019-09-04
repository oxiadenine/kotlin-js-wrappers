package antd.configprovider

import react.RClass
import react.ReactElement

typealias RenderEmptyHandler = (componentName: String?) -> ReactElement

typealias IReactComponent<P> = RClass<P>
