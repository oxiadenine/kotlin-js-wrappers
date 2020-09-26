package samples.mention

import antd.button.*
import antd.mention.*
import antd.popover.*
import kotlinext.js.*
import org.w3c.dom.*
import react.*
import styled.*

private fun handleChange(contentState: Any) {
    console.log(MentionComponent.toString(contentState, jsObject { }))
}

private fun handleSelect(suggestion: String, data: Any?) {
    console.log("onSelect", suggestion)
}

class PopoverContainer : RComponent<RProps, RState>() {
    private var mention: dynamic = null
    private var popover: dynamic = null

    private val getSuggestionContainer = fun(_: Element): HTMLElement {
        return popover.getPopupDomNode().unsafeCast<HTMLElement>()
    }

    private val visibleChange = fun(visible: Boolean) {
        if (visible && mention != null) {
            mention.focus()
        }
    }

    override fun RBuilder.render() {
        val contentMention = buildElement {
            mention {
                ref { node -> mention = node }
                attrs {
                    style = js { width = "100%" }
                    onChange = ::handleChange
                    defaultValue = MentionComponent.toContentState("@afc163")
                    suggestions = arrayOf("afc163", "benjycui", "yiminghe", "RaoHai", "中文", "にほんご")
                    onSelect = ::handleSelect
                    getSuggestionContainer = getSuggestionContainer
                }
            }
        }

        popover {
            ref { node -> popover = node }
            attrs {
                trigger = "click"
                content = contentMention
                title = buildElement { +"Title" }
                onVisibleChange = visibleChange
            }
            button {
                attrs.type = "primary"
                +"Click Me"
            }
        }
    }
}

fun RBuilder.popoverContainer() = child(PopoverContainer::class) {}

fun RBuilder.popupContainer() {
    styledDiv {
        css { +MentionStyles.popupContainer }
        popoverContainer()
    }
}
