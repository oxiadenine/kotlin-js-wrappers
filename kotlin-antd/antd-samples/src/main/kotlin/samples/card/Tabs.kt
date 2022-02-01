package samples.card

import antd.card.card
import kotlinext.js.js
import kotlinext.js.jso
import react.*
import react.dom.a
import react.dom.br
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

private val cardTabList = arrayOf(
    js {
        key = "tab1"
        tab = "tab1"
    },
    js {
        key = "tab2"
        tab = "tab2"
    }
)

private val contentList = js {
    tab1 = buildElement {
        p { +"content1" }
    }
    tab2 = buildElement {
        p { +"content2" }
    }
}

private val cardTabListNoTitle = arrayOf(
    js {
        key = "article"
        tab = "article"
    },
    js {
        key = "app"
        tab = "app"
    },
    js {
        key = "project"
        tab = "project"
    }
)

private val contentListNoTitle = js {
    article = buildElement {
        p { +"article content" }
    }
    app = buildElement {
        p { +"app content" }
    }
    project = buildElement {
        p { +"project content" }
    }
}

external interface TabsCardState : State {
    var key: String
    var noTitleKey: String
}

class TabsCard : RComponent<Props, TabsCardState>() {
    private val handleTabChange = fun(key: String, type: String) {
        console.log(key, type)

        val newState: dynamic = jso<TabsCardState> {}

        newState[type] = key

        setState(newState.unsafeCast<TabsCardState>())
    }

    override fun TabsCardState.init() {
        key = "tab1"
        noTitleKey = "app"
    }

    override fun RBuilder.render() {
        div {
            card {
                attrs {
                    style = js { width = "100%" }
                    title = "Card title"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                    tabList = cardTabList
                    activeTabKey = state.key
                    onTabChange = { key ->
                        handleTabChange(key, "key")
                    }
                }
                childList.add(contentList[state.key].unsafeCast<ReactNode>())
            }
            br {}
            br {}
            card {
                attrs {
                    style = js { width = "100%" }
                    tabList = cardTabListNoTitle
                    activeTabKey = state.noTitleKey
                    onTabChange = { key ->
                        handleTabChange(key, "noTitleKey")
                    }
                }
                childList.add(contentListNoTitle[state.noTitleKey].unsafeCast<ReactNode>())
            }
        }
    }
}

fun RBuilder.tabsCard() = child(TabsCard::class) {}

fun RBuilder.tabs() {
    styledDiv {
        css { +CardStyles.tabs }
        tabsCard()
    }
}
