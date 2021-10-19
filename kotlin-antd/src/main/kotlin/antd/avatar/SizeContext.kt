package antd.avatar

import react.*

external val sizeContextProvider: ComponentClass<SizeContextProps>

external val sizeContext: Context<AvatarSize>

external interface SizeContextProps : Props {
    var size: AvatarSize?
}
