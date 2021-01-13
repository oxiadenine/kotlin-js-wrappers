package antd.avatar

import react.RClass
import react.RContext
import react.RProps

external val sizeContextProvider: RClass<SizeContextProps>

external val sizeContext: RContext<AvatarSize>

external interface SizeContextProps : RProps {
    var size: AvatarSize?
}
