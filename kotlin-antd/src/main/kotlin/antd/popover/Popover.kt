@file:JsModule("antd/lib/popover")
@file:JsNonModule

package antd.popover

import antd.tooltip.*
import react.*

@JsName("default")
external object PopoverComponent : Component<PopoverProps, RState> {
    override fun render(): ReactElement?
}

external interface PopoverProps : AbstractTooltipProps, RProps {
    var title: Any? /* String | ReactElement | RenderFunction */
    var content: Any? /* String | ReactElement | RenderFunction */
}
