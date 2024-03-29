package samples.tag

import antd.tag.checkableTag
import kotlinx.css.Display
import kotlinx.css.display
import kotlinx.css.marginRight
import kotlinx.css.px
import react.*
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledH6

private val tagsFromServer = arrayOf("Movies", "Books", "Music", "Sports")

external interface HotTagsAppState : State {
    var selectedTags: Array<String>
}

class HotTagsApp : RComponent<Props, HotTagsAppState>() {
    private val handleChange = fun(tag: String, checked: Boolean) {
        val nextSelectedTags = if (checked) {
            state.selectedTags.plus(tag)
        } else {
            state.selectedTags.filter { t -> t != tag }.toTypedArray()
        }

        console.log("You are interested in: ", nextSelectedTags)

        setState {
            selectedTags = nextSelectedTags
        }
    }

    override fun HotTagsAppState.init() {
        selectedTags = emptyArray()
    }

    override fun RBuilder.render() {
        div {
            styledH6 {
                css {
                    marginRight = 8.px
                    display = Display.inline
                }
                +"Categories"
            }
            tagsFromServer.map { tag ->
                checkableTag {
                    attrs {
                        key = tag
                        checked = state.selectedTags.indexOf(tag) > -1
                        onChange = { checked -> handleChange(tag, checked) }
                    }
                    +tag
                }
            }
        }
    }
}

fun RBuilder.hotTagsApp() = child(HotTagsApp::class) {}

fun RBuilder.hotTags() {
    styledDiv {
        css { +TagStyles.hotTags }
        hotTagsApp()
    }
}
