@file:JsModule("antd/lib/popover")
@file:JsNonModule

package antd.popover

import antd.RefAttributes
import antd.tooltip.*
import react.*

@JsName("default")
external object PopoverComponent : Component<PopoverProps, State> {
    override fun render(): ReactElement?
}

external interface PopoverProps : AbstractTooltipProps, RefAttributes<dynamic>, RProps {
    var title: Any? /* ReactNode | RenderFunction */
    var content: Any? /* ReactNode | RenderFunction */
}
