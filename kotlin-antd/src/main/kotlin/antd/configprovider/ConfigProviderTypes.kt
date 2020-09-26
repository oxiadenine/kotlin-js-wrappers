package antd.configprovider

import react.*

typealias RenderEmptyHandler = (componentName: String?) -> ReactElement

typealias IReactComponent<P> = RClass<P>
