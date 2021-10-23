package samples

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.button
import reactintl.components.plural.formattedPlural
import reactintl.components.provider.intlProvider

private val app = fc<Props> {
    val (dogs, setDogs) = useState(1)

    intlProvider {
        attrs {
            locale = "en"
            defaultLocale = "en"
        }
        formattedPlural {
            attrs {
                value = dogs
                one = ReactNode("I have a unique dog")
                other = ReactNode("I have $dogs dogs")
            }
        }
        button {
            attrs.onClickFunction = { setDogs(dogs + 1) }
            +"Add dogs"
        }
    }
}

fun RBuilder.plural() = child(app)
