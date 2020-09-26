@file:JsModule("antd/lib/tag")
@file:JsNonModule

package antd.tag

import antd.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object TagComponent : Component<TagProps, TagState> {
    val CheckableTag: CheckableTagComponent

    override fun render(): ReactElement?
}

external interface TagProps : HTMLAttributes<HTMLDivElement>, RProps {
    var prefixCls: String?
    override var className: String?
    override var color: String?
    var closable: Boolean?
    var visible: Boolean?
    var onClose: Function<Unit>?
    var afterClose: Function<Unit>?
    override var style: dynamic
}

external interface TagState : RState {
    var visible: Boolean
}
