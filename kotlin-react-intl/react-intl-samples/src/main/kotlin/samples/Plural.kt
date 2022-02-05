package samples

import react.*
import react.dom.html.ReactHTML.button
import reactintl.components.plural.FormattedPlural
import reactintl.components.provider.IntlProvider

val Plural = FC<Props> {
    val (dogs, setDogs) = useState(1)

    IntlProvider {
        locale = "en"
        defaultLocale = "en"
        FormattedPlural {
            value = dogs
            one = ReactNode("I have a unique dog")
            other = ReactNode("I have $dogs dogs")
        }
        button {
            onClick = { setDogs(dogs + 1) }
            +"Add dogs"
        }
    }
}
