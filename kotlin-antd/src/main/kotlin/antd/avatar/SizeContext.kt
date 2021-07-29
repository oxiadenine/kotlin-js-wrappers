package antd.avatar

import react.*

external val sizeContextProvider: ComponentClass<SizeContextProps>

external val sizeContext: Context<AvatarSize>

external interface SizeContextProps : RProps {
    var size: AvatarSize?
}
