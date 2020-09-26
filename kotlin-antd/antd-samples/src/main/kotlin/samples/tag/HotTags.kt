package samples.tag

import antd.tag.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val tagsFromServer = arrayOf("Movies", "Books", "Music", "Sports")

interface HotTagsAppState : RState {
    var selectedTags: Array<String>
}

class HotTagsApp : RComponent<RProps, HotTagsAppState>() {
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
    styledDiv {
        css { +TagStyles.hotTags }
        hotTagsApp()
    }
}
