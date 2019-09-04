@file:JsModule("antd/lib/mentions")

package antd.mentions

import antd.FocusEventHandler
import antd.TextareaHTMLAttributes
import org.w3c.dom.HTMLTextAreaElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object MentionsComponent : Component<MentionsProps, MentionState> {
    val Option: OptionComponent

    fun getMentions(value: String = definedExternally, config: MentionsConfig? = definedExternally): Array<MentionsEntity>

    override fun render(): ReactElement?
}

external interface MentionsProps : RcMentionProps, RProps {
    var loading: Boolean?
}

external interface MentionState : RState {
    var focused: Boolean
}

external interface RcMentionProps : TextareaHTMLAttributes<HTMLTextAreaElement> {
    override var autoFocus: Boolean?
    override var className: String?
    var defvaultValue: String?
    var notFoundContent: Any? /* String | ReactElement */
    var split: String?
    override var style: dynamic
    var transitionName: String?
    var placement: MentionPlacement?
    override var prefix: dynamic /* String | Array<String> */
    var prefixCls: String?
    override var value: Any?
    var filterOption: Any? /* Boolean | FilterOption */
    var validateSearch: ValidateSearch?
    override var onChange: dynamic /* ChangeEventHandler<HTMLTextAreaElement>? */
    override var onSelect: dynamic /* ((option: OptionProps, prefix: String) -> Unit)? */
    var onSearch: ((text: String, prefix: String) -> Unit)?
    override var onFocus: FocusEventHandler<HTMLTextAreaElement>?
    override var onBlur: FocusEventHandler<HTMLTextAreaElement>?
}

external interface MentionsConfig {
    var prefix: Any? /* String | Array<String> */
    var split: String?
}

external interface MentionsEntity {
    var prefix: String
    var value: String
}
