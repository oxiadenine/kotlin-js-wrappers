@file:JsModule("antd/lib/mentions")
@file:JsNonModule

package antd.mentions

import antd.*
import antd.input.TextAreaProps
import org.w3c.dom.*
import react.*

@JsName("default")
external object MentionsComponent : Component<MentionsProps, RState> {
    val Option: OptionComponent

    fun getMentions(value: String = definedExternally, config: MentionsConfig? = definedExternally): Array<MentionsEntity>

    override fun render(): ReactElement?
}

external interface MentionsProps : RcMentionsProps, RefAttributes<dynamic>, RProps {
    var loading: Boolean?
}

external interface RcMentionsProps : TextAreaProps {
    override var autoFocus: Boolean?
    override var className: String?
    var defvaultValue: String?
    var notFoundContent: ReactNode?
    var split: String?
    override var style: dynamic
    var transitionName: String?
    var placement: Placement?
    var direction: Direction?
    override var prefix: dynamic /* String | Array<String> */
    override var prefixCls: String?
    override var value: Any?
    var filterOption: Any? /* Boolean | FilterOption */
    var validateSearch: ValidateSearch?
    override var onChange: dynamic /* (text: String) -> Unit */
    override var onSelect: dynamic /* (option: OptionProps, prefix: String) -> Unit */
    var onSearch: ((text: String, prefix: String) -> Unit)?
    override var onFocus: FocusEventHandler<HTMLTextAreaElement>?
    override var onBlur: FocusEventHandler<HTMLTextAreaElement>?
    var getPopupContainer: (() -> HTMLElement)?
}

external interface MentionsConfig {
    var prefix: Any? /* String | Array<String> */
    var split: String?
}

external interface MentionsEntity {
    var prefix: String
    var value: String
}
