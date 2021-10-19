package antd.configprovider

import react.*

external val sizeContext: Context<SizeType>

external object SizeContextProvider : Component<SizeContextProps, State> {
    override fun render(): ReactElement?
}

external interface SizeContextProps : Props {
    var size: SizeType?
}
