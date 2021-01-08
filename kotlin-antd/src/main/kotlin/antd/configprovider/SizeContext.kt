package antd.configprovider

import react.*

external val sizeContext: RContext<SizeType>

external object SizeContextProvider : Component<SizeContextProps, RState> {
    override fun render(): ReactElement?
}

external interface SizeContextProps : RProps {
    var size: SizeType?
}
