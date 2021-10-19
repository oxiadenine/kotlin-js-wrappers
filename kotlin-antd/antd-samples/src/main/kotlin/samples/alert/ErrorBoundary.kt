package samples.alert

import antd.MouseEventHandler
import antd.alert.errorBoundary
import antd.button.button
import react.*
import styled.css
import styled.styledDiv

private val throwError = fc<Props> {
    val (error, setError) = useState<Error?>(null)

    val handleClick: MouseEventHandler<Any> = {
        setError(Error("An Uncaught Error"))
    }

    if (error != null) {
        throw error
    }

    button {
        attrs {
            type = "danger"
            onClick = handleClick
        }
        +"Click me to throw a error"
    }
}

fun RBuilder.throwError() = child(throwError)


fun RBuilder.errorBoundary() {
    styledDiv {
        css { +AlertStyles.errorBoundary }
        errorBoundary {
            throwError()
        }
    }
}
