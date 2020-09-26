package samples.mention

import antd.avatar.*
import antd.mention.*
import kotlinext.js.*
import react.*
import styled.*

private val webFrameworks = arrayOf(
    js {
        name = "React"
        type = "JavaScript"
        icon = "https://zos.alipayobjects.com/rmsportal/LFIeMPzdLcLnEUe.svg"
    },
    js {
        name = "Angular"
        type = "JavaScript"
        icon = "https://zos.alipayobjects.com/rmsportal/PJTbxSvzYWjDZnJ.png"
    },
    js {
        name = "Dva"
        type = "JavaScript"
        icon = "https://zos.alipayobjects.com/rmsportal/EYPwSeEJKxDtVxI.png"
    },
    js {
        name = "Flask"
        type = "Python"
        icon = "https://zos.alipayobjects.com/rmsportal/xaypBUijfnpAlXE.png"
    }
)

interface AvatarNavMentionState : RState {
    var suggestions: Array<Any>
}

class AvatarNavMention : RComponent<RProps, AvatarNavMentionState>() {
    private val handleSearchChange = fun(searchValue: String, _: String) {
        val filtered = webFrameworks.filter { item ->
            item.name.unsafeCast<String>().toLowerCase().contains(searchValue.toLowerCase())
        }
        val suggestionList = filtered.map { suggestion ->
            buildElement {
                nav {
                    attrs {
                        value = suggestion.name.unsafeCast<String>()
                        data = suggestion.unsafeCast<Any>()
                        disabled = suggestion.disabled.unsafeCast<Boolean>()
                    }
                    avatar {
                        attrs {
                            src = suggestion.icon.unsafeCast<String>()
                            size = "small"
                            style = js {
                                width = 14
                                height = 14
                                marginRight = 8
                                top = 2
                                position = "relative"
                            }
                        }
                    }
                    +"${suggestion.name} - ${suggestion.type}"
                }
            }
        }.toTypedArray()

        setState {
            suggestions = suggestionList.unsafeCast<Array<Any>>()
        }
    }

    override fun AvatarNavMentionState.init() {
        suggestions = emptyArray()
    }

    override fun RBuilder.render() {
        mention {
            attrs {
                style = js { width = "100%" }
                suggestions = state.suggestions
                onSearchChange = handleSearchChange
            }
        }
    }
}

fun RBuilder.avatarNavMention() = child(AvatarNavMention::class) {}

fun RBuilder.avatar() {
    styledDiv {
        css { +MentionStyles.avatar }
        avatarNavMention()
    }
}
