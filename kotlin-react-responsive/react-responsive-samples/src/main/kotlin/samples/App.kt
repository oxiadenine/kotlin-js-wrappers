package samples

import csstype.*
import react.*
import react.css.css
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1

val App = FC<Props> {
    div {
        css {
            padding = 10.px
            textAlign = TextAlign.center
        }
        h1 { +"Examples" }
    }
    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            padding = 10.px
            children.apply {
                margin = 20.px
            }
        }
        WithHooks()
        WithComponents()
    }
}
