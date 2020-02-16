package samples.tag

import antd.tag.checkableTag
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.div
import react.dom.h6
import react.dom.jsStyle

private val tagsFromServer = arrayOf("Movies", "Books", "Music", "Sports")

interface HotTagsAppState : RState {
    var selectedTags: Array<String>
}

class HotTagsApp : RComponent<RProps, HotTagsAppState>() {
    private val handleChange = fun (tag: String, checked: Boolean) {
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
            h6 {
                attrs.jsStyle = js {
                    marginRight = 8
                    display = "inline"
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
    div("tag-container") {
        attrs.id = "tag-hot-tags"
        hotTagsApp()
    }
}
