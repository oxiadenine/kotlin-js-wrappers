@file:JsModule("antd/lib/tag")
@file:JsNonModule

package antd.tag

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

@JsName("default")
external object TagComponent : Component<TagProps, State> {
    val CheckableTag: CheckableTagComponent

    override fun render(): ReactElement?
}

external interface TagProps : HTMLAttributes<HTMLDivElement>, RefAttributes<HTMLElement>, Props {
    var prefixCls: String?
    override var className: String?
    override var color: dynamic /* LiteralUnion<Any /* PresetColorType | PresetStatusColorType */, String> */
    var closable: Boolean?
    var closeIcon: ReactNode?
    var visible: Boolean?
    var onClose: ((e: MouseEvent<HTMLElement>) -> Unit)?
    override var style: dynamic
    var icon: ReactNode?
}
